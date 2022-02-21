package me.puyodead1.copperstuff.common.datagen;

import me.puyodead1.copperstuff.CopperStuff;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class CSItemTags extends ItemTagsProvider {

    public CSItemTags(DataGenerator generator, BlockTagsProvider blockTags, ExistingFileHelper helper) {
        super(generator, blockTags, CopperStuff.MOD_ID, helper);
    }

    @Override
    protected void addTags() {
//        tag(Tags.Items.ORES)
//                .add(Registration.MYSTERIOUS_ORE_OVERWORLD_ITEM.get())
//                .add(Registration.MYSTERIOUS_ORE_NETHER_ITEM.get())
//                .add(Registration.MYSTERIOUS_ORE_END_ITEM.get())
//                .add(Registration.MYSTERIOUS_ORE_DEEPSLATE_ITEM.get());

    }

    @Override
    public String getName() {
        return "Tutorial Tags";
    }
}