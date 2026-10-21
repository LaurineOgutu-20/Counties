package com.example.counties;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.chip.ChipGroup;

import java.util.List;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    private CountyAdapter adapter;
    private EditText etSearch;
    private ImageView ivClearSearch;
    private ChipGroup chipGroupRegion;
    private LinearLayout emptyStateLayout;
    private TextView tvSubtitle;

    private String currentSearchQuery = "";
    private String currentSelectedRegion = "All";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        initViews();
    }

    private void initViews() {
        etSearch = findViewById(R.id.etSearch);
        ivClearSearch = findViewById(R.id.ivClearSearch);
        chipGroupRegion = findViewById(R.id.chipGroupRegion);
        emptyStateLayout = findViewById(R.id.emptyStateLayout);
        tvSubtitle = findViewById(R.id.tvSubtitle);

        RecyclerView rvCounties = findViewById(R.id.rvCounties);
        rvCounties.setLayoutManager(new LinearLayoutManager(this));

        List<County> allCounties = CountyRepository.getAllCounties();
        adapter = new CountyAdapter(this, allCounties, this::openCountyDetail);
        rvCounties.setAdapter(adapter);

        updateSubtitle(allCounties.size());

        // Setup search input listener
        etSearch.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                currentSearchQuery = s != null ? s.toString() : "";
                ivClearSearch.setVisibility(currentSearchQuery.isEmpty() ? View.GONE : View.VISIBLE);
                applyFilter();
            }

            @Override
            public void afterTextChanged(Editable s) {}
        });

        ivClearSearch.setOnClickListener(v -> etSearch.setText(""));

        // Setup Region Chip Selection with explicit ID mapping
        chipGroupRegion.setOnCheckedStateChangeListener((group, checkedIds) -> {
            if (checkedIds == null || checkedIds.isEmpty()) {
                currentSelectedRegion = "All";
            } else {
                int checkedId = checkedIds.get(0);
                if (checkedId == R.id.chipCoast) {
                    currentSelectedRegion = "Coast";
                } else if (checkedId == R.id.chipRiftValley) {
                    currentSelectedRegion = "Rift Valley";
                } else if (checkedId == R.id.chipCentral) {
                    currentSelectedRegion = "Central";
                } else if (checkedId == R.id.chipEastern) {
                    currentSelectedRegion = "Eastern";
                } else if (checkedId == R.id.chipNyanza) {
                    currentSelectedRegion = "Nyanza";
                } else if (checkedId == R.id.chipWestern) {
                    currentSelectedRegion = "Western";
                } else if (checkedId == R.id.chipNorthEastern) {
                    currentSelectedRegion = "North Eastern";
                } else if (checkedId == R.id.chipNairobi) {
                    currentSelectedRegion = "Nairobi";
                } else {
                    currentSelectedRegion = "All";
                }
            }
            applyFilter();
        });
    }

    private void applyFilter() {
        if (adapter != null) {
            adapter.filter(currentSearchQuery, currentSelectedRegion);
            int count = adapter.getDisplayedCount();
            emptyStateLayout.setVisibility(count == 0 ? View.VISIBLE : View.GONE);
            updateSubtitle(count);
        }
    }

    private void updateSubtitle(int count) {
        if (tvSubtitle != null) {
            if (count == 47) {
                tvSubtitle.setText(R.string.app_subtitle);
            } else {
                tvSubtitle.setText(String.format(Locale.getDefault(), "Showing %d of 47 Counties", count));
            }
        }
    }

    private void openCountyDetail(County county) {
        if (county == null) return;
        Intent intent = new Intent(this, CountyDetailActivity.class);
        intent.putExtra(CountyDetailActivity.EXTRA_COUNTY_ID, county.getId());
        startActivity(intent);
    }
}
