package de.crazya22.moaritems;

import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.LeatherArmorMeta;

public class itemListener implements Listener {

    //god set
    public static ItemStack godChestplate;
    public static ItemStack godLeggings;
    public static ItemStack godHelmet;
    public static ItemStack godBoots;

    public static ItemStack godSword;
    public static ItemStack godPickaxe;

    //cactus set
    public static ItemStack cactusBoots;
    public static ItemStack cactusChestplate;
    public static ItemStack cactusLeggings;
    public static ItemStack cactusHelmet;

    //emerald set
    public static ItemStack emeraldChestplate;
    public static ItemStack emeraldLeggings;
    public static ItemStack emeraldHelmet;
    public static ItemStack emeraldBoots;

    public static ItemStack emeraldSword;
    public static ItemStack emeraldPickaxe;

    //poseidon set
    public static ItemStack poseidonChestplate;
    public static ItemStack poseidonLeggings;
    public static ItemStack poseidonHelmet;
    public static ItemStack poseidonBoots;

    public static ItemStack atlan;

    //poseidon set
    public static ItemStack shadowAssassinChestplate;
    public static ItemStack shadowAssassinLeggings;
    public static ItemStack shadowAssassinHelmet;
    public static ItemStack shadowAssassinBoots;

    public static void init() {
        //god set
        createGodChestplate();
        createGodLeggings();
        createGodBoots();
        createGodHelmet();
        createGodPickaxe();
        createGodSword();

        //cactus set
        createCactusChestplate();
        createCactusBoots();
        createCactusHelmet();
        createCactusLeggings();

        //emerald set
        createEmeraldChestplate();
        createEmeraldLeggings();
        createEmeraldBoots();
        createEmeraldHelmet();
        createEmeraldPickaxe();
        createEmeraldSword();

        //poseidon set
        createPoseidonBoots();
        createPoseidonChestplate();
        createPoseidonHelmet();
        createPoseidonLeggings();
        createAtlan();

        //shadow assassin set
        createShadowAssassinBoots();
        createShadowAssassinChestplate();
        createShadowAssassinHelmet();
        createShadowAssassinLeggings();
    }

