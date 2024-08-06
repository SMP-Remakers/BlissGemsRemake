package com.hyperdondon.blissgemsremake.api;

import com.hyperdondon.blissgemsremake.blissgems;
import net.md_5.bungee.api.ChatColor;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.persistence.PersistentDataType;
import org.jetbrains.annotations.Nullable;
import org.mineacademy.fo.Common;

import java.util.Objects;
import java.util.UUID;

public class Gem {;

    private String id;
    private GemType type;
    private int tier;
    private Energy energy;
    private boolean allowdrop;
    private boolean allowremove;
    private int season;



    public Energy getEnergy() {
        return energy;
    }

    @Nullable
    public String getID() {
        return id;
    }

    public GemType getType() {
        return type;
    }

    public boolean getDrop() {
        return allowdrop;
    }

    public boolean getRemove() {
        return allowremove;
    }

    public int getTier() {
        return tier;
    }

    public int getSeason() {
        return season;
    }






    public void setEnergy(Energy e) {
        energy = e;
    }

    @Nullable
    public void setID(String i) {
        id = i;
    }

    public void setType(GemType gt) {
        type = gt;
    }

    public void setDrop(boolean d) {
        allowdrop = d;
    }

    public void setRemove(boolean r) {
        allowremove = r;
    }

    public void setTier(int t) {
        tier = t;
    }

    public void setSeason(int s) {
        season = s;
    }



