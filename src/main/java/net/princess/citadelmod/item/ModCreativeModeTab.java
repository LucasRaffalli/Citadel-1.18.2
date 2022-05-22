package net.princess.citadelmod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab CITADEL_MOD = new CreativeModeTab("citadeltab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.RAW_ZORIUM.get());
        }
    };
}
