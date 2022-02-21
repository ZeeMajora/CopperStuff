package me.puyodead1.copperstuff.common.datagen;

import me.puyodead1.copperstuff.CopperStuff;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class CSBlockTags extends BlockTagsProvider {

    public CSBlockTags(DataGenerator generator, ExistingFileHelper helper) {
        super(generator, CopperStuff.MOD_ID, helper);
    }

    @Override
    protected void addTags() {
//        tag(BlockTags.MINEABLE_WITH_PICKAXE)
//                .add(Registration.MYSTERIOUS_ORE_OVERWORLD.get())
//                .add(Registration.MYSTERIOUS_ORE_NETHER.get())
//                .add(Registration.MYSTERIOUS_ORE_END.get())
//                .add(Registration.MYSTERIOUS_ORE_DEEPSLATE.get());
//        tag(BlockTags.NEEDS_IRON_TOOL)
//                .add(Registration.MYSTERIOUS_ORE_OVERWORLD.get())
//                .add(Registration.MYSTERIOUS_ORE_NETHER.get())
//                .add(Registration.MYSTERIOUS_ORE_END.get())
//                .add(Registration.MYSTERIOUS_ORE_DEEPSLATE.get());
//        tag(Tags.Blocks.ORES)
//                .add(Registration.MYSTERIOUS_ORE_OVERWORLD.get())
//                .add(Registration.MYSTERIOUS_ORE_NETHER.get())
//                .add(Registration.MYSTERIOUS_ORE_END.get())
//                .add(Registration.MYSTERIOUS_ORE_DEEPSLATE.get());
    }

    @Override
    public String getName() {
        return "CopperStuff Block Tags";
    }
}