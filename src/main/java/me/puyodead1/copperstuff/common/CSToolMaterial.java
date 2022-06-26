package me.puyodead1.copperstuff.common;

import net.fabricmc.yarn.constants.MiningLevels;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class CSToolMaterial implements ToolMaterial {
    public static final CSToolMaterial COPPER = new CSToolMaterial();

    @Override
    public int getDurability() {
        return 190;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 6.5f;
    }

    @Override
    public float getAttackDamage() {
        return 1.5f;
    }

    @Override
    public int getMiningLevel() {
        return MiningLevels.STONE;
    }

    @Override
    public int getEnchantability() {
        return 18;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(Items.COPPER_INGOT);
    }

}
