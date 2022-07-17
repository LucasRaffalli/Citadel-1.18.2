package net.princess.citadelmod.datagen;

import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import net.princess.citadelmod.block.ModBlocks;
import net.princess.citadelmod.datagen.custom.ForgeStationRecipeBuilder;
import net.princess.citadelmod.item.ModItems;

import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(DataGenerator pGenerator) {
        super(pGenerator);
    }

    @Override
    protected void buildCraftingRecipes(Consumer<FinishedRecipe> pFinishedRecipeConsumer) {

        ShapedRecipeBuilder.shaped(ModBlocks.SAKURA_DOOR.get())
                .define('E', ModBlocks.SAKURA_PLANKS.get())
                .pattern("EE")
                .pattern("EE")
                .pattern("EE")
                .unlockedBy("has_sakura_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.SAKURA_PLANKS.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(ModItems.ZORIUM_INGOT.get())
                .requires(ModBlocks.ZORIUM_BLOCK.get())
                .unlockedBy("has_zorium_block", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.ZORIUM_BLOCK.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ModBlocks.ZORIUM_BLOCK.get())
                .define('C', ModItems.ZORIUM_INGOT.get())
                .pattern("CCC")
                .pattern("CCC")
                .pattern("CCC")
                .unlockedBy("has_zorium", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.ZORIUM_INGOT.get()).build()))
                .save(pFinishedRecipeConsumer);

        new ForgeStationRecipeBuilder(ModItems.RAW_ZORIUM.get(), ModItems.ZORIUM_INGOT.get(), 1)
                .unlockedBy("has_raw_zorium", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.RAW_ZORIUM.get()).build())).save(pFinishedRecipeConsumer);

        new ForgeStationRecipeBuilder(ModBlocks.ZORIUM_ORE.get(), ModItems.RAW_ZORIUM.get(), 1)
                .unlockedBy("has_zorium_ore", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.ZORIUM_ORE.get()).build())).save(pFinishedRecipeConsumer);
    }
}