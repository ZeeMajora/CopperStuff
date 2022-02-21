package me.puyodead1.copperstuff.common.datagen;

import me.puyodead1.copperstuff.CopperStuff;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class CSBlockStates extends BlockStateProvider {

    public CSBlockStates(DataGenerator gen, ExistingFileHelper helper) {
        super(gen, CopperStuff.MOD_ID, helper);
    }

    @Override
    protected void registerStatesAndModels() {
    }
}
