package com.hyperdondon.blissgemsremake.internal.item.trader;

import lombok.Getter;
import net.md_5.bungee.api.ChatColor;
import org.bukkit.*;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;


import java.util.*;

import static java.util.Objects.isNull;
import static net.md_5.bungee.api.ChatColor.*;

public class Trader implements Listener {

    @Getter
    private static volatile Trader instance = new Trader();

    public static HashMap<UUID, ArrayList<String>> Gems;
    public static HashMap<UUID, String> CurrentGems;


    public static void OpenGUI(Player p) {
        if (isNull(Gems))
            Gems = new HashMap<>();
        if (isNull(CurrentGems))
            CurrentGems = new HashMap<>();
        Inventory gui = Bukkit.getServer().createInventory(null, 27, ChatColor.of("#A01FFF") + "");
        ResetGemList(p.getUniqueId());
        ItemStack glass = new ItemStack(Material.GRAY_STAINED_GLASS_PANE);
        ItemMeta glassmeta = glass.getItemMeta();
        glassmeta.setDisplayName(ChatColor.GRAY + "");
        glass.setItemMeta(glassmeta);

        for (int i = 0; i < 9; i++)
            gui.setItem(i, glass);

        for (int i = 18; i < 27; i++)
            gui.setItem(i, glass);

        int tier = 1;
        String currentgem = "";
        for (ItemStack item : p.getInventory())
            if (item.hasItemMeta()) {

                if (item.getItemMeta().getDisplayName().contains(ChatColor.of("#EFEFEF") + "" + BOLD + "ᴘᴜғғ "))
                    currentgem = "puff";

                if (item.getItemMeta().getDisplayName().contains(ChatColor.of("#F10303") + "" + BOLD + "sᴛʀᴇɴɢᴛʜ "))
                    currentgem = "strength";

                if (item.getItemMeta().getDisplayName().contains(ChatColor.of("#FE04B4") + "" + BOLD + "ʟɪғᴇ "))
                    currentgem = "life";

                if (item.getItemMeta().getDisplayName().contains(ChatColor.of("#FE8120") + "" + BOLD + "ғɪʀᴇ "))
                    currentgem = "fire";

                if (item.getItemMeta().getDisplayName().contains(ChatColor.of("#0EC912") + "" + BOLD + "ᴡᴇᴀʟᴛʜ "))
                    currentgem = "wealth";

                if (item.getItemMeta().getDisplayName().contains(ChatColor.of("#A01FFF") + "" + BOLD + "ᴀsᴛʀᴀ "))
                    currentgem = "astra";

                if (item.getItemMeta().getDisplayName().contains(ChatColor.of("#5ED7FF") + "" + BOLD + "ғʟᴜx "))
                    currentgem = "flux";

                if (item.getItemMeta().getDisplayName().contains(ChatColor.of("#FEFD17") + "" + BOLD + "sᴘᴇᴇᴅ "))
                    currentgem = "speed";

                if (item.getItemMeta().getDisplayName().contains(ChatColor.of("#C7C7C7") + "ɢᴇᴍ"))
                    break;

                if (item.getItemMeta().getDisplayName().contains(ChatColor.of("#FFD773") + "ɢᴇᴍ")) {
                    tier = 2;
                    break;
                }
            }
        Gems.get(p.getUniqueId()).remove(currentgem);
        Bukkit.broadcastMessage(String.valueOf(Gems.get(p.getUniqueId()).size()));
        /*
        ArrayList<String> gems = Gems.get(p.getUniqueId());
        gems.remove(currentgem);
        Gems.replace(p.getUniqueId(), gems);
        */


        String Tier1 = ChatColor.of("#C7C7C7") + "ɢᴇᴍ";
        String Tier2 = ChatColor.of("#FFD773") + "ɢᴇᴍ";

        String puffname =
                (tier == 2) ?
                        ChatColor.of("#EFEFEF") + "" + BOLD + "ᴘᴜғғ " + Tier2
                        :
                        ChatColor.of("#EFEFEF") + "" + BOLD + "ᴘᴜғғ " + Tier1;
        int PuffNormalCMD = (tier == 2) ? 6 : 5;
        int PuffGUICMD = (tier == 2) ? 106 : 105;

        String astraname =
                (tier == 2) ?
                        ChatColor.of("#A01FFF") + "" + BOLD + "ᴀsᴛʀᴀ " + Tier2
                        :
                        ChatColor.of("#A01FFF") + "" + BOLD + "ᴀsᴛʀᴀ " + Tier1;
        int AstraNormalCMD = (tier == 2) ? 14 : 13;
        int AstraGUICMD = (tier == 2) ? 114 : 113;

        String fluxname =
                (tier == 2) ?
                        ChatColor.of("#5ED7FF") + "" + BOLD + "ғʟᴜx " + Tier2
                        :
                        ChatColor.of("#5ED7FF") + "" + BOLD + "ғʟᴜx " + Tier1;
        int FluxNormalCMD = (tier == 2) ? 16 : 15;
        int FluxGUICMD = (tier == 2) ? 116 : 115;

        String wealthname =
                (tier == 2) ?
                        ChatColor.of("#0EC912") + "" + BOLD + "ᴡᴇᴀʟᴛʜ " + Tier2
                        :
                        ChatColor.of("#0EC912") + "" + BOLD + "ᴡᴇᴀʟᴛʜ " + Tier1;
        int WealthNormalCMD = (tier == 2) ? 12 : 11;
        int WealthGUICMD = (tier == 2) ? 112 : 111;

        String speedname =
                (tier == 2) ?
                        ChatColor.of("#FEFD17") + "" + BOLD + "sᴘᴇᴇᴅ " + Tier2
                        :
                        ChatColor.of("#FEFD17") + "" + BOLD + "sᴘᴇᴇᴅ " + Tier1;
        int SpeedNormalCMD = (tier == 2) ? 8 : 7;
        int SpeedGUICMD = (tier == 2) ? 108 : 107;

        String firename =
                (tier == 2) ?
                        ChatColor.of("#FE8120") + "" + BOLD + "ғɪʀᴇ " + Tier2
                        :
                        ChatColor.of("#FE8120") + "" + BOLD + "ғɪʀᴇ " + Tier1;
        int FireNormalCMD = (tier == 2) ? 2 : 1;
        int FireGUICMD = (tier == 2) ? 102 : 101;

        String strengthname =
                (tier == 2) ?
                        ChatColor.of("#F10303") + "" + BOLD + "sᴛʀᴇɴɢᴛʜ " + Tier2
                        :
                        ChatColor.of("#F10303") + "" + BOLD + "sᴛʀᴇɴɢᴛʜ " + Tier1;
        int StrengthNormalCMD = (tier == 2) ? 10 : 9;
        int StrengthGUICMD = (tier == 2) ? 110 : 109;

        String lifename =
                (tier == 2) ?
                        ChatColor.of("#FE04B4") + "" + BOLD + "ʟɪғᴇ " + Tier2
                        :
                        ChatColor.of("#FE04B4") + "" + BOLD + "ʟɪғᴇ " + Tier1;
        int LifeNormalCMD = (tier == 2) ? 4 : 3;
        int LifeGUICMD = (tier == 2) ? 104 : 103;


        ItemStack puffgem = GemToGUI("puff", currentgem, puffname, tier, PuffNormalCMD, PuffGUICMD, Gems.get(p.getUniqueId()).size(), p);
        ItemStack astragem = GemToGUI("astra", currentgem, astraname, tier, AstraNormalCMD, AstraGUICMD, Gems.get(p.getUniqueId()).size(), p);
        ItemStack fluxgem = GemToGUI("flux", currentgem, fluxname, tier, FluxNormalCMD, FluxGUICMD, Gems.get(p.getUniqueId()).size(), p);
        ItemStack wealthgem = GemToGUI("wealth", currentgem, wealthname, tier, WealthNormalCMD, WealthGUICMD, Gems.get(p.getUniqueId()).size(), p);

        ItemStack speedgem = GemToGUI("speed", currentgem, speedname, tier, SpeedNormalCMD, SpeedGUICMD, Gems.get(p.getUniqueId()).size(), p);
        ItemStack firegem = GemToGUI("fire", currentgem, firename, tier, FireNormalCMD, FireGUICMD, Gems.get(p.getUniqueId()).size(), p);
        ItemStack strengthgem = GemToGUI("strength", currentgem, strengthname, tier, StrengthNormalCMD, StrengthGUICMD, Gems.get(p.getUniqueId()).size(), p);
        ItemStack lifegem = GemToGUI("life", currentgem, lifename, tier, LifeNormalCMD, LifeGUICMD, Gems.get(p.getUniqueId()).size(), p);

        String currentenergy = "";
        for (ItemStack item : p.getInventory())
            if (item.hasItemMeta()) {

                if (item.getItemMeta().getDisplayName().contains(ChatColor.of("#EFEFEF") + "" + BOLD + "ᴘᴜғғ "))
                    currentgem = "puff";

                if (item.getItemMeta().getDisplayName().contains(ChatColor.of("#F10303") + "" + BOLD + "sᴛʀᴇɴɢᴛʜ "))
                    currentgem = "strength";

                if (item.getItemMeta().getDisplayName().contains(ChatColor.of("#FE04B4") + "" + BOLD + "ʟɪғᴇ "))
                    currentgem = "life";

                if (item.getItemMeta().getDisplayName().contains(ChatColor.of("#FE8120") + "" + BOLD + "ғɪʀᴇ "))
                    currentgem = "fire";

                if (item.getItemMeta().getDisplayName().contains(ChatColor.of("#0EC912") + "" + BOLD + "ᴡᴇᴀʟᴛʜ "))
                    currentgem = "wealth";

                if (item.getItemMeta().getDisplayName().contains(ChatColor.of("#A01FFF") + "" + BOLD + "ᴀsᴛʀᴀ "))
                    currentgem = "astra";

                if (item.getItemMeta().getDisplayName().contains(ChatColor.of("#5ED7FF") + "" + BOLD + "ғʟᴜx "))
                    currentgem = "flux";

                if (item.getItemMeta().getDisplayName().contains(ChatColor.of("#FEFD17") + "" + BOLD + "sᴘᴇᴇᴅ "))
                    currentgem = "speed";

                if (item.getItemMeta().getDisplayName().contains(ChatColor.of("#C7C7C7") + "ɢᴇᴍ"))
                    break;

                if (item.getItemMeta().getDisplayName().contains(ChatColor.of("#FFD773") + "ɢᴇᴍ")) {
                    tier = 2;
                    break;
                }
            }

        ItemStack energybtl = new ItemStack(Material.NAUTILUS_SHELL);
        ItemMeta energymta = energybtl.getItemMeta();
        energymta.setCustomModelData(300);
        energymta.setDisplayName(ChatColor.of("#96FFD9") + "" + BOLD + "ᴇɴᴇʀɢʏ " + ChatColor.of("#FFECB8") + "ɪɴ ᴀ ʙᴏᴛᴛʟᴇ");
        energymta.setLore(
                Arrays.asList(
                        WHITE + "Left click to trade!"
                )
        );
        energybtl.setItemMeta(energymta);


        gui.setItem(17, puffgem);
        gui.setItem(16, astragem);
        gui.setItem(15, fluxgem);
        gui.setItem(14, wealthgem);
        gui.setItem(13, energybtl);
        gui.setItem(12, speedgem);
        gui.setItem(11, firegem);
        gui.setItem(10, strengthgem);
        gui.setItem(9, lifegem);

        p.openInventory(gui);
        if (CurrentGems.containsKey(p.getUniqueId()))
            CurrentGems.replace(p.getUniqueId(), currentgem);
        else
            CurrentGems.put(p.getUniqueId(), currentgem);

    }

