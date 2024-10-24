package com.hyperdondon.blissgemsremake.api;

import com.hyperdondon.blissgemsremake.blissgems;
import lombok.Getter;
import lombok.Setter;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.persistence.PersistentDataType;
import org.jetbrains.annotations.Nullable;
import org.mineacademy.fo.Common;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

import static net.md_5.bungee.api.ChatColor.*;

@Getter
@Setter
public class Gem {

    private String id;
    private GemType type;
    private int tier;
    private Energy energy;
    private boolean allowdrop;
    private boolean allowremove;
    private int season;


    /**
     * Internal Use only!
     */
    private Gem() {

    }

    //Constructors

    /**
     * Constructs a gem using information you have passed.
     */
    public Gem(GemType gemtype, int gemtier, Energy gemenergy) {
        boolean allowremovebool = Settings.getAllowRemove();
        boolean allowdropint = Settings.getAllowDrop();

        id = UUID.randomUUID().toString();
        type = gemtype;
        tier = gemtier;
        energy = gemenergy;
        allowremove = allowremovebool;
        allowdrop = allowdropint;
        season = Settings.getSeason();
    }


    /**
     * Constructs a gem using information you have passed.
     */
    public Gem(GemType gemtype, int gemtier, Energy gemenergy, boolean allowremovebool, boolean allowdropbool) {
        id = UUID.randomUUID().toString();
        type = gemtype;
        tier = gemtier;
        energy = gemenergy;
        allowremove = allowremovebool;
        allowdrop = allowdropbool;
        season = Settings.getSeason();
    }

    /**
     * Constructs a gem using information you have passed.
     */
    public Gem(GemType gemtype, int gemtier, Energy gemenergy, boolean allowremovebool, boolean allowdropbool, int gemseason) {
        id = UUID.randomUUID().toString();
        type = gemtype;
        tier = gemtier;
        energy = gemenergy;
        allowremove = allowremovebool;
        allowdrop = allowdropbool;
        season = gemseason;
    }

    /**
     * Constructs a gem using information you have passed.
     */
    public Gem(GemType gemtype, int gemtier, Energy gemenergy, int gemseason) {
        boolean allowremovebool = Settings.getAllowRemove();
        boolean allowdropbool = Settings.getAllowDrop();

        id = UUID.randomUUID().toString();
        type = gemtype;
        tier = gemtier;
        energy = gemenergy;
        allowremove = allowremovebool;
        allowdrop = allowdropbool;
        season = gemseason;
    }


    /**
     * Returns a Gem using the values from an ItemStack that should be a gem.
     */
    public static Gem fromGemItem(ItemStack gem) {
        ItemMeta itemMeta = gem.getItemMeta();


        Gem gem2 = new Gem();

        gem2.energy = (Energy) GetGemInfo(gem).get(1);
        gem2.season = (int) GetGemInfo(gem).get(2);

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
        if (gem2.season == 1)
            gem2.id = id3;
        else {
            gem2.id = id2;
            gem2.tier = tier2;
        }
        if (gem2.season != 1) {
            if (Objects.equals(type2, "life")) gem2.type = GemType.Life;
            else if (Objects.equals(type2, "strength")) gem2.type = GemType.Strength;
            else if (Objects.equals(type2, "fire")) gem2.type = GemType.Fire;
            else if (Objects.equals(type2, "speed")) gem2.type = GemType.Speed;
            else if (Objects.equals(type2, "wealth")) gem2.type = GemType.Wealth;
            else if (Objects.equals(type2, "astra")) gem2.type = GemType.Astra;
            else if (Objects.equals(type2, "puff")) gem2.type = GemType.Puff;
            else if (Objects.equals(type2, "flux")) gem2.type = GemType.Flux;
            else if (Objects.equals(type2, "gold")) gem2.type = GemType.Gold;
        } else {
            if (gem.getType() == Material.AMETHYST_SHARD)
                gem2.tier = 1;
            else
                gem2.tier = 2;

            gem2.allowremove = false;
            gem2.allowdrop = false;
            if (gem.getItemMeta().getDisplayName().contains(Common.colorize("#FE04B4") + BOLD + "Life " + Common.colorize("#FFD773") + "Gem") || gem.getItemMeta().getDisplayName().contains(Common.colorize("#FE04B4") + BOLD + "Life " + Common.colorize("#C7C7C7") + "Gem"))
                gem2.type = GemType.Life;
            else if (gem.getItemMeta().getDisplayName().contains(Common.colorize("#F10303") + "Strength " + Common.colorize("#FFD773") + "Gem") || gem.getItemMeta().getDisplayName().contains(Common.colorize("#F10303") + BOLD + "Strength " + Common.colorize("#C7C7C7") + "Gem"))
                gem2.type = GemType.Strength;
            else if (gem.getItemMeta().getDisplayName().contains(Common.colorize("#FE8120") + BOLD + "Fire " + Common.colorize("#FFD773") + "Gem") || gem.getItemMeta().getDisplayName().contains(Common.colorize("#FE8120") + BOLD + "Fire " + Common.colorize("#C7C7C7") + "Gem"))
                gem2.type = GemType.Fire;
            else if (gem.getItemMeta().getDisplayName().contains(Common.colorize("#FEFD17") + BOLD + "Speed " + Common.colorize("#FFD773") + "Gem") || gem.getItemMeta().getDisplayName().contains(Common.colorize("#FEFD17") + BOLD + "Speed " + Common.colorize("#C7C7C7") + "Gem"))
                gem2.type = GemType.Speed;
            else if (gem.getItemMeta().getDisplayName().contains(Common.colorize("#0EC912") + BOLD + "Wealth " + Common.colorize("#FFD773") + "Gem") || gem.getItemMeta().getDisplayName().contains(Common.colorize("#0EC912") + BOLD + "Wealth " + Common.colorize("#C7C7C7") + "Gem"))
                gem2.type = GemType.Wealth;
            else if (gem.getItemMeta().getDisplayName().contains(WHITE + "" + BOLD + "Puff Gem"))
                gem2.type = GemType.Puff;
        }


        gem2.allowdrop = (drop2 == 1);


        gem2.allowremove = (remove2 == 1);


        //Bukkit.broadcastMessage(gem2.type.toString());
        return gem2;
    }


