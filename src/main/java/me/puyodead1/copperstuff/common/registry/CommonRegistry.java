package me.puyodead1.copperstuff.common.registry;

import me.puyodead1.copperstuff.CopperStuff;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import org.jetbrains.annotations.NotNull;

public class CommonRegistry {
    public static final CreativeModeTab CREATIVE_MODE_TAB = new CreativeModeTab(CopperStuff.MOD_ID) {
        @Override
        public @NotNull ItemStack makeIcon() {
            return new ItemStack(Items.DIAMOND);
        }
    };

}
