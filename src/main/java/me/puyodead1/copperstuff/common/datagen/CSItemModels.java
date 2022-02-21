package me.puyodead1.copperstuff.common.datagen;

import me.puyodead1.copperstuff.CopperStuff;
import me.puyodead1.copperstuff.common.registry.ItemRegistry;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class CSItemModels extends ItemModelProvider {

    public CSItemModels(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, CopperStuff.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        singleTexture(ItemRegistry.COPPER_PICKAXE.get().getRegistryName().getPath(),
                mcLoc("item/handheld"),
                "layer0", modLoc("item/copper_pickaxe"));
    }
}
