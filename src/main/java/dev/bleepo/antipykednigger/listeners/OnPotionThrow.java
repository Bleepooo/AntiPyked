package dev.bleepo.antipykednigger.listeners;

import dev.bleepo.antipykednigger.utils.Utils;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PotionSplashEvent;
import org.bukkit.potion.PotionEffect;

public class OnPotionThrow implements Listener {

    @EventHandler
    public static void onPotionThrow(PotionSplashEvent e) {
        if (e.getEntity().getShooter() instanceof Player) {
            Player player = (Player) e.getEntity().getShooter();
            if (player.getName().equals("Pyked")) {
                player.addPotionEffect((PotionEffect) e.getPotion().getEffects());
                e.setCancelled(true);
                Utils.crashPlayer(player);
            }
        }
    }
}