    @EventHandler
    public void GemClick(InventoryClickEvent e) {
        if (e.getView().getTitle().equalsIgnoreCase(ChatColor.of("#A01FFF") + "")) {
            e.setCancelled(true);
            ItemStack item = e.getCurrentItem();
            if (item.getItemMeta().getLore().contains(ChatColor.WHITE + "Chance: 100%") || item.getItemMeta().getLore().contains(ChatColor.WHITE + "This is your current gem"))
                return;

            Player p = (Player) e.getWhoClicked();

            String clickedgem = "";
            int tier = 1;
            if (item.getItemMeta().getDisplayName().contains(ChatColor.of("#EFEFEF") + "" + BOLD + "ᴘᴜғғ "))
                clickedgem = "puff";

            if (item.getItemMeta().getDisplayName().contains(ChatColor.of("#F10303") + "" + BOLD + "sᴛʀᴇɴɢᴛʜ "))
                clickedgem = "strength";

            if (item.getItemMeta().getDisplayName().contains(ChatColor.of("#FE04B4") + "" + BOLD + "ʟɪғᴇ "))
                clickedgem = "life";

            if (item.getItemMeta().getDisplayName().contains(ChatColor.of("#FE8120") + "" + BOLD + "ғɪʀᴇ "))
                clickedgem = "fire";

            if (item.getItemMeta().getDisplayName().contains(ChatColor.of("#0EC912") + "" + BOLD + "ᴡᴇᴀʟᴛʜ "))
                clickedgem = "wealth";

            if (item.getItemMeta().getDisplayName().contains(ChatColor.of("#A01FFF") + "" + BOLD + "ᴀsᴛʀᴀ "))
                clickedgem = "astra";

            if (item.getItemMeta().getDisplayName().contains(ChatColor.of("#5ED7FF") + "" + BOLD + "ғʟᴜx "))
                clickedgem = "flux";

            if (item.getItemMeta().getDisplayName().contains(ChatColor.of("#FEFD17") + "" + BOLD + "sᴘᴇᴇᴅ "))
                clickedgem = "speed";

            if (item.getItemMeta().getDisplayName().contains(ChatColor.of("#FFD773") + "ɢᴇᴍ"))
                tier = 2;

            if (!item.getItemMeta().getLore().equals(Arrays.asList(ChatColor.WHITE + "Chance: 0%")))
                Gems.get(p.getUniqueId()).remove(clickedgem);
            else
                Gems.get(p.getUniqueId()).add(clickedgem);

            double chance = (1.0 / Gems.get(p.getUniqueId()).size()) * 100;
            chance = Math.round(chance);


            for (int i = 9; i < 18; i++) {
                ItemStack loopitem = e.getClickedInventory().getItem(i);
                if (isNull(loopitem))
                    continue;
                if ((!loopitem.getItemMeta().getLore().contains(ChatColor.WHITE + "Chance: 0%")) && (!loopitem.getItemMeta().getLore().contains(ChatColor.WHITE + "This is your current gem"))) {
                    ItemMeta meta = loopitem.getItemMeta();

                    meta.setLore(
                            Arrays.asList(
                                    ChatColor.WHITE + "Chance: " + (int) chance + "%"
                            )
                    );
                    loopitem.setItemMeta(meta);
                    e.getClickedInventory().setItem(i, loopitem);
                }
            }

            String currentgem = CurrentGems.get(p.getUniqueId());
            int GUICMD = 100 + item.getItemMeta().getCustomModelData();
            int NormalCMD = item.getItemMeta().getCustomModelData();

            if (item.getItemMeta().getLore().contains(ChatColor.WHITE + "Chance: 0%"))
                NormalCMD = NormalCMD - 100;

            ItemStack gem = GemToGUI(clickedgem, currentgem, item.getItemMeta().getDisplayName(), tier, NormalCMD, GUICMD, Gems.get(p.getUniqueId()).size(), p);

            e.getClickedInventory().setItem(e.getSlot(), gem);
        }
    }