    /**
     * Turns your Gem to an ItemStack using the information given.
     */
    @Nullable
    public ItemStack toItemStack() {
        int allowremoveint;
        int allowdropint;

        if (allowremove)
            allowremoveint = 1;
        else
            allowremoveint = 0;


        if (allowdrop)
            allowdropint = 1;
        else
            allowdropint = 0;


        ItemStack item = GetGemItem.returngem(type, tier, energy, allowdropint, allowremoveint, season);
        ItemMeta itemMeta = item.getItemMeta();


        if (season == 2 || season == 3) {
            NamespacedKey idkey = new NamespacedKey(blissgems.getInstance(), "gem-id");
            itemMeta.getPersistentDataContainer().set(idkey, PersistentDataType.STRING, id);
        } else if (season == 1) {
            NamespacedKey idkey = new NamespacedKey(blissgems.getInstance(), "shard_id");
            itemMeta.getPersistentDataContainer().set(idkey, PersistentDataType.STRING, id);
        }

        item.setItemMeta(itemMeta);


        return item;
    }

    /**
     * Checks if the energy that is given is Energy.Pristine or higher.
     */
    public static boolean isPristineorHigher(Energy en) {
        return (en == Energy.Pristine || en == Energy.Pristine_1 || en == Energy.Pristine_2 || en == Energy.Pristine_3 || en == Energy.Pristine_4 || en == Energy.Pristine_5);
    }

    /**
     * @deprecated Please use the built-in constructor, Gem mygem = new Gem(arguments here). Constructs a gem using information you have passed.
     */
    @Deprecated
    public static Gem GemConstructor(GemType gemtype, int tier, Energy energy) {
        int allowremoveint;
        int allowdropint;

        if (Settings.getAllowRemove())
            allowremoveint = 1;
        else
            allowremoveint = 0;


        if (Settings.getAllowDrop())
            allowdropint = 1;
        else
            allowdropint = 0;

        return (Gem.fromGemItem(Objects.requireNonNull(GetGemItem.returngem(gemtype, tier, energy, allowdropint, allowremoveint, Settings.getSeason()))));
    }

    /**
     * @deprecated Please use the built-in constructor, Gem mygem = new Gem(arguments here). Constructs a gem using information you have passed.
     */
    @Deprecated
    public static Gem GemConstructor(GemType gemtype, int tier, Energy energy, int allowdropint) {
        int allowremoveint;

        if (Settings.getAllowRemove())
            allowremoveint = 1;
        else
            allowremoveint = 0;


        return (Gem.fromGemItem(Objects.requireNonNull(GetGemItem.returngem(gemtype, tier, energy, allowdropint, allowremoveint, Settings.getSeason()))));
    }

    /**
     * @deprecated Please use the built-in constructor, Gem mygem = new Gem(arguments here). Constructs a gem using information you have passed.
     */
    @Deprecated
    public static Gem GemConstructor(GemType gemtype, int tier, Energy energy, int allowdropint, int allowremoveint) {
        return (Gem.fromGemItem(Objects.requireNonNull(GetGemItem.returngem(gemtype, tier, energy, allowdropint, allowremoveint, Settings.getSeason()))));
    }

