package com.example.counties;

import java.io.Serializable;

public class County implements Serializable {
    private final int id;
    private final String code;
    private final String name;
    private final String capital;
    private final String region;
    private final String economicActivities;
    private final String attractions;
    private final String description;

    public County(int id, String code, String name, String capital, String region,
                  String economicActivities, String attractions, String description) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.capital = capital;
        this.region = region;
        this.economicActivities = economicActivities;
        this.attractions = attractions;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public String getCapital() {
        return capital;
    }

    public String getRegion() {
        return region;
    }

    public String getEconomicActivities() {
        return economicActivities;
    }

    public String getAttractions() {
        return attractions;
    }

    public String getDescription() {
        return description;
    }
}
