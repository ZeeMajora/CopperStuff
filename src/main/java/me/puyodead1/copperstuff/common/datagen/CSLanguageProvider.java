package me.puyodead1.copperstuff.common.datagen;

import me.puyodead1.copperstuff.CopperStuff;
import me.puyodead1.copperstuff.common.registry.ItemRegistry;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;

public class CSLanguageProvider extends LanguageProvider {

    public CSLanguageProvider(DataGenerator gen, String locale) {
        super(gen, CopperStuff.MOD_ID, locale);
    }

    @Override
    protected void addTranslations() {
        add("itemGroup." + CopperStuff.MOD_ID, CopperStuff.MOD_NAME);
        add(ItemRegistry.COPPER_PICKAXE.get(), "Copper Pickaxe");
    }
}