    //god set
    private static void createGodChestplate() {
        ItemStack item = new ItemStack(Material.NETHERITE_CHESTPLATE, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setUnbreakable(true);
        meta.setDisplayName("§6God Chestplate");
        meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 999, true);
        meta.addEnchant(Enchantment.PROTECTION_FIRE, 999, true);
        meta.addEnchant(Enchantment.PROTECTION_EXPLOSIONS, 999, true);
        meta.addEnchant(Enchantment.PROTECTION_PROJECTILE, 999, true);
        meta.addEnchant(Enchantment.THORNS, 100, true);
        meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE, ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);
        godChestplate = item;
    }
    private static void createGodLeggings() {
        ItemStack item = new ItemStack(Material.NETHERITE_LEGGINGS, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setUnbreakable(true);
        meta.setDisplayName("§6God Leggings");
        meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 999, true);
        meta.addEnchant(Enchantment.PROTECTION_FIRE, 999, true);
        meta.addEnchant(Enchantment.PROTECTION_EXPLOSIONS, 999, true);
        meta.addEnchant(Enchantment.PROTECTION_PROJECTILE, 999, true);
        meta.addEnchant(Enchantment.THORNS, 100, true);
        meta.addEnchant(Enchantment.SWIFT_SNEAK, 5, true);
        meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE, ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);
        godLeggings = item;
    }
    private static void createGodHelmet() {
        ItemStack item = new ItemStack(Material.NETHERITE_HELMET, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setUnbreakable(true);
        meta.setDisplayName("§6God Helmet");
        meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 999, true);
        meta.addEnchant(Enchantment.PROTECTION_FIRE, 999, true);
        meta.addEnchant(Enchantment.PROTECTION_EXPLOSIONS, 999, true);
        meta.addEnchant(Enchantment.PROTECTION_PROJECTILE, 999, true);
        meta.addEnchant(Enchantment.THORNS, 100, true);
        meta.addEnchant(Enchantment.OXYGEN, 100, true);
        meta.addEnchant(Enchantment.WATER_WORKER, 1, true);
        meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE, ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);
        godHelmet = item;
    }
    private static void createGodBoots() {
        ItemStack item = new ItemStack(Material.NETHERITE_BOOTS, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setUnbreakable(true);
        meta.setDisplayName("§6God Boots");
        meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 999, true);
        meta.addEnchant(Enchantment.PROTECTION_FIRE, 999, true);
        meta.addEnchant(Enchantment.PROTECTION_EXPLOSIONS, 999, true);
        meta.addEnchant(Enchantment.PROTECTION_PROJECTILE, 999, true);
        meta.addEnchant(Enchantment.THORNS, 100, true);
        meta.addEnchant(Enchantment.PROTECTION_FALL, 999, true);
        meta.addEnchant(Enchantment.DEPTH_STRIDER, 100, true);
        meta.addEnchant(Enchantment.SOUL_SPEED, 5, true);
        meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE, ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);
        godBoots = item;
    }
    private static void createGodSword() {
        ItemStack item = new ItemStack(Material.NETHERITE_SWORD, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setUnbreakable(true);
        meta.setDisplayName("§6God Sword");
        meta.addEnchant(Enchantment.DAMAGE_ALL, 999, true);
        meta.addEnchant(Enchantment.DAMAGE_ARTHROPODS, 999, true);
        meta.addEnchant(Enchantment.DAMAGE_UNDEAD, 999, true);
        meta.addEnchant(Enchantment.SWEEPING_EDGE, 10, true);
        meta.addEnchant(Enchantment.LOOT_BONUS_MOBS, 999, true);
        meta.addEnchant(Enchantment.FIRE_ASPECT, 999, true);
        meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE, ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);
        godSword = item;
    }
    private static void createGodPickaxe() {
        ItemStack item = new ItemStack(Material.NETHERITE_PICKAXE, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setUnbreakable(true);
        meta.setDisplayName("§6God Pickaxe");
        meta.addEnchant(Enchantment.SILK_TOUCH, 1, true);
        meta.addEnchant(Enchantment.DIG_SPEED, 999, true);
        meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE, ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);
        godPickaxe = item;
    }

    //cactus set
    private static void createCactusChestplate() {
        ItemStack item = new ItemStack(Material.LEATHER_CHESTPLATE, 1);
        ItemMeta meta = item.getItemMeta();
        LeatherArmorMeta leatherArmorMeta = (LeatherArmorMeta)meta;
        leatherArmorMeta.setColor(Color.GREEN);
        leatherArmorMeta.setUnbreakable(true);
        leatherArmorMeta.setDisplayName("§2Cactus Boots");
        leatherArmorMeta.addEnchant(Enchantment.THORNS, 999, true);
        leatherArmorMeta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE, ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(leatherArmorMeta);
        cactusChestplate = item;
    }
    private static void createCactusLeggings() {
        ItemStack item = new ItemStack(Material.LEATHER_LEGGINGS, 1);
        ItemMeta meta = item.getItemMeta();
        LeatherArmorMeta leatherArmorMeta = (LeatherArmorMeta)meta;
        leatherArmorMeta.setColor(Color.GREEN);
        leatherArmorMeta.setUnbreakable(true);
        leatherArmorMeta.setDisplayName("§2Cactus Boots");
        leatherArmorMeta.addEnchant(Enchantment.THORNS, 999, true);
        leatherArmorMeta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE, ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(leatherArmorMeta);
        cactusLeggings = item;
    }
    private static void createCactusHelmet() {
        ItemStack item = new ItemStack(Material.LEATHER_HELMET, 1);
        ItemMeta meta = item.getItemMeta();
        LeatherArmorMeta leatherArmorMeta = (LeatherArmorMeta)meta;
        leatherArmorMeta.setColor(Color.GREEN);
        leatherArmorMeta.setUnbreakable(true);
        leatherArmorMeta.setDisplayName("§2Cactus Boots");
        leatherArmorMeta.addEnchant(Enchantment.THORNS, 999, true);
        leatherArmorMeta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE, ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(leatherArmorMeta);
        cactusHelmet = item;
    }
    private static void createCactusBoots() {
        ItemStack item = new ItemStack(Material.LEATHER_BOOTS, 1);
        ItemMeta meta = item.getItemMeta();
        LeatherArmorMeta leatherArmorMeta = (LeatherArmorMeta)meta;
        leatherArmorMeta.setColor(Color.GREEN);
        leatherArmorMeta.setUnbreakable(true);
        leatherArmorMeta.setDisplayName("§2Cactus Boots");
        leatherArmorMeta.addEnchant(Enchantment.THORNS, 999, true);
        leatherArmorMeta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE, ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(leatherArmorMeta);
        cactusBoots = item;
    }

    //emerald set
    private static void createEmeraldChestplate() {
        ItemStack item = new ItemStack(Material.LEATHER_CHESTPLATE, 1);
        ItemMeta meta = item.getItemMeta();
        LeatherArmorMeta leatherArmorMeta = (LeatherArmorMeta)meta;
        leatherArmorMeta.setColor(Color.LIME);
        leatherArmorMeta.setDisplayName("§aEmerald Boots");
        leatherArmorMeta.addEnchant(Enchantment.DURABILITY, 10, true);
        leatherArmorMeta.addEnchant(Enchantment.PROTECTION_PROJECTILE, 50, true);
        leatherArmorMeta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE, ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(leatherArmorMeta);
        emeraldChestplate = item;
    }
    private static void createEmeraldLeggings() {
        ItemStack item = new ItemStack(Material.LEATHER_LEGGINGS, 1);
        ItemMeta meta = item.getItemMeta();
        LeatherArmorMeta leatherArmorMeta = (LeatherArmorMeta)meta;
        leatherArmorMeta.setColor(Color.LIME);
        leatherArmorMeta.setDisplayName("§aEmerald Boots");
        leatherArmorMeta.addEnchant(Enchantment.DURABILITY, 10, true);
        leatherArmorMeta.addEnchant(Enchantment.PROTECTION_PROJECTILE, 50, true);
        leatherArmorMeta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE, ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(leatherArmorMeta);
        emeraldLeggings = item;
    }
    private static void createEmeraldHelmet() {
        ItemStack item = new ItemStack(Material.LEATHER_HELMET, 1);
        ItemMeta meta = item.getItemMeta();
        LeatherArmorMeta leatherArmorMeta = (LeatherArmorMeta)meta;
        leatherArmorMeta.setColor(Color.LIME);
        leatherArmorMeta.setDisplayName("§aEmerald Boots");
        leatherArmorMeta.addEnchant(Enchantment.DURABILITY, 10, true);
        leatherArmorMeta.addEnchant(Enchantment.PROTECTION_PROJECTILE, 50, true);
        leatherArmorMeta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE, ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(leatherArmorMeta);
        emeraldHelmet = item;
    }
    private static void createEmeraldBoots() {
        ItemStack item = new ItemStack(Material.LEATHER_BOOTS, 1);
        ItemMeta meta = item.getItemMeta();
        LeatherArmorMeta leatherArmorMeta = (LeatherArmorMeta)meta;
        leatherArmorMeta.setColor(Color.LIME);
        leatherArmorMeta.setDisplayName("§aEmerald Boots");
        leatherArmorMeta.addEnchant(Enchantment.DURABILITY, 10, true);
        leatherArmorMeta.addEnchant(Enchantment.PROTECTION_PROJECTILE, 50, true);
        leatherArmorMeta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE, ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(leatherArmorMeta);
        emeraldBoots = item;
    }
    private static void createEmeraldSword() {
        ItemStack item = new ItemStack(Material.IRON_SWORD, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§aEmerald Sword");
        meta.addEnchant(Enchantment.DURABILITY, 10, true);
        meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE, ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);
        emeraldSword = item;
    }
    private static void createEmeraldPickaxe() {
        ItemStack item = new ItemStack(Material.IRON_PICKAXE, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§aEmerald Pickaxe");
        meta.addEnchant(Enchantment.DURABILITY, 10, true);
        meta.addEnchant(Enchantment.DIG_SPEED, 2, true);
        meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE, ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);
        emeraldPickaxe = item;
    }

    //poseidon set
    private static void createPoseidonChestplate() {
        ItemStack item = new ItemStack(Material.DIAMOND_CHESTPLATE, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§bPoseidon Chestplate");
        meta.addEnchant(Enchantment.DURABILITY, 50, true);
        meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE, ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);
        poseidonChestplate = item;
    }
    private static void createPoseidonLeggings() {
        ItemStack item = new ItemStack(Material.DIAMOND_LEGGINGS, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§bPoseidon Leggings");
        meta.addEnchant(Enchantment.DURABILITY, 50, true);
        meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE, ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);
        poseidonLeggings = item;
    }
    private static void createPoseidonHelmet() {
        ItemStack item = new ItemStack(Material.DIAMOND_HELMET, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§bPoseidon Helmet");
        meta.addEnchant(Enchantment.DURABILITY, 50, true);
        meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE, ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);
        poseidonHelmet = item;
    }
    private static void createPoseidonBoots() {
        ItemStack item = new ItemStack(Material.DIAMOND_BOOTS, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§bPoseidon Boots");
        meta.addEnchant(Enchantment.DURABILITY, 50, true);
        meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE, ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);
        poseidonBoots = item;
    }
    private static void createAtlan() {
        ItemStack item = new ItemStack(Material.TRIDENT, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§6Atlan");
        meta.setUnbreakable(true);
        meta.addEnchant(Enchantment.DURABILITY, 50, true);
        meta.addEnchant(Enchantment.DAMAGE_ALL, 8, true);
        meta.addEnchant(Enchantment.RIPTIDE, 4, true);
        meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE, ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);
        atlan = item;
    }

    //frostbite set
    private static void createShadowAssassinChestplate() {
        ItemStack item = new ItemStack(Material.NETHERITE_CHESTPLATE, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§8Shadow Assassin Chestplate");
        meta.setUnbreakable(true);
        meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 7, true);
        meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE, ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);
        shadowAssassinChestplate = item;
    }
    private static void createShadowAssassinLeggings() {
        ItemStack item = new ItemStack(Material.NETHERITE_LEGGINGS, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§8Shadow Assassin Leggings");
        meta.setUnbreakable(true);
        meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 7, true);
        meta.addEnchant(Enchantment.SWIFT_SNEAK, 7, true);
        meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE, ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);
        shadowAssassinLeggings = item;
    }
    private static void createShadowAssassinHelmet() {
        ItemStack item = new ItemStack(Material.NETHERITE_HELMET, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§8Shadow Assassin Helmet");
        meta.setUnbreakable(true);
        meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 7, true);
        meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE, ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);
        shadowAssassinHelmet = item;
    }
    private static void createShadowAssassinBoots() {
        ItemStack item = new ItemStack(Material.NETHERITE_BOOTS, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§8Shadow Assassin Boots");
        meta.setUnbreakable(true);
        meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 7, true);
        meta.addEnchant(Enchantment.PROTECTION_FALL, 999, true);
        meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE, ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);
        shadowAssassinBoots = item;
    }
}