    /**
     * @deprecated Please use the built-in constructor, Gem mygem = new Gem(arguments here). Constructs a gem using information you have passed.
     */
    @Deprecated
    public static Gem GemConstructor(GemType gemtype, int tier, Energy energy, int allowdropint, int allowremoveint, int season) {
        return (Gem.fromGemItem(Objects.requireNonNull(GetGemItem.returngem(gemtype, tier, energy, allowdropint, allowremoveint, season))));
    }

    /**
     * Gives a player the Gem you provided as an item.
     */
    public static void GiveGem(Gem gem, Player p, boolean silent, int tier) {
        if (!silent) {
            String gemmessage = "N/A";
            if (gem.type == GemType.Strength)
                gemmessage = blissgems.colorize("#F10303&lsᴛʀᴇɴɢᴛʜ");
            else if (gem.type == GemType.Speed)
                gemmessage = blissgems.colorize("#FEFD17&lsᴘᴇᴇᴅ");
            else if (gem.type == GemType.Life)
                gemmessage = blissgems.colorize("#FE04B4&lʟɪғᴇ");
            else if (gem.type == GemType.Puff)
                gemmessage = blissgems.colorize("#EFEFEF&lᴘᴜғғ");
            else if (gem.type == GemType.Astra)
                gemmessage = blissgems.colorize("#A01FFF&lᴀsᴛʀᴀ");
            else if (gem.type == GemType.Flux)
                gemmessage = blissgems.colorize("#5ED7FF&lғʟᴜx");
            else if (gem.type == GemType.Fire)
                gemmessage = blissgems.colorize("#FE8120&lғɪʀᴇ");
            else if (gem.type == GemType.Wealth)
                gemmessage = blissgems.colorize("#0EC912&lᴡᴇᴀʟᴛʜ");

            p.sendMessage(Common.colorize("#FFD773🔮 #B8FFFBYou have received a " + gemmessage + "#B8FFFB gem &7Tier &b" + tier));
        }
        p.getInventory().addItem(gem.toItemStack());


    }

