package me.puyodead1.copperstuff.common.datagen;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.loot.LootTableProvider;
import org.jetbrains.annotations.NotNull;

public class CSLootTables extends LootTableProvider {

    public CSLootTables(DataGenerator dataGeneratorIn) {
        super(dataGeneratorIn);
    }

    @Override
    public @NotNull String getName() {
        return "CopperStuff LootTables";
    }
}