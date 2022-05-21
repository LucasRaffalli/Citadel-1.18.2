package net.princess.citadelmod.block;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.princess.citadelmod.CitadelMod;
import net.princess.citadelmod.item.ModItems;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, CitadelMod.MOD_ID);

    public static final RegistryObject<Block> ZORIUM_BLOCK = registerBlock("zorium_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(7f,2).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);

    public static final RegistryObject<Block> ZORIUM_ORE = registerBlock("zorium_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(7f,2).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);

    public static final RegistryObject<Block> DEEPSLATE_ZORIUM_BLOCK = registerBlock("deepslate_zorium_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(7,3).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);




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


