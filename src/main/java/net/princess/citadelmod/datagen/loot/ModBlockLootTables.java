package net.princess.citadelmod.datagen.loot;

import net.minecraft.advancements.critereon.StatePropertiesPredicate;
import net.minecraft.data.loot.BlockLoot;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraftforge.registries.RegistryObject;
import net.princess.citadelmod.block.ModBlocks;
import net.princess.citadelmod.item.ModItems;

public class ModBlockLootTables extends BlockLoot {

    private static final float[] NORMAL_LEAVES_SAPLING_CHANCES = new float[] { 0.05F, 0.0625F, 0.083333336F, 0.1F };

    @Override
    protected void addTables() {
        this.dropSelf(ModBlocks.ZORIUM_BLOCK.get());
        this.dropSelf(ModBlocks.RAW_ZORIUM_BLOCK.get());

        this.add(ModBlocks.ZORIUM_ORE.get(),
                (block) -> createOreDrop(ModBlocks.ZORIUM_ORE.get(), ModItems.RAW_ZORIUM.get()));
        this.add(ModBlocks.DEEPSLATE_ZORIUM_ORE.get(),
                (block) -> createOreDrop(ModBlocks.DEEPSLATE_ZORIUM_ORE.get(), ModItems.RAW_ZORIUM.get()));
        

        this.add(ModBlocks.SAKURA_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(ModBlocks.SAKURA_FENCE.get());
        this.dropSelf(ModBlocks.SAKURA_FENCE_GATE.get());

        this.add(ModBlocks.SAKURA_DOOR.get(), BlockLoot::createDoorTable);
        this.add(ModBlocks.POTTED_ARCHAIC_FLOWER.get(), BlockLoot::createPotFlowerItemTable);


        this.dropSelf(ModBlocks.SAKURA_TRAPDOOR.get());
        this.dropSelf(ModBlocks.ARCHAIC_FLOWER.get());
        

        this.dropSelf(ModBlocks.SAKURA_LOG.get());
        this.dropSelf(ModBlocks.SAKURA_WOOD.get());
        this.dropSelf(ModBlocks.SAKURA_PLANKS.get());
        this.dropSelf(ModBlocks.STRIPPED_SAKURA_WOOD.get());
        this.dropSelf(ModBlocks.STRIPPED_SAKURA_LOG.get());

        this.add(ModBlocks.SAKURA_LEAVES.get(), (block) ->
                createLeavesDrops(block, ModBlocks.SAKURA_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));

        this.dropSelf(ModBlocks.SAKURA_SAPLING.get());
        this.dropSelf(ModBlocks.FORGE_STATION.get());


    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}