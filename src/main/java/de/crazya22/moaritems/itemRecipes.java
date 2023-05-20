package de.crazya22.moaritems;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.RecipeChoice;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.SmithingRecipe;
import org.bukkit.plugin.Plugin;

public class itemRecipes {

    public void registerRecipe() {
        ShapedRecipe cactus_cp = new ShapedRecipe(itemListener.cactusChestplate);
        cactus_cp.shape("C C", "CCC", "CCC");
        cactus_cp.setIngredient('C', Material.CACTUS);

        ShapedRecipe cactus_l = new ShapedRecipe(itemListener.cactusLeggings);
        cactus_l.shape("CCC", "C C", "C C");
        cactus_l.setIngredient('C', Material.CACTUS);

        ShapedRecipe cactus_h = new ShapedRecipe(itemListener.cactusHelmet);
        cactus_h.shape("CCC", "C C", "   ");
        cactus_h.setIngredient('C', Material.CACTUS);

        ShapedRecipe cactus_b = new ShapedRecipe(itemListener.cactusBoots);
        cactus_b.shape("   ", "C C", "C C");
        cactus_b.setIngredient('C', Material.CACTUS);


        ShapedRecipe emerald_cp = new ShapedRecipe(itemListener.emeraldChestplate);
        emerald_cp.shape("C C", "CCC", "CCC");
        emerald_cp.setIngredient('C', Material.EMERALD_BLOCK);

        ShapedRecipe emerald_l = new ShapedRecipe(itemListener.emeraldLeggings);
        emerald_l.shape("CCC", "C C", "C C");
        emerald_l.setIngredient('C', Material.EMERALD_BLOCK);

        ShapedRecipe emerald_h = new ShapedRecipe(itemListener.emeraldHelmet);
        emerald_h.shape("CCC", "C C", "   ");
        emerald_h.setIngredient('C', Material.EMERALD_BLOCK);

        ShapedRecipe emerald_b = new ShapedRecipe(itemListener.emeraldBoots);
        emerald_b.shape("   ", "C C", "C C");
        emerald_b.setIngredient('C', Material.EMERALD_BLOCK);

        ShapedRecipe emerald_s = new ShapedRecipe(itemListener.emeraldSword);
        emerald_s.shape(" C ", " C ", " S ");
        emerald_s.setIngredient('C', Material.EMERALD_BLOCK);
        emerald_s.setIngredient('S', Material.STICK);

        ShapedRecipe emerald_p = new ShapedRecipe(itemListener.emeraldPickaxe);
        emerald_p.shape("CCC", " S ", " S ");
        emerald_p.setIngredient('C', Material.EMERALD_BLOCK);
        emerald_p.setIngredient('S', Material.STICK);


        ShapedRecipe poseidon_cp = new ShapedRecipe(itemListener.poseidonChestplate);
        poseidon_cp.shape("G G", "CGC", "CCC");
        poseidon_cp.setIngredient('C', Material.PRISMARINE_CRYSTALS);
        poseidon_cp.setIngredient('G', Material.GOLD_BLOCK);

        ShapedRecipe poseidon_l = new ShapedRecipe(itemListener.poseidonLeggings);
        poseidon_l.shape("GCG", "C C", "C C");
        poseidon_l.setIngredient('C', Material.PRISMARINE_CRYSTALS);
        poseidon_l.setIngredient('G', Material.GOLD_BLOCK);

        ShapedRecipe poseidon_h = new ShapedRecipe(itemListener.poseidonHelmet);
        poseidon_h.shape("CCC", "G G", "   ");
        poseidon_h.setIngredient('C', Material.PRISMARINE_CRYSTALS);
        poseidon_h.setIngredient('G', Material.GOLD_BLOCK);

        ShapedRecipe poseidon_b = new ShapedRecipe(itemListener.poseidonBoots);
        poseidon_b.shape("   ", "G G", "C C");
        poseidon_b.setIngredient('C', Material.PRISMARINE_CRYSTALS);
        poseidon_b.setIngredient('G', Material.GOLD_BLOCK);

        ShapedRecipe atlan = new ShapedRecipe(itemListener.atlan);
        atlan.shape(" GG", " NG", "C  ");
        atlan.setIngredient('C', Material.PRISMARINE_CRYSTALS);
        atlan.setIngredient('G', Material.GOLD_BLOCK);
        atlan.setIngredient('N', Material.NETHERITE_INGOT);


        ShapedRecipe sa_cp = new ShapedRecipe(itemListener.shadowAssassinChestplate);
        sa_cp.shape("G G", "CGC", "CCC");
        sa_cp.setIngredient('C', Material.NETHERITE_INGOT);
        sa_cp.setIngredient('G', Material.WITHER_SKELETON_SKULL);

        ShapedRecipe sa_l = new ShapedRecipe(itemListener.shadowAssassinLeggings);
        sa_l.shape("GCG", "C C", "C C");
        sa_l.setIngredient('C', Material.NETHERITE_INGOT);
        sa_l.setIngredient('G', Material.WITHER_SKELETON_SKULL);

        ShapedRecipe sa_h = new ShapedRecipe(itemListener.shadowAssassinHelmet);
        sa_h.shape("CCC", "G G", "   ");
        sa_h.setIngredient('C', Material.NETHERITE_INGOT);
        sa_h.setIngredient('G', Material.WITHER_SKELETON_SKULL);

        ShapedRecipe sa_b = new ShapedRecipe(itemListener.shadowAssassinBoots);
        sa_b.shape("   ", "G G", "C C");
        sa_b.setIngredient('C', Material.NETHERITE_INGOT);
        sa_b.setIngredient('G', Material.WITHER_SKELETON_SKULL);


        ShapedRecipe god_cp = new ShapedRecipe(itemListener.godChestplate);
        god_cp.shape(" C ", "ENP", " S ");
        god_cp.setIngredient('C', new RecipeChoice.ExactChoice(itemListener.cactusChestplate));
        god_cp.setIngredient('E', new RecipeChoice.ExactChoice(itemListener.emeraldChestplate));
        god_cp.setIngredient('N', Material.NETHER_STAR);
        god_cp.setIngredient('P', new RecipeChoice.ExactChoice(itemListener.poseidonChestplate));
        god_cp.setIngredient('S', new RecipeChoice.ExactChoice(itemListener.shadowAssassinChestplate));

        ShapedRecipe god_l = new ShapedRecipe(itemListener.godLeggings);
        god_l.shape(" C ", "ENP", " S ");
        god_l.setIngredient('C', new RecipeChoice.ExactChoice(itemListener.cactusLeggings));
        god_l.setIngredient('E', new RecipeChoice.ExactChoice(itemListener.emeraldLeggings));
        god_l.setIngredient('N', Material.NETHER_STAR);
        god_l.setIngredient('P', new RecipeChoice.ExactChoice(itemListener.poseidonLeggings));
        god_l.setIngredient('S', new RecipeChoice.ExactChoice(itemListener.shadowAssassinLeggings));

        ShapedRecipe god_h = new ShapedRecipe(itemListener.godHelmet);
        god_h.shape(" C ", "ENP", " S ");
        god_h.setIngredient('C', new RecipeChoice.ExactChoice(itemListener.cactusHelmet));
        god_h.setIngredient('E', new RecipeChoice.ExactChoice(itemListener.emeraldHelmet));
        god_h.setIngredient('N', Material.NETHER_STAR);
        god_h.setIngredient('P', new RecipeChoice.ExactChoice(itemListener.poseidonHelmet));
        god_h.setIngredient('S', new RecipeChoice.ExactChoice(itemListener.shadowAssassinHelmet));

        ShapedRecipe god_b = new ShapedRecipe(itemListener.godBoots);
        god_b.shape(" C ", "ENP", " S ");
        god_b.setIngredient('C', new RecipeChoice.ExactChoice(itemListener.cactusBoots));
        god_b.setIngredient('E', new RecipeChoice.ExactChoice(itemListener.emeraldBoots));
        god_b.setIngredient('N', Material.NETHER_STAR);
        god_b.setIngredient('P', new RecipeChoice.ExactChoice(itemListener.poseidonBoots));
        god_b.setIngredient('S', new RecipeChoice.ExactChoice(itemListener.shadowAssassinBoots));

        ShapedRecipe god_p = new ShapedRecipe(itemListener.godPickaxe);
        god_p.shape(" C ", "CNC", " C ");
        god_p.setIngredient('C', new RecipeChoice.ExactChoice(itemListener.emeraldPickaxe));
        god_p.setIngredient('N', Material.NETHER_STAR);

        ShapedRecipe god_s = new ShapedRecipe(itemListener.godSword);
        god_s.shape(" C ", "ENE", " C ");
        god_s.setIngredient('C', new RecipeChoice.ExactChoice(itemListener.emeraldSword));
        god_s.setIngredient('E', new RecipeChoice.ExactChoice(itemListener.atlan));
        god_s.setIngredient('N', Material.NETHER_STAR);

        ShapedRecipe god_s2 = new ShapedRecipe(itemListener.godSword);
        god_s2.shape(" C ", "ENE", " C ");
        god_s2.setIngredient('C', new RecipeChoice.ExactChoice(itemListener.atlan));
        god_s2.setIngredient('E', new RecipeChoice.ExactChoice(itemListener.emeraldSword));
        god_s2.setIngredient('N', Material.NETHER_STAR);



        Bukkit.addRecipe(cactus_b);
        Bukkit.addRecipe(cactus_cp);
        Bukkit.addRecipe(cactus_h);
        Bukkit.addRecipe(cactus_l);

        Bukkit.addRecipe(emerald_b);
        Bukkit.addRecipe(emerald_cp);
        Bukkit.addRecipe(emerald_h);
        Bukkit.addRecipe(emerald_l);
        Bukkit.addRecipe(emerald_p);
        Bukkit.addRecipe(emerald_s);

        Bukkit.addRecipe(poseidon_b);
        Bukkit.addRecipe(poseidon_cp);
        Bukkit.addRecipe(poseidon_h);
        Bukkit.addRecipe(poseidon_l);
        Bukkit.addRecipe(atlan);

        Bukkit.addRecipe(sa_b);
        Bukkit.addRecipe(sa_cp);
        Bukkit.addRecipe(sa_h);
        Bukkit.addRecipe(sa_l);

        Bukkit.addRecipe(god_b);
        Bukkit.addRecipe(god_cp);
        Bukkit.addRecipe(god_l);
        Bukkit.addRecipe(god_h);
        Bukkit.addRecipe(god_p);
        Bukkit.addRecipe(god_s);
    }

}
