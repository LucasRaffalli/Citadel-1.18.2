package net.princess.citadelmod.item;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class Modtiers {
    public static final ForgeTier ZORIUM = new ForgeTier(8,2200,12.5f,2.5f,25, BlockTags.NEEDS_DIAMOND_TOOL,
            () -> Ingredient.of(ModItems.ZORIUM_INGOT.get()));
}
