package me.puyodead1.copperstuff.common.datagen;

import me.puyodead1.copperstuff.CopperStuff;
import me.puyodead1.copperstuff.common.registry.ItemRegistry;
import net.minecraft.advancements.critereon.InventoryChangeTrigger;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.world.item.Items;
import net.minecraftforge.common.Tags;
import org.jetbrains.annotations.NotNull;

import java.util.function.Consumer;

public class CSRecipes extends RecipeProvider {

    public CSRecipes(DataGenerator generatorIn) {
        super(generatorIn);
    }

    @Override
    protected void buildCraftingRecipes(@NotNull Consumer<FinishedRecipe> consumer) {
        ShapedRecipeBuilder.shaped(ItemRegistry.COPPER_PICKAXE.get())
                .pattern("ccc")
                .pattern(" s ")
                .pattern(" s ")
                .define('c', Tags.Items.INGOTS_COPPER)
                .define('s', Items.STICK)
                .group(CopperStuff.MOD_ID)
                .unlockedBy("copper", InventoryChangeTrigger.TriggerInstance.hasItems(Items.COPPER_INGOT))
                .save(consumer);
    }
}