package com.hyperdondon.blissgemsremake.api;

import com.hyperdondon.blissgemsremake.blissgems;
import lombok.Getter;
import lombok.Setter;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.persistence.PersistentDataType;
import org.jetbrains.annotations.Nullable;
import org.mineacademy.fo.Common;

import java.util.*;

import static java.util.Objects.isNull;
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
        boolean allowremovebool = Settings.isRemovingAllowed();
        boolean allowdropint = Settings.isDroppingAllowed();

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
        boolean allowremovebool = Settings.isRemovingAllowed();
        boolean allowdropbool = Settings.isDroppingAllowed();

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

        gem2.energy = (Energy) getGemInfo(gem).get(0);
        gem2.season = (int) getGemInfo(gem).get(1);
        gem2.type = getGemType(gem);
        gem2.id = getGemID(gem).toString();
        gem2.tier = getGemTier(gem);
        gem2.allowdrop = getGemAllowDrop(gem);
        gem2.allowremove = getGemAllowRemove(gem);


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
        return (en == Energy.N_A || en == Energy.Pristine || en == Energy.Pristine_1 || en == Energy.Pristine_2 || en == Energy.Pristine_3 || en == Energy.Pristine_4 || en == Energy.Pristine_5);
    }

    /**
     * @deprecated Please use the built-in constructor, Gem mygem = new Gem(arguments here). Constructs a gem using information you have passed.
     */
    @Deprecated
    public static Gem GemConstructor(GemType gemtype, int tier, Energy energy) {
        int allowremoveint;
        int allowdropint;

        if (Settings.isRemovingAllowed())
            allowremoveint = 1;
        else
            allowremoveint = 0;


        if (Settings.isDroppingAllowed())
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
        
        if (Settings.isRemovingAllowed())
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
    public static void giveGem(Gem gem, Player p, boolean silent, int tier) {
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
    public static ArrayList<Object> getGemInfo(ItemStack gem) {
        if (!isGem(gem)) {
            Common.log(RED + "What have been passed to GemGemInfo is not a gem!");
            return null;
        }
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
     * Get whether the gem is allowed to be removed from the player's inventory
     */
    public static boolean getGemAllowRemove(ItemStack gem) {
        if (!isGem(gem)) {
            Common.log(RED + "What have been passed to GemGemAllowRemove is not a gem!");
            return false;
        }
        NamespacedKey tierkey = new NamespacedKey(blissgems.getInstance(), "quick-no-remove");
        if (gem.getItemMeta().getPersistentDataContainer().has(tierkey, PersistentDataType.STRING)) {
            boolean allow = false;
            if (gem.getItemMeta().getPersistentDataContainer().get(tierkey, PersistentDataType.INTEGER) == 1)
                allow = true;
            return allow;
        } else
            return false;
    }

    /**
     * Get whether the gem is allowed to be dropped
     */
    public static boolean getGemAllowDrop(ItemStack gem) {
        if (!isGem(gem)) {
            Common.log(RED + "What have been passed to GemGemAllowDrop is not a gem!");
            return false;
        }
        NamespacedKey tierkey = new NamespacedKey(blissgems.getInstance(), "quick-no-drop");
        if (gem.getItemMeta().getPersistentDataContainer().has(tierkey, PersistentDataType.STRING)) {
            boolean allow = false;
            if (gem.getItemMeta().getPersistentDataContainer().get(tierkey, PersistentDataType.INTEGER) == 1)
                allow = true;
            return allow;
        } else
            return false;
    }

    /**
     * Get the tier of a gem
     */
    public static int getGemTier(ItemStack gem) {
        if (!isGem(gem)) {
            Common.log(RED + "What have been passed to GemGemTier is not a gem!");
            return 0;
        }
        NamespacedKey tierkey = new NamespacedKey(blissgems.getInstance(), "gem-tier");
        if (gem.getItemMeta().getPersistentDataContainer().has(tierkey, PersistentDataType.STRING))
            return gem.getItemMeta().getPersistentDataContainer().get(tierkey, PersistentDataType.INTEGER);
        else if (gem.getType() == Material.PRISMARINE_SHARD)
            return 2;
        else
            return 1;
    }

    /**
     * Get the ID of a gem
     */
    public static UUID getGemID(ItemStack gem) {
        if (!isGem(gem)) {
            Common.log(RED + "What have been passed to GemGemID is not a gem!");
            return null;
        }
        NamespacedKey idkey = new NamespacedKey(blissgems.getInstance(), "gem-id");
        if (!gem.getItemMeta().getPersistentDataContainer().has(idkey, PersistentDataType.STRING))
            idkey = new NamespacedKey(blissgems.getInstance(), "shard_id");
        return UUID.fromString(gem.getItemMeta().getPersistentDataContainer().get(idkey, PersistentDataType.STRING));
    }

    /**
     * Get the ID of a gem
     */
    public static String getGemID(ItemStack gem, Player p) {
        if (!isGem(gem)) {
            Common.log(RED + "What have been passed to GemGemID is not a gem!");
            return null;
        }
        if (getGemSeason(gem) == 1)
            return p.getUniqueId().toString() + ":" + Gem.getGemType(gem) + ":Tier" + Gem.getGemTier(gem);
        NamespacedKey idkey = new NamespacedKey(blissgems.getInstance(), "gem-id");
        if (!gem.getItemMeta().getPersistentDataContainer().has(idkey, PersistentDataType.STRING))
            idkey = new NamespacedKey(blissgems.getInstance(), "shard_id");

        return gem.getItemMeta().getPersistentDataContainer().get(idkey, PersistentDataType.STRING);
    }

    /**
     * Get the energy of a gem
     */
    public static Energy getGemEnergy(ItemStack gem) {
        if (!isGem(gem)) {
            Common.log(RED + "What have been passed to GemGemEnergy is not a gem!");
            return null;
        }
        return (Energy) getGemInfo(gem).get(0);
    }

    /**
     * Get the season of a gem
     */
    public static int getGemSeason(ItemStack gem) {
        if (!isGem(gem)) {
            Common.log(RED + "What have been passed to GemGemSeason is not a gem!");
            return 0;
        }
        return (int) getGemInfo(gem).get(1);
    }

    /**
     * Get the type of a gem
     */
    public static GemType getGemType(ItemStack gem) {
        if (!isGem(gem)) {
            Common.log(RED + "What have been passed to GemGemType is not a gem!");
            return null;
        }
        GemType type = null;
        String type2 = "";
        int season = getGemSeason(gem);

        if (season == 2 || season == 3) {
            NamespacedKey typekey = new NamespacedKey(blissgems.getInstance(), "gem-type");
            type2 = gem.getItemMeta().getPersistentDataContainer().get(typekey, PersistentDataType.STRING).toLowerCase();
        }
        if (season != 1) {
            if (Objects.equals(type2, "life")) type = GemType.Life;
            else if (Objects.equals(type2, "strength")) type = GemType.Strength;
            else if (Objects.equals(type2, "fire")) type = GemType.Fire;
            else if (Objects.equals(type2, "speed")) type = GemType.Speed;
            else if (Objects.equals(type2, "wealth")) type = GemType.Wealth;
            else if (Objects.equals(type2, "astra")) type = GemType.Astra;
            else if (Objects.equals(type2, "puff")) type = GemType.Puff;
            else if (Objects.equals(type2, "flux")) type = GemType.Flux;
            else if (Objects.equals(type2, "gold")) type = GemType.Gold;
        } else if (gem.getItemMeta().getDisplayName().contains(Common.colorize("#FE04B4") + BOLD + "Life " + Common.colorize("#FFD773") + "Gem") || gem.getItemMeta().getDisplayName().contains(Common.colorize("#FE04B4") + BOLD + "Life " + Common.colorize("#C7C7C7") + "Gem"))
            type = GemType.Life;
        else if (gem.getItemMeta().getDisplayName().contains(Common.colorize("#F10303") + "Strength " + Common.colorize("#FFD773") + "Gem") || gem.getItemMeta().getDisplayName().contains(Common.colorize("#F10303") + BOLD + "Strength " + Common.colorize("#C7C7C7") + "Gem"))
            type = GemType.Strength;
        else if (gem.getItemMeta().getDisplayName().contains(Common.colorize("#FE8120") + BOLD + "Fire " + Common.colorize("#FFD773") + "Gem") || gem.getItemMeta().getDisplayName().contains(Common.colorize("#FE8120") + BOLD + "Fire " + Common.colorize("#C7C7C7") + "Gem"))
            type = GemType.Fire;
        else if (gem.getItemMeta().getDisplayName().contains(Common.colorize("#FEFD17") + BOLD + "Speed " + Common.colorize("#FFD773") + "Gem") || gem.getItemMeta().getDisplayName().contains(Common.colorize("#FEFD17") + BOLD + "Speed " + Common.colorize("#C7C7C7") + "Gem"))
            type = GemType.Speed;
        else if (gem.getItemMeta().getDisplayName().contains(Common.colorize("#0EC912") + BOLD + "Wealth " + Common.colorize("#FFD773") + "Gem") || gem.getItemMeta().getDisplayName().contains(Common.colorize("#0EC912") + BOLD + "Wealth " + Common.colorize("#C7C7C7") + "Gem"))
            type = GemType.Wealth;
        else if (gem.getItemMeta().getDisplayName().contains(WHITE + "" + BOLD + "Puff Gem"))
            type = GemType.Puff;
        return type;
    }

    /**
     * Checks if the player has a gem.
     */
    public static boolean hasAGem(Player p) {
        for (ItemStack item : p.getInventory().getContents()) if (!isNull(item) && isGem(item)) return true;
        return false;
    }

    /**
     * Returns the player's energy.
     */
    public static Energy getPlayerEnergy(Player p) {
        for (ItemStack item : p.getInventory().getContents())
            if (!isNull(item) && isGem(item)) return getGemEnergy(item);
        return Energy.N_A;
    }

    /**
     * Returns the type of the first gem inside the player's inventory. If it returns null, it means the player doesn't have a gem.
     */
    public static GemType getPlayerGemType(Player p) {
        for (ItemStack item : p.getInventory().getContents()) if (!isNull(item) && isGem(item)) return getGemType(item);
        return null;
    }

    /**
     * Returns the first gem inside the player's inventory. If it returns null, it means the player doesn't have a gem.
     */
    public static ItemStack getPlayerGem(Player p) {
        for (ItemStack item : p.getInventory().getContents()) if (!isNull(item) && isGem(item)) return item;
        Common.log(RED + p.getName() + " doesn't have a gem!");
        return null;
    }

    public static boolean isGem(ItemStack gem) {
        NamespacedKey idkeys2 = new NamespacedKey(blissgems.getInstance(), "gem-id");
        if (isNull(gem)) return false;
        if (!gem.hasItemMeta()) return false;
        if (!gem.getItemMeta().getPersistentDataContainer().has(idkeys2, PersistentDataType.STRING)) {
            NamespacedKey idkeys1 = new NamespacedKey(blissgems.getInstance(), "shard_id");
            return gem.getItemMeta().getPersistentDataContainer().has(idkeys1, PersistentDataType.STRING);
        }
        return true;
    }
}