    public static Gem fromGemItem(ItemStack gem) {
        ItemMeta itemMeta = gem.getItemMeta();


        Gem gem2 = new Gem();

        //Pris+5
        if (gem.getItemMeta().getLore().contains(Common.colorize("#57FFC7") + "Pristine" + ChatColor.WHITE + " + " + Common.colorize("#96FFD9") + "5")) {
            gem2.energy = Energy.Pristine_5;
            gem2.season = 2;
        }


        //Pris+4
        else if (gem.getItemMeta().getLore().contains(Common.colorize("#57FFC7") + "Pristine" + ChatColor.WHITE + " + " + Common.colorize("#96FFD9") + "4")) {
            gem2.energy = Energy.Pristine_4;
            gem2.season = 2;
        }


        //Pris+3
        else if (gem.getItemMeta().getLore().contains(Common.colorize("#57FFC7") + "Pristine" + ChatColor.WHITE + " + " + Common.colorize("#96FFD9") + "3")) {
            gem2.energy = Energy.Pristine_3;
            gem2.season = 2;
        }


        //Pris+2
        else if (gem.getItemMeta().getLore().contains(Common.colorize("#57FFC7") + "Pristine" + ChatColor.WHITE + " + " + Common.colorize("#96FFD9") + "2")) {
            gem2.energy = Energy.Pristine_2;
            gem2.season = 2;
        }


        //Pris+1
        else if (gem.getItemMeta().getLore().contains(Common.colorize("#57FFC7") + "Pristine" + ChatColor.WHITE + " + " + Common.colorize("#96FFD9") + "1")) {
            gem2.energy = Energy.Pristine_1;
            gem2.season = 2;
        }


        //Pris
        else if (gem.getItemMeta().getLore().contains(Common.colorize("#57FFC7") + "Pristine")) {
            gem2.energy = Energy.Pristine;
            gem2.season = 2;
        }


        //Scratched
        else if (gem.getItemMeta().getLore().contains(Common.colorize("#57FF8F") + "Scratched")) {
            gem2.energy = Energy.Scratched;
            gem2.season = 2;
        }


        //Cracked
        else if (gem.getItemMeta().getLore().contains(Common.colorize("#7958DB") + "Cracked")) {
            gem2.energy = Energy.Cracked;
            gem2.season = 2;
        }


        //Damaged
        else if (gem.getItemMeta().getLore().contains(Common.colorize("#FFC929") + "Damaged")) {
            gem2.energy = Energy.Damaged;
            gem2.season = 2;
        }


        //Ruined
        else if (gem.getItemMeta().getLore().contains(Common.colorize("#FF1111") + "Ruined")) {
            gem2.energy = Energy.Ruined;
            gem2.season = 2;
        }


        //Pris+5
        else if (gem.getItemMeta().getLore().contains(Common.colorize("&f(") + Common.colorize("#57FFC7") + "Pristine" + ChatColor.WHITE + " + " + Common.colorize("#96FFD9") + "5" + Common.colorize("&f)"))) {
            gem2.energy = Energy.Pristine_5;
            gem2.season = 3;
        }


        //Pris+4
        else if (gem.getItemMeta().getLore().contains(Common.colorize("&f(") + Common.colorize("#57FFC7") + "Pristine" + ChatColor.WHITE + " + " + Common.colorize("#96FFD9") + "4" + Common.colorize("&f)"))) {
            gem2.energy = Energy.Pristine_4;
            gem2.season = 3;
        }


        //Pris+3
        else if (gem.getItemMeta().getLore().contains(Common.colorize("&f(") + Common.colorize("#57FFC7") + "Pristine" + ChatColor.WHITE + " + " + Common.colorize("#96FFD9") + "3" + Common.colorize("&f)"))) {
            gem2.energy = Energy.Pristine_3;
            gem2.season = 3;
        }


        //Pris+2
        else if (gem.getItemMeta().getLore().contains(Common.colorize("&f(") + Common.colorize("#57FFC7") + "Pristine" + ChatColor.WHITE + " + " + Common.colorize("#96FFD9") + "2" + Common.colorize("&f)"))) {
            gem2.energy = Energy.Pristine_2;
            gem2.season = 3;
        }


        //Pris+1
        else if (gem.getItemMeta().getLore().contains(Common.colorize("&f(") + Common.colorize("#57FFC7") + "Pristine" + ChatColor.WHITE + " + " + Common.colorize("#96FFD9") + "1" + Common.colorize("&f)"))) {
            gem2.energy = Energy.Pristine_1;
            gem2.season = 3;
        }


        //Pris
        else if (gem.getItemMeta().getLore().contains(Common.colorize("&f(") + Common.colorize("#57FFC7") + "Pristine" + Common.colorize("&f)"))) {
            gem2.energy = Energy.Pristine;
            gem2.season = 3;
        }


        //Scratched
        else if (gem.getItemMeta().getLore().contains(Common.colorize("&f(") + Common.colorize("#57FF8F") + "Scratched" + Common.colorize("&f)"))) {
            gem2.energy = Energy.Scratched;
            gem2.season = 3;
        }


        //Cracked
        else if (gem.getItemMeta().getLore().contains(Common.colorize("&f(") + Common.colorize("#7958DB") + "Cracked" + Common.colorize("&f)"))) {
            gem2.energy = Energy.Cracked;
            gem2.season = 3;
        }


        //Damaged
        else if (gem.getItemMeta().getLore().contains(Common.colorize("&f(") + Common.colorize("#FFC929") + "Damaged" + Common.colorize("&f)"))) {
            gem2.energy = Energy.Damaged;
            gem2.season = 3;
        }


        //Ruined
        else if (gem.getItemMeta().getLore().contains(Common.colorize("&f(") + Common.colorize("#FF1111") + "Ruined" + Common.colorize("&f)"))) {
            gem2.energy = Energy.Ruined;
            gem2.season = 3;
        }


        //Broken
        else if (gem.getItemMeta().getLore().contains(ChatColor.WHITE + "" + ChatColor.BOLD + "ᴜsᴇʟᴇss")) {
            gem2.energy = Energy.Broken;
            if (gem.getItemMeta().getCustomModelData() == 99 || gem.getItemMeta().getCustomModelData() == 100) {
                gem2.season = 3;
            }
            if (gem.getItemMeta().getCustomModelData() == 95 || gem.getItemMeta().getCustomModelData() == 96) {
                gem2.season = 2;
            }
        }

        //N/A
        else {
            gem2.energy = Energy.N_A;
            gem2.season = 1;
        }

        String id3 = "";
        String id2 = "";
        int tier2 = 1;
        int drop2 = 1;
        int remove2 = 1;
        String type2 = "";

        if (gem2.season == 1) {
            NamespacedKey idkey2 = new NamespacedKey(blissgems.getInstance(), "shard_id");
            id3 = itemMeta.getPersistentDataContainer().get(idkey2, PersistentDataType.STRING);
        }

        if (gem2.season == 2 || gem2.season == 3) {
        NamespacedKey idkey = new NamespacedKey(blissgems.getInstance(), "gem-id");
        id2 = itemMeta.getPersistentDataContainer().get(idkey, PersistentDataType.STRING);

        NamespacedKey tierkey = new NamespacedKey(blissgems.getInstance(), "gem-tier");
        tier2 = itemMeta.getPersistentDataContainer().get(tierkey, PersistentDataType.INTEGER);

        NamespacedKey typekey = new NamespacedKey(blissgems.getInstance(), "gem-type");
        type2 = itemMeta.getPersistentDataContainer().get(typekey, PersistentDataType.STRING);

        NamespacedKey quicknodropkey = new NamespacedKey(blissgems.getInstance(), "quick-no-drop");
        drop2 = itemMeta.getPersistentDataContainer().get(quicknodropkey, PersistentDataType.INTEGER);

        NamespacedKey quicknoremovekey = new NamespacedKey(blissgems.getInstance(), "quick-no-remove");
        remove2 = itemMeta.getPersistentDataContainer().get(quicknoremovekey, PersistentDataType.INTEGER);
        }

        if (gem2.season == 1) {
            gem2.id = id3;
        }

        else {
            gem2.id = id2;
            gem2.tier = tier2;
        }


        if (gem2.season != 1) {
            if (Objects.equals(type2, "life")) {
                gem2.type = GemType.Life;
            } else if (Objects.equals(type2, "strength")) {
                gem2.type = GemType.Strength;
            } else if (Objects.equals(type2, "fire")) {
                gem2.type = GemType.Fire;
            } else if (Objects.equals(type2, "speed")) {
                gem2.type = GemType.Speed;
            } else if (Objects.equals(type2, "wealth")) {
                gem2.type = GemType.Wealth;
            } else if (Objects.equals(type2, "astra")) {
                gem2.type = GemType.Astra;
            } else if (Objects.equals(type2, "puff")) {
                gem2.type = GemType.Puff;
            } else if (Objects.equals(type2, "flux")) {
                gem2.type = GemType.Flux;
            } else if (Objects.equals(type2, "gold")) {
                gem2.type = GemType.Gold;
            }
        } else {
            if (gem.getType() == Material.AMETHYST_SHARD) {
                gem2.tier = 1;
            }
            else {
                gem2.tier = 2;
            }
            gem2.allowremove = false;
            gem2.allowdrop = false;
            if (gem.getItemMeta().getDisplayName().contains(Common.colorize("#FE04B4") + ChatColor.BOLD + "Life " + Common.colorize("#FFD773") + "Gem") || gem.getItemMeta().getDisplayName().contains(Common.colorize("#FE04B4") + ChatColor.BOLD + "Life " + Common.colorize("#C7C7C7") + "Gem")) {
                gem2.type = GemType.Life;
            } else if (gem.getItemMeta().getDisplayName().contains(Common.colorize("#F10303") + "Strength " + Common.colorize("#FFD773") + "Gem") || gem.getItemMeta().getDisplayName().contains(Common.colorize("#F10303") + ChatColor.BOLD + "Strength " + Common.colorize("#C7C7C7") + "Gem")) {
                gem2.type = GemType.Strength;
            } else if (gem.getItemMeta().getDisplayName().contains(Common.colorize("#FE8120") + ChatColor.BOLD + "Fire " + Common.colorize("#FFD773") + "Gem") || gem.getItemMeta().getDisplayName().contains(Common.colorize("#FE8120") + ChatColor.BOLD + "Fire " + Common.colorize("#C7C7C7") + "Gem")) {
                gem2.type = GemType.Fire;
            } else if (gem.getItemMeta().getDisplayName().contains(Common.colorize("#FEFD17") + ChatColor.BOLD + "Speed " + Common.colorize("#FFD773") + "Gem") || gem.getItemMeta().getDisplayName().contains(Common.colorize("#FEFD17") + ChatColor.BOLD + "Speed " + Common.colorize("#C7C7C7") + "Gem")) {
                gem2.type = GemType.Speed;
            } else if (gem.getItemMeta().getDisplayName().contains(Common.colorize("#0EC912") + ChatColor.BOLD + "Wealth " + Common.colorize("#FFD773") + "Gem") || gem.getItemMeta().getDisplayName().contains(Common.colorize("#0EC912") + ChatColor.BOLD + "Wealth " + Common.colorize("#C7C7C7") + "Gem")) {
                gem2.type = GemType.Wealth;
            } else if (gem.getItemMeta().getDisplayName().contains(Common.colorize("#EFEFEF") + ChatColor.BOLD + "Puff Gem")) {
                gem2.type = GemType.Puff;
            }
        }






        if (drop2 == 1) {
            gem2.allowdrop = true;
        }

        else {
            gem2.allowdrop = false;
        }





        if (remove2 == 1) {
            gem2.allowremove = true;
        }

        else {
            gem2.allowremove = false;
        }


        return gem2;
    }





