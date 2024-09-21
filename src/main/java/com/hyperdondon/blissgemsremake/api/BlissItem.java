package com.hyperdondon.blissgemsremake.api;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class BlissItem {
    private BlissItemType type;
    private String id;
    private String EnergySource;
    private int season;

    public static BlissItem ItemConstructor(BlissItemType type, int season) {
        BlissItem item = new BlissItem();
        item.setType(type);
        if (type == BlissItemType.Energy) {
            item.setId(UUID.randomUUID().toString());
            item.setEnergySource("None");
        }




        return item;
    }



}
