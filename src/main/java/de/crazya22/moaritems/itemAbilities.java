package de.crazya22.moaritems;

import org.bukkit.*;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class itemAbilities implements Listener {

    public static void itemabilities() {

        for (Player player : Bukkit.getOnlinePlayers()) {
            if (player.getInventory().getChestplate().getType() == Material.NETHERITE_CHESTPLATE && player.getInventory().getChestplate().getItemMeta().getDisplayName().equals("§6God Chestplate")) {
                if (player.getGameMode().equals(GameMode.SURVIVAL) || player.getGameMode().equals(GameMode.ADVENTURE)) {
                    player.setAllowFlight(true);
                }
            } else {
                if (player.getGameMode().equals(GameMode.SURVIVAL) || player.getGameMode().equals(GameMode.ADVENTURE)) {
                    player.setAllowFlight(false);
                }
            }

            if (player.getInventory().getHelmet().getType() == Material.DIAMOND_HELMET && player.getInventory().getHelmet().getItemMeta().getDisplayName().equals("§bPoseidon Helmet")) {
                player.addPotionEffect(new PotionEffect(PotionEffectType.WATER_BREATHING, 5, 1, true));
                player.addPotionEffect(new PotionEffect(PotionEffectType.CONDUIT_POWER, 5, 1, true));
            }

            if (player.getInventory().getBoots().getType() == Material.LEATHER_CHESTPLATE && player.getInventory().getBoots().getItemMeta().getDisplayName().equals("§aEmerald Boots")) {
                player.addPotionEffect(new PotionEffect(PotionEffectType.HERO_OF_THE_VILLAGE, 5, 2, true));
            }

            if (player.getInventory().getLeggings().getType() == Material.NETHERITE_LEGGINGS && player.getInventory().getLeggings().getItemMeta().getDisplayName().equals("§8Shadow Assassin Leggings")) {
                player.addPotionEffect(new PotionEffect(PotionEffectType.INVISIBILITY, 5, 1, true));
            }
        }
    }
}