    @Nullable
    public ItemStack toItemStack() {
        int allowremoveint;
        int allowdropint;

        if (allowremove) {
            allowremoveint = 1;
        }

        else  {
            allowremoveint = 0;
        }



        if (allowdrop) {
            allowdropint = 1;
        }

        else  {
            allowdropint = 0;
        }

        ItemStack item = GetGemItem.returngem(type, tier, energy, allowdropint, allowremoveint, season);
        ItemMeta itemMeta = item.getItemMeta();


        if (season == 2 || season == 3) {
            NamespacedKey idkey = new NamespacedKey(blissgems.getInstance(), "gem-id");
            itemMeta.getPersistentDataContainer().set(idkey, PersistentDataType.STRING, id);
        } else if (season == 1)  {
            NamespacedKey idkey = new NamespacedKey(blissgems.getInstance(), "shard_id");
            itemMeta.getPersistentDataContainer().set(idkey, PersistentDataType.STRING, id);
        }

        item.setItemMeta(itemMeta);


        return item;
    }



    public static boolean isPristineorHigher(Energy en) {
        if (en == Energy.Pristine || en == Energy.Pristine_1 || en == Energy.Pristine_2 || en == Energy.Pristine_3 || en == Energy.Pristine_4 || en == Energy.Pristine_5) {
            return true;
        }

        else {
            return false;
        }
    }


