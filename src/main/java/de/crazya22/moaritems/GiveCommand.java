package de.crazya22.moaritems;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class GiveCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender s, Command command, String label, String[] args) {
        if(s instanceof Player) {
            Player p = (Player)s;
            if(args[0].equals("god_chestplate")) {
                p.getInventory().addItem(new ItemStack(itemListener.godChestplate));
            }else if(args[0].equals("god_leggings")) {
                p.getInventory().addItem(new ItemStack(itemListener.godLeggings));
            }else if(args[0].equals("god_boots")) {
                p.getInventory().addItem(new ItemStack(itemListener.godBoots));
            }else if(args[0].equals("god_helmet")) {
                p.getInventory().addItem(new ItemStack(itemListener.godHelmet));
            }else if(args[0].equals("god_pickaxe")) {
                p.getInventory().addItem(new ItemStack(itemListener.godPickaxe));
            }else if(args[0].equals("god_sword")) {
                p.getInventory().addItem(new ItemStack(itemListener.godSword));
            }else if(args[0].equals("god")) {
                p.getInventory().addItem(new ItemStack(itemListener.godSword));
                p.getInventory().addItem(new ItemStack(itemListener.godPickaxe));
                p.getInventory().addItem(new ItemStack(itemListener.godHelmet));
                p.getInventory().addItem(new ItemStack(itemListener.godChestplate));
                p.getInventory().addItem(new ItemStack(itemListener.godLeggings));
                p.getInventory().addItem(new ItemStack(itemListener.godBoots));
            }else

            if(args[0].equals("cactus_boots")) {
                p.getInventory().addItem(new ItemStack(itemListener.cactusBoots));
            }else if(args[0].equals("cactus_chestplate")) {
                p.getInventory().addItem(new ItemStack(itemListener.cactusChestplate));
            }else if(args[0].equals("cactus_helmet")) {
                p.getInventory().addItem(new ItemStack(itemListener.cactusHelmet));
            }else if(args[0].equals("cactus_leggings")) {
                p.getInventory().addItem(new ItemStack(itemListener.cactusLeggings));
            }else if(args[0].equals("cactus")) {
                p.getInventory().addItem(new ItemStack(itemListener.cactusHelmet));
                p.getInventory().addItem(new ItemStack(itemListener.cactusChestplate));
                p.getInventory().addItem(new ItemStack(itemListener.cactusLeggings));
                p.getInventory().addItem(new ItemStack(itemListener.cactusBoots));
            }else

            if(args[0].equals("emerald_boots")) {
                p.getInventory().addItem(new ItemStack(itemListener.emeraldBoots));
            }else if(args[0].equals("emerald_chestplate")) {
                p.getInventory().addItem(new ItemStack(itemListener.emeraldChestplate));
            }else if(args[0].equals("emerald_helmet")) {
                p.getInventory().addItem(new ItemStack(itemListener.emeraldHelmet));
            }else if(args[0].equals("emerald_leggings")) {
                p.getInventory().addItem(new ItemStack(itemListener.emeraldLeggings));
            }else if(args[0].equals("emerald")) {
                p.getInventory().addItem(new ItemStack(itemListener.emeraldBoots));
                p.getInventory().addItem(new ItemStack(itemListener.emeraldChestplate));
                p.getInventory().addItem(new ItemStack(itemListener.emeraldHelmet));
                p.getInventory().addItem(new ItemStack(itemListener.emeraldLeggings));
                p.getInventory().addItem(new ItemStack(itemListener.emeraldPickaxe));
                p.getInventory().addItem(new ItemStack(itemListener.emeraldSword));
            }else

            if(args[0].equals("poseidon_boots")) {
                p.getInventory().addItem(new ItemStack(itemListener.poseidonBoots));
            }else if(args[0].equals("poseidon_chestplate")) {
                p.getInventory().addItem(new ItemStack(itemListener.poseidonChestplate));
            }else if(args[0].equals("poseidon_helmet")) {
                p.getInventory().addItem(new ItemStack(itemListener.poseidonHelmet));
            }else if(args[0].equals("poseidon_leggings")) {
                p.getInventory().addItem(new ItemStack(itemListener.poseidonLeggings));
            }else if(args[0].equals("poseidon")) {
                p.getInventory().addItem(new ItemStack(itemListener.poseidonHelmet));
                p.getInventory().addItem(new ItemStack(itemListener.poseidonLeggings));
                p.getInventory().addItem(new ItemStack(itemListener.poseidonChestplate));
                p.getInventory().addItem(new ItemStack(itemListener.poseidonBoots));
                p.getInventory().addItem(new ItemStack(itemListener.atlan));
            }else

            if(args[0].equals("sa_boots")) {
                p.getInventory().addItem(new ItemStack(itemListener.shadowAssassinBoots));
            }else if(args[0].equals("sa_chestplate")) {
                p.getInventory().addItem(new ItemStack(itemListener.shadowAssassinChestplate));
            }else if(args[0].equals("sa_helmet")) {
                p.getInventory().addItem(new ItemStack(itemListener.shadowAssassinHelmet));
            }else if(args[0].equals("sa_leggings")) {
                p.getInventory().addItem(new ItemStack(itemListener.shadowAssassinLeggings));
            }else if(args[0].equals("shadow_assassin")) {
                p.getInventory().addItem(new ItemStack(itemListener.shadowAssassinBoots));
                p.getInventory().addItem(new ItemStack(itemListener.shadowAssassinChestplate));
                p.getInventory().addItem(new ItemStack(itemListener.shadowAssassinHelmet));
                p.getInventory().addItem(new ItemStack(itemListener.shadowAssassinLeggings));
            }
        }
        return false;
    }
}
