package com.example.counties;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class CountyAdapter extends RecyclerView.Adapter<CountyAdapter.CountyViewHolder> {

    public interface OnCountyClickListener {
        void onCountyClick(County county);
    }

    private final Context context;
    private final List<County> fullList;
    private final List<County> displayedList;
    private final OnCountyClickListener listener;

    private String currentQuery = "";
    private String selectedRegion = "All";

    public CountyAdapter(Context context, List<County> counties, OnCountyClickListener listener) {
        this.context = context;
        this.fullList = new ArrayList<>(counties);
        this.displayedList = new ArrayList<>(counties);
        this.listener = listener;
    }

    @NonNull
    @Override
    public CountyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_county, parent, false);
        return new CountyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CountyViewHolder holder, int position) {
        County county = displayedList.get(position);
        holder.bind(county, listener);
    }

    @Override
    public int getItemCount() {
        return displayedList.size();
    }

    public void filter(String query, String region) {
        this.currentQuery = query != null ? query.trim().toLowerCase() : "";
        this.selectedRegion = region != null ? region : "All";

        displayedList.clear();
        for (County c : fullList) {
            boolean matchesRegion = selectedRegion.equalsIgnoreCase("All") || c.getRegion().equalsIgnoreCase(selectedRegion);
            boolean matchesQuery = currentQuery.isEmpty()
                    || c.getName().toLowerCase().contains(currentQuery)
                    || c.getCode().contains(currentQuery)
                    || c.getCapital().toLowerCase().contains(currentQuery)
                    || c.getRegion().toLowerCase().contains(currentQuery);

            if (matchesRegion && matchesQuery) {
                displayedList.add(c);
            }
        }
        notifyDataSetChanged();
    }

    public int getDisplayedCount() {
        return displayedList.size();
    }

    class CountyViewHolder extends RecyclerView.ViewHolder {
        private final TextView tvCountyCode;
        private final TextView tvCountyName;
        private final TextView tvCapital;
        private final TextView tvRegionChip;

        public CountyViewHolder(@NonNull View itemView) {
            super(itemView);
            tvCountyCode = itemView.findViewById(R.id.tvCountyCode);
            tvCountyName = itemView.findViewById(R.id.tvCountyName);
            tvCapital = itemView.findViewById(R.id.tvCapital);
            tvRegionChip = itemView.findViewById(R.id.tvRegionChip);
        }

        public void bind(County county, OnCountyClickListener clickListener) {
            tvCountyCode.setText(county.getCode());
            tvCountyName.setText(county.getName());
            tvCapital.setText(String.format(Locale.getDefault(), "HQ: %s", county.getCapital()));
            tvRegionChip.setText(county.getRegion());

            // Set region badge background dynamically
            int regionColor = getRegionColor(county.getRegion());
            GradientDrawable drawable = new GradientDrawable();
            drawable.setShape(GradientDrawable.RECTANGLE);
            drawable.setCornerRadius(16f);
            drawable.setColor(adjustAlpha(regionColor, 0.15f));
            tvRegionChip.setBackground(drawable);
            tvRegionChip.setTextColor(regionColor);

            itemView.setOnClickListener(v -> {
                if (clickListener != null) {
                    clickListener.onCountyClick(county);
                }
            });
        }

        private int getRegionColor(String region) {
            switch (region) {
                case "Coast":
                    return ContextCompat.getColor(context, R.color.region_coast);
                case "Rift Valley":
                    return ContextCompat.getColor(context, R.color.region_rift_valley);
                case "Central":
                    return ContextCompat.getColor(context, R.color.region_central);
                case "Eastern":
                    return ContextCompat.getColor(context, R.color.region_eastern);
                case "Nyanza":
                    return ContextCompat.getColor(context, R.color.region_nyanza);
                case "Western":
                    return ContextCompat.getColor(context, R.color.region_western);
                case "North Eastern":
                    return ContextCompat.getColor(context, R.color.region_north_eastern);
                case "Nairobi":
                    return ContextCompat.getColor(context, R.color.region_nairobi);
                default:
                    return ContextCompat.getColor(context, R.color.primary);
            }
        }

        private int adjustAlpha(int color, float factor) {
            int alpha = Math.round(Color.alpha(color) * factor);
            int red = Color.red(color);
            int green = Color.green(color);
            int blue = Color.blue(color);
            return Color.argb(alpha, red, green, blue);
        }
    }
}
