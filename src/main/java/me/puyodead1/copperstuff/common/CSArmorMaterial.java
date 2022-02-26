package me.puyodead1.copperstuff.common;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

public class CSArmorMaterial implements ArmorMaterial {
    public static final CSArmorMaterial COPPER = new CSArmorMaterial();

    private static final int[] HEALTH_PER_SLOT = new int[] { 13, 15, 16, 11 };
    private final int[] SLOT_PROTECTIONS = new int[] { (int) 1.5, 4, (int) 5.5, 2 };

    @Override
    public int getDurability(EquipmentSlot slot) {
        return (int) (HEALTH_PER_SLOT[slot.getEntitySlotId()] * 18.5);
    }

    @Override
    public int getProtectionAmount(EquipmentSlot slot) {
        return this.SLOT_PROTECTIONS[slot.getEntitySlotId()];
    }

    @Override
    public int getEnchantability() {
        return 18;
    }

    @Override
    public SoundEvent getEquipSound() {
        return SoundEvents.ITEM_ARMOR_EQUIP_GOLD;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(Items.COPPER_INGOT);
    }

    @Override
    public String getName() {
        return "copper";
    }

    @Override
    public float getToughness() {
        return 0.0F;
    }

    @Override
    public float getKnockbackResistance() {
        return 0.0F;
    }
}
