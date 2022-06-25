package net.princess.citadelmod.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.princess.citadelmod.CitadelMod;
import net.princess.citadelmod.block.custom.ForgeStation;
import net.princess.citadelmod.block.custom.ModFlammableRotatedPillarBlock;
import net.princess.citadelmod.item.ModCreativeModeTab;
import net.princess.citadelmod.item.ModItems;
import net.princess.citadelmod.world.feature.tree.SakuraTreeGrower;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, CitadelMod.MOD_ID);

    //3dmodel

    public static final RegistryObject<Block> FORGE_STATION = registerBlock("forge_station",
            () -> new ForgeStation(BlockBehaviour.Properties.of(Material.HEAVY_METAL).noOcclusion()
                    .strength(8f,5).requiresCorrectToolForDrops()), ModCreativeModeTab.CITADEL_MOD);



    //Blocks

    public static final RegistryObject<Block> ZORIUM_ORE = registerBlock("zorium_ore",
            () -> new OreBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(8f,5).requiresCorrectToolForDrops(), UniformInt.of(3,10)), ModCreativeModeTab.CITADEL_MOD);

    public static final RegistryObject<Block> DEEPSLATE_ZORIUM_ORE = registerBlock("deepslate_zorium_ore",
            () -> new OreBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(13f,5).requiresCorrectToolForDrops(), UniformInt.of(10,15)), ModCreativeModeTab.CITADEL_MOD);

    public static final RegistryObject<Block> ZORIUM_BLOCK = registerBlock("zorium_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(5f,5).requiresCorrectToolForDrops()), ModCreativeModeTab.CITADEL_MOD);

    public static final RegistryObject<Block> ZORIUM_BLOCKV2 = registerBlock("zorium_blockv2",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(5f,5).requiresCorrectToolForDrops()), ModCreativeModeTab.CITADEL_MOD);

    public static final RegistryObject<Block> ZORIUM_BLOCKV3 = registerBlock("zorium_blockv3",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(5f,5).requiresCorrectToolForDrops()), ModCreativeModeTab.CITADEL_MOD);




    public static final RegistryObject<Block> RAW_ZORIUM_BLOCK = registerBlock("raw_zorium_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(5f,5).requiresCorrectToolForDrops()), ModCreativeModeTab.CITADEL_MOD);

    public static final RegistryObject<Block> RAW_ZORIUM_BLOCKV2 = registerBlock("raw_zorium_blockv2",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(5f,5).requiresCorrectToolForDrops()), ModCreativeModeTab.CITADEL_MOD);


    public static final RegistryObject<Block> BURNING_RAW_ZORIUM_BLOCK = registerBlock("burning_raw_zorium_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(5f,5).requiresCorrectToolForDrops()), ModCreativeModeTab.CITADEL_MOD);


    public static final RegistryObject<Block> BURNING_RAW_ZORIUM_BLOCKV2 = registerBlock("burning_raw_zorium_blockv2",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(5f,5).requiresCorrectToolForDrops()), ModCreativeModeTab.CITADEL_MOD);




    public static final RegistryObject<Block> SAKURA_STAIRS = registerBlock("sakura_stairs",
            () -> new StairBlock(() -> ModBlocks.SAKURA_PLANKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.WOOD).strength(5f).requiresCorrectToolForDrops()), ModCreativeModeTab.CITADEL_MOD);

    public static final RegistryObject<Block> SAKURA_SLAB = registerBlock("sakura_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(5f).requiresCorrectToolForDrops()), ModCreativeModeTab.CITADEL_MOD);

    public static final RegistryObject<Block> SAKURA_FENCE = registerBlock("sakura_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(5f).requiresCorrectToolForDrops()), ModCreativeModeTab.CITADEL_MOD);

    public static final RegistryObject<Block> SAKURA_FENCE_GATE = registerBlock("sakura_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(5f).requiresCorrectToolForDrops()), ModCreativeModeTab.CITADEL_MOD);

    public static final RegistryObject<Block> SAKURA_TRAPDOOR = registerBlock("sakura_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(5f).requiresCorrectToolForDrops()), ModCreativeModeTab.CITADEL_MOD);

    public static final RegistryObject<Block> SAKURA_DOOR = registerBlock("sakura_door",
            () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(5f).requiresCorrectToolForDrops()), ModCreativeModeTab.CITADEL_MOD);




    public static final RegistryObject<Block> SAKURA_LOG = registerBlock("sakura_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)), ModCreativeModeTab.CITADEL_MOD);

    public static final RegistryObject<Block> SAKURA_WOOD = registerBlock("sakura_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)), ModCreativeModeTab.CITADEL_MOD);

    public static final RegistryObject<Block> STRIPPED_SAKURA_LOG = registerBlock("stripped_sakura_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG)), ModCreativeModeTab.CITADEL_MOD);

    public static final RegistryObject<Block> STRIPPED_SAKURA_WOOD = registerBlock("stripped_sakura_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)), ModCreativeModeTab.CITADEL_MOD);

    public static final RegistryObject<Block> SAKURA_PLANKS = registerBlock("sakura_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 20;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 5;
                }
            }, ModCreativeModeTab.CITADEL_MOD);


    public static final RegistryObject<Block> SAKURA_LEAVES = registerBlock("sakura_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 60;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 30;
                }
            }, ModCreativeModeTab.CITADEL_MOD);


    public static final RegistryObject<Block> SAKURA_SAPLING = registerBlock("sakura_sapling",
            () -> new SaplingBlock(new SakuraTreeGrower(),BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)), ModCreativeModeTab.CITADEL_MOD);


    public static final RegistryObject<Block> ARCHAIC_FLOWER = registerBlock("archaic_flower",
            () -> new FlowerBlock(MobEffects.REGENERATION,50,
                    BlockBehaviour.Properties.copy(Blocks.DANDELION).noOcclusion()), ModCreativeModeTab.CITADEL_MOD);

    public static final RegistryObject<Block> POTTED_ARCHAIC_FLOWER = registerBlockWithoutBlockItem("potted_archaic_flower",
            () -> new FlowerPotBlock(null, ModBlocks.ARCHAIC_FLOWER,
                    BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION).noOcclusion()), ModCreativeModeTab.CITADEL_MOD);




    private static <T extends Block> RegistryObject<T> registerBlockWithoutBlockItem(String name, Supplier<T> block, CreativeModeTab tab) {
        return BLOCKS.register(name, block);
    }


    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }
    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,CreativeModeTab tab) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(tab)));
    }
    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}



