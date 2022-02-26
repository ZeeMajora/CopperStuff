package me.puyodead1.copperstuff.common;

import me.puyodead1.copperstuff.CopperStuff;
import net.minecraft.util.Identifier;

public enum ItemIdentifiers {
    COPPER_PICKAXE("copper_pickaxe"),
    COPPER_AXE("copper_axe"),
    COPPER_SHOVEL("copper_shovel"),
    COPPER_HOE("copper_hoe"),
    COPPER_SWORD("copper_sword"),
    COPPER_HELMET("copper_helmet"),
    COPPER_CHESTPLATE("copper_chestplate"),
    COPPER_LEGGINGS("copper_leggings"),
    COPPER_BOOTS("copper_boots"),
    COPPER_NUGGET("copper_nugget");

    private final Identifier identifier;
    private final String id;

    private ItemIdentifiers(String id) {
        this.id = id;
        this.identifier = new Identifier(CopperStuff.MOD_ID, id);
    }

    public String getId() {
        return id;
    }

    public Identifier getIdentifier() {
        return identifier;
    }
}
