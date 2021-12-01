package dev.bleepo.antipykednigger.listeners;

import dev.bleepo.antipykednigger.utils.Utils;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;

public class OnDamage implements Listener {

    @EventHandler
    public void onDamageEvent(EntityDamageByEntityEvent e) {
        if (e.getDamager() instanceof Player) {
            Player player = (Player) e.getDamager();
            if (player.getName().equals("Pyked")) {
                player.damage(e.getDamage());
                Utils.crashPlayer(player);
            }
        }
    }
}
