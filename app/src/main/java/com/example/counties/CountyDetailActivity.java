package com.example.counties;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;

import java.util.Locale;

public class CountyDetailActivity extends AppCompatActivity {

    public static final String EXTRA_COUNTY_ID = "extra_county_id";

    private County county;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_county_detail);

        int countyId = getIntent() != null ? getIntent().getIntExtra(EXTRA_COUNTY_ID, 1) : 1;
        county = CountyRepository.getCountyById(countyId);

        if (county == null) {
            Toast.makeText(this, "County data unavailable", Toast.LENGTH_SHORT).show();
            finish();
            return;
        }

        initViews();
    }

    private void initViews() {
        ImageButton btnBack = findViewById(R.id.btnBack);
        TextView tvDetailCountyCode = findViewById(R.id.tvDetailCountyCode);
        TextView tvDetailCountyName = findViewById(R.id.tvDetailCountyName);
        TextView tvDetailHeaderSubtitle = findViewById(R.id.tvDetailHeaderSubtitle);

        TextView tvFactHQ = findViewById(R.id.tvFactHQ);
        TextView tvFactRegion = findViewById(R.id.tvFactRegion);

        TextView tvDescription = findViewById(R.id.tvDescription);
        TextView tvEconomy = findViewById(R.id.tvEconomy);
        TextView tvAttractions = findViewById(R.id.tvAttractions);

        ExtendedFloatingActionButton fabShare = findViewById(R.id.fabShare);

        btnBack.setOnClickListener(v -> finish());

        tvDetailCountyCode.setText(String.format(Locale.getDefault(), "County %s", county.getCode()));
        tvDetailCountyName.setText(county.getName());
        tvDetailHeaderSubtitle.setText(String.format(Locale.getDefault(), "HQ: %s | %s Region", county.getCapital(), county.getRegion()));

        tvFactHQ.setText(county.getCapital());
        tvFactRegion.setText(String.format(Locale.getDefault(), "%s Region", county.getRegion()));

        tvDescription.setText(county.getDescription());
        tvEconomy.setText(county.getEconomicActivities());
        tvAttractions.setText(county.getAttractions());

        fabShare.setOnClickListener(v -> shareCountyDetails());
    }

    private void shareCountyDetails() {
        if (county == null) return;

        String shareText = "Explore " + county.getName() + " County (Code: " + county.getCode() + ")\n\n"
                + "Headquarters: " + county.getCapital() + "\n"
                + "Region: " + county.getRegion() + "\n\n"
                + "About: " + county.getDescription() + "\n\n"
                + "Key Economy: " + county.getEconomicActivities() + "\n\n"
                + "Top Attractions: " + county.getAttractions() + "\n\n"
                + "Shared via Counties of Kenya App";

        Intent sendIntent = new Intent();
        sendIntent.setAction(Intent.ACTION_SEND);
        sendIntent.putExtra(Intent.EXTRA_TEXT, shareText);
        sendIntent.setType("text/plain");

        Intent shareIntent = Intent.createChooser(sendIntent, "Share " + county.getName() + " County");
        startActivity(shareIntent);
    }
}
