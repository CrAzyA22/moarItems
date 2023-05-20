package de.crazya22.moaritems;

import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitRunnable;

public final class main extends JavaPlugin {

    @Override
    public void onEnable() {

        itemListener.init();

        getCommand("getitem").setExecutor(new GiveCommand());

        getServer().getPluginManager().registerEvents(new itemAbilities(), this);

        startInfiniteTask();
    }

    @Override
    public void onDisable() {
    }

    private void startInfiniteTask() {
        BukkitRunnable task = new BukkitRunnable() {
            @Override
            public void run() {
                itemAbilities.itemabilities();
            }
        };
        task.runTaskTimer(this, 0, 1);
    }
}
