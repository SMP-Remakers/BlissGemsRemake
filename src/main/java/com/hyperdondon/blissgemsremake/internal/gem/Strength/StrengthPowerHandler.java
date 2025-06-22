package com.hyperdondon.blissgemsremake.internal.gem.Strength;

import com.hyperdondon.blissgemsremake.api.Gem;
import com.hyperdondon.blissgemsremake.api.GemType;
import com.hyperdondon.blissgemsremake.api.SeasonSupport;
import com.hyperdondon.blissgemsremake.internal.powers.PowerHandler;
import lombok.Getter;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Monster;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.server.ServerLoadEvent;
import org.mineacademy.fo.annotation.AutoRegister;
import org.mineacademy.fo.remain.CompPotionEffectType;

@AutoRegister
public final class StrengthPowerHandler extends PowerHandler implements Listener {
    @Getter
    private volatile static StrengthPowerHandler instance = new StrengthPowerHandler();

    public StrengthPowerHandler() {
        super(GemType.Strength, CompPotionEffectType.INCREASE_DAMAGE);
    }

    @EventHandler
    public void initialize(ServerLoadEvent event) {
        registerPower(Frailer.getInstance());
        registerPower(ChadStrength.getInstance());
    }

    @EventHandler
    public void activateSingleFrailerPower(EntityDamageByEntityEvent event) {
        if (event.getDamager().getType() != EntityType.PLAYER)
            return;
        Player player = (Player) event.getDamager();
        if (!isPowerful(player.getInventory().getItemInMainHand(), false, player)) return;
        LivingEntity ent = (LivingEntity) event.getEntity();
        if (!(ent instanceof Monster))
            return;
        Gem gem = Gem.fromGemItem(player.getInventory().getItemInMainHand());
        Frailer.getInstance().activate(player, gem, SeasonSupport.fromInt(gem.getSeason()), event);
    }

    @EventHandler
    public void activateGroupFrailerPower(PlayerInteractEvent event) {
        Player player = event.getPlayer();
        if (event.getAction() != Action.LEFT_CLICK_AIR && event.getAction() != Action.LEFT_CLICK_BLOCK)
            return;
        if (!isPowerful(player.getInventory().getItemInMainHand(), false, null)) return;
        event.setCancelled(true);
        Gem gem = Gem.getPlayerGem(player);
        Frailer.getInstance().activate(player, gem, SeasonSupport.fromInt(gem.getSeason()), event);
    }

    @EventHandler
    public void activateSingleChadStrengthPower(PlayerInteractEvent event) {
        Player player = event.getPlayer();
        if (!isPowerful(player.getInventory().getItemInMainHand(), false, player)) return;
        event.setCancelled(true);
        Gem gem = Gem.getPlayerGem(player);
        ChadStrength.getInstance().activate(player, gem, SeasonSupport.fromInt(gem.getSeason()), event);
    }
}