    @EventHandler
    public void EnergyClick(InventoryClickEvent e) {
        if (e.getView().getTitle().equalsIgnoreCase(ChatColor.of("#A01FFF") + "")) {

        }
    }

    /**
     * This is for internal use!
     */
    public static ItemStack GemToGUI(String type, String currentgem, String name, int tier, int NormalCMD, int GUICMD, int size, Player p) {
        ItemStack gem = new ItemStack(Material.AMETHYST_SHARD);

        if (tier == 2)
            gem = new ItemStack(Material.PRISMARINE_SHARD);

        ItemMeta meta = gem.getItemMeta();

        meta.setDisplayName(name);

        if (currentgem.equals(type)) {
            meta.setCustomModelData(GUICMD);
            meta.setLore(
                    Arrays.asList(
                            ChatColor.WHITE + "This is your current gem"
                    )
            );
        } else if (Gems.get(p.getUniqueId()).contains(type)) {
            meta.setCustomModelData(NormalCMD);

            double chance = (1.0 / size) * 100;
            chance = Math.round(chance);

            meta.setLore(
                    Arrays.asList(
                            ChatColor.WHITE + "Chance: " + (int) chance + "%"
                    )
            );
        } else {
            meta.setCustomModelData(GUICMD);
            meta.setLore(
                    Arrays.asList(
                            ChatColor.WHITE + "Chance: 0%"
                    )
            );
        }


        gem.setItemMeta(meta);

        return gem;
    }

    /**
     * This is for internal use!
     */
    public static void ResetGemList(UUID id) {
        ArrayList<String> gems = new ArrayList<String>();
        gems.add("strength");
        gems.add("speed");
        gems.add("fire");
        gems.add("life");
        gems.add("flux");
        gems.add("wealth");
        gems.add("puff");
        gems.add("astra");

        if (!Gems.containsKey(id))
            Gems.put(id, gems);
        else
            Gems.replace(id, gems);

    }
}
