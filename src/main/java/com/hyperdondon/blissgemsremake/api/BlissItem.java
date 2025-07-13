package com.hyperdondon.blissgemsremake.api;

import java.util.UUID;

public class BlissItem {
    private BlissItemType type;
    private String id;
    private String energySource;
    private SeasonSupport seasonSupport;

    public static BlissItem ItemConstructor(BlissItemType type, SeasonSupport season) {
        BlissItem item = new BlissItem();
        item.setType(type);
        if (type == BlissItemType.Energy) {
            item.setId(UUID.randomUUID().toString());
            item.setEnergySource("None");
        }
        return item;
    }

    public BlissItemType getType() {
        return type;
    }

    public void setType(BlissItemType type) {
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEnergySource() {
        return energySource;
    }

    public void setEnergySource(String energySource) {
        this.energySource = energySource;
    }

    public SeasonSupport getSeasonSupport() {
        return seasonSupport;
    }

    public void setSeasonSupport(SeasonSupport seasonSupport) {
        this.seasonSupport = seasonSupport;
    }
}
