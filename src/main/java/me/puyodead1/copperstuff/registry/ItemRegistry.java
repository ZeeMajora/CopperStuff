package me.puyodead1.copperstuff.registry;

import me.puyodead1.copperstuff.CopperStuff;
import me.puyodead1.copperstuff.common.CSArmorMaterial;
import me.puyodead1.copperstuff.common.CSAxeItem;
import me.puyodead1.copperstuff.common.CSHoeItem;
import me.puyodead1.copperstuff.common.CSPickaxeItem;
import me.puyodead1.copperstuff.common.CSToolMaterial;
import me.puyodead1.copperstuff.common.ItemIdentifiers;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public interface ItemRegistry {

        /** Tools */
        Item COPPER_SHOVEL = register(new ShovelItem(CSToolMaterial.COPPER, 1.5F, -3.0F,
                        new FabricItemSettings().group(ItemGroup.TOOLS)), ItemIdentifiers.COPPER_SHOVEL.getId());
        Item COPPER_PICKAXE = register(new CSPickaxeItem(CSToolMaterial.COPPER, 1, -2.8F,
                        new FabricItemSettings().group(ItemGroup.TOOLS)), ItemIdentifiers.COPPER_PICKAXE.getId());
        Item COPPER_AXE = register(new CSAxeItem(CSToolMaterial.COPPER, 6.0F, -3.0F,
                        new FabricItemSettings().group(ItemGroup.TOOLS)), ItemIdentifiers.COPPER_AXE.getId());
        Item COPPER_HOE = register(new CSHoeItem(CSToolMaterial.COPPER, -1, -2.0F,
                        new FabricItemSettings().group(ItemGroup.TOOLS)), ItemIdentifiers.COPPER_HOE.getId());
        Item COPPER_SWORD = register(new SwordItem(CSToolMaterial.COPPER, 3, -2.4F,
                        new FabricItemSettings().group(ItemGroup.COMBAT)), ItemIdentifiers.COPPER_SWORD.getId());

        /** Armor */
        Item COPPER_HELMET = register(
                        new ArmorItem(CSArmorMaterial.COPPER, EquipmentSlot.HEAD,
                                        new FabricItemSettings().group(ItemGroup.COMBAT)),
                        ItemIdentifiers.COPPER_HELMET.getId());

        Item COPPER_CHESTPLATE = register(
                        new ArmorItem(CSArmorMaterial.COPPER, EquipmentSlot.CHEST,
                                        new FabricItemSettings().group(ItemGroup.COMBAT)),
                        ItemIdentifiers.COPPER_CHESTPLATE.getId());

        Item COPPER_LEGGINGS = register(
                        new ArmorItem(CSArmorMaterial.COPPER, EquipmentSlot.LEGS,
                                        new FabricItemSettings().group(ItemGroup.COMBAT)),
                        ItemIdentifiers.COPPER_LEGGINGS.getId());

        Item COPPER_BOOTS = register(
                        new ArmorItem(CSArmorMaterial.COPPER, EquipmentSlot.FEET,
                                        new FabricItemSettings().group(ItemGroup.COMBAT)),
                        ItemIdentifiers.COPPER_BOOTS.getId());

        /** Misc */
        Item COPPER_NUGGET = register(new Item(
                        new FabricItemSettings().group(ItemGroup.MATERIALS)), ItemIdentifiers.COPPER_NUGGET.getId());

        /**
         * register an item with the given id and name
         * 
         * @param <T>
         * @param t
         * @param id  item id
         * @return
         */
        static <T extends Item> T register(T t, String id) {
                Identifier identifier = CopperStuff.id(id);
                CopperStuff.LOGGER.info("Registering item " + identifier);
                return Registry.register(Registry.ITEM, identifier, t);
        }

        static void init() {
        }
}