    /**
     * Returns an ArrayList. The object in the first index is the energy, the second index is the season
     */
    public static ArrayList<Object> GetGemInfo(ItemStack gem) {
        ArrayList<Object> list = new ArrayList<Object>();
        for (int i = 1; i != 6; i++)
            if (gem.getItemMeta().getLore().contains(Common.colorize("#57FFC7") + "Pristine" + WHITE + " + " + Common.colorize("#96FFD9") + i)) {
                list.add(Energy.valueOf("Pristine_" + i));
                list.add(2);
            }
        //Pris
        if (gem.getItemMeta().getLore().contains(Common.colorize("#57FFC7") + "Pristine")) {
            list.add(Energy.Pristine);
            list.add(2);
        }
        //Scratched
        else if (gem.getItemMeta().getLore().contains(Common.colorize("#57FF8F") + "Scratched")) {
            list.add(Energy.Scratched);
            list.add(2);
        }
        //Cracked
        else if (gem.getItemMeta().getLore().contains(Common.colorize("#7958DB") + "Cracked")) {
            list.add(Energy.Cracked);
            list.add(2);
        }
        //Damaged
        else if (gem.getItemMeta().getLore().contains(Common.colorize("#FFC929") + "Damaged")) {
            list.add(Energy.Damaged);
            list.add(2);
        }
        //Ruined
        else if (gem.getItemMeta().getLore().contains(Common.colorize("#FF1111") + "Ruined")) {
            list.add(Energy.Ruined);
            list.add(2);
        }

        if (!list.isEmpty()) return list;

        for (int i = 1; i != 6; i++)
            if (gem.getItemMeta().getLore().contains(Common.colorize("&f(") + Common.colorize("#57FFC7") + "Pristine" + WHITE + " + " + Common.colorize("#96FFD9") + i + ")") ||
                    gem.getItemMeta().getLore().contains(Common.colorize("&f(") + Common.colorize("#57FFC7") + "Pristine" + WHITE + " + " + Common.colorize("#96FFD9") + i + Common.colorize("&7)")) ||
                    gem.getItemMeta().getLore().contains(Common.colorize("&f(") + Common.colorize("#57FFC7") + "Pristine" + WHITE + " + " + Common.colorize("#96FFD9") + i + Common.colorize("&7) "))) {
                list.add(Energy.valueOf("Pristine_" + i));
                list.add(3);
            }

        //Pris
        if (gem.getItemMeta().getLore().contains(Common.colorize("&f(") + Common.colorize("#57FFC7") + "Pristine" + Common.colorize("&f)")) ||
                gem.getItemMeta().getLore().contains(Common.colorize("&f(") + Common.colorize("#57FFC7") + "Pristine" + Common.colorize("&7)")) ||
                gem.getItemMeta().getLore().contains(Common.colorize("&f(") + Common.colorize("#57FFC7") + "Pristine" + Common.colorize("&7) "))) {
            list.add(Energy.Pristine);
            list.add(3);
        }
        //Scratched
        else if (gem.getItemMeta().getLore().contains(Common.colorize("&f(") + Common.colorize("#57FF8F") + "Scratched" + Common.colorize("&f)")) ||
                gem.getItemMeta().getLore().contains(Common.colorize("&f(") + Common.colorize("#57FF8F") + "Scratched" + Common.colorize("&7)")) ||
                gem.getItemMeta().getLore().contains(Common.colorize("&f(") + Common.colorize("#57FF8F") + "Scratched" + Common.colorize("&7) "))) {
            list.add(Energy.Scratched);
            list.add(3);
        }
        //Cracked
        else if (gem.getItemMeta().getLore().contains(Common.colorize("&f(") + Common.colorize("#7958DB") + "Cracked" + Common.colorize("&f)")) ||
                gem.getItemMeta().getLore().contains(Common.colorize("&f(") + Common.colorize("#7958DB") + "Cracked" + Common.colorize("&7)")) ||
                gem.getItemMeta().getLore().contains(Common.colorize("&f(") + Common.colorize("#7958DB") + "Cracked" + Common.colorize("&7) "))) {
            list.add(Energy.Cracked);
            list.add(3);
        }
        //Damaged
        else if (gem.getItemMeta().getLore().contains(Common.colorize("&f(") + Common.colorize("#FFC929") + "Damaged" + Common.colorize("&f)")) ||
                gem.getItemMeta().getLore().contains(Common.colorize("&f(") + Common.colorize("#FFC929") + "Damaged" + Common.colorize("&7)")) ||
                gem.getItemMeta().getLore().contains(Common.colorize("&f(") + Common.colorize("#FFC929") + "Damaged" + Common.colorize("&7) "))) {
            list.add(Energy.Damaged);
            list.add(3);
        }
        //Ruined
        else if (gem.getItemMeta().getLore().contains(Common.colorize("&f(") + Common.colorize("#FF1111") + "Ruined" + Common.colorize("&f)")) ||
                gem.getItemMeta().getLore().contains(Common.colorize("&f(") + Common.colorize("#FF1111") + "Ruined" + Common.colorize("&7)")) ||
                gem.getItemMeta().getLore().contains(Common.colorize("&f(\"") + Common.colorize("#FF1111") + "Ruined" + Common.colorize("&f\")")) ||
                gem.getItemMeta().getLore().contains(Common.colorize("&f(") + Common.colorize("#FF1111") + "Ruined" + Common.colorize("&7) "))) {
            list.add(Energy.Ruined);
            list.add(3);
        }
        //Broken
        else if (gem.getItemMeta().getLore().contains(WHITE + "" + BOLD + "ᴜsᴇʟᴇss")) {
            list.add(Energy.Broken);
            if (gem.getItemMeta().getCustomModelData() == 99 || gem.getItemMeta().getCustomModelData() == 100)
                list.add(3);
            if (gem.getItemMeta().getCustomModelData() == 95 || gem.getItemMeta().getCustomModelData() == 96)
                list.add(2);
        }

        if (list.isEmpty()) {
            list.add(Energy.N_A);
            list.add(1);
        }
        return list;
    }

    /**
     * Get the energy of the gem
     */
    public static Energy GetGemEnergy(ItemStack gem) {
        return (Energy) GetGemInfo(gem).get(0);
    }

    /**
     * Returns the player's energy.
     */
    public static Energy GetPlayerEnergy(Player p) {
        for (ItemStack item : p.getInventory().getContents()) if (IsGem(item)) return GetGemEnergy(item);
        return Energy.N_A;
    }

    public static boolean IsGem(ItemStack gem) {
        NamespacedKey idkeys2 = new NamespacedKey(blissgems.getInstance(), "gem-id");
        if (!gem.hasItemMeta()) return false;
        if (!gem.getItemMeta().getPersistentDataContainer().has(idkeys2, PersistentDataType.STRING)) {
            NamespacedKey idkeys1 = new NamespacedKey(blissgems.getInstance(), "shard_id");
            return gem.getItemMeta().getPersistentDataContainer().has(idkeys1, PersistentDataType.STRING);
        }
        return true;
    }

}
