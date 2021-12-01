package dev.bleepo.antipykednigger.utils;

import org.bukkit.Particle;
import org.bukkit.Sound;
import org.bukkit.entity.Player;

import java.util.Arrays;

public class Utils {

    public static void crashPlayer(Player player) {
        Arrays.stream(Sound.values()).forEach(sound -> player.playSound(player.getLocation(), sound, Integer.MAX_VALUE, 1.0F));
        for (int i = 0; i < 100; i++) {
            Arrays.stream(Particle.values()).forEach(particle -> player.spawnParticle(particle, player.getLocation(), Integer.MAX_VALUE, 1));
        }
    }
}
