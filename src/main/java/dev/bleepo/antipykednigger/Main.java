package dev.bleepo.antipykednigger;

import dev.bleepo.antipykednigger.listeners.OnDamage;
import dev.bleepo.antipykednigger.listeners.OnPotionThrow;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new OnDamage(), this);
        getServer().getPluginManager().registerEvents(new OnPotionThrow(), this);
    }
}