    public static Gem GemConstructor(GemType gemtype, int tier, Energy energy) {
        int allowremoveint;
        int allowdropint;

        if (Settings.getAllowRemove()) {
            allowremoveint = 1;
        }

        else  {
            allowremoveint = 0;
        }



        if (Settings.getAllowDrop()) {
            allowdropint = 1;
        }

        else  {
            allowdropint = 0;
        }

        return (Gem.fromGemItem(GetGemItem.returngem(gemtype, tier, energy, allowdropint, allowremoveint, Settings.getSeason())));
    }


    public static Gem GemConstructor(GemType gemtype, int tier, Energy energy, int allowdropint) {
        int allowremoveint;

        if (Settings.getAllowRemove()) {
            allowremoveint = 1;
        }

        else  {
            allowremoveint = 0;
        }

        return (Gem.fromGemItem(GetGemItem.returngem(gemtype, tier, energy, allowdropint, allowremoveint, Settings.getSeason())));
    }


    public static Gem GemConstructor(GemType gemtype, int tier, Energy energy, int allowdropint, int allowremoveint) {
        return (Gem.fromGemItem(GetGemItem.returngem(gemtype, tier, energy, allowdropint, allowremoveint, Settings.getSeason())));
    }


    public static Gem GemConstructor(GemType gemtype, int tier, Energy energy, int allowdropint, int allowremoveint, int season) {
        return (Gem.fromGemItem(GetGemItem.returngem(gemtype, tier, energy, allowdropint, allowremoveint, season)));
    }



}
