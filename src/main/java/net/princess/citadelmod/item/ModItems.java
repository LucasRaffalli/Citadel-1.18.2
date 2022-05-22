package net.princess.citadelmod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.princess.citadelmod.CitadelMod;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, CitadelMod.MOD_ID);


    public static final RegistryObject<Item> ZORIUM_INGOT = ITEMS.register("zorium_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.CITADEL_MOD)));

    public static final RegistryObject<Item> ZORIUM_NUGGET = ITEMS.register("zorium_nugget",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.CITADEL_MOD)));

    public static final RegistryObject<Item> RAW_ZORIUM = ITEMS.register("raw_zorium",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.CITADEL_MOD)));

    public static final RegistryObject<Item> BURNING_RAW_ZORIUM = ITEMS.register("burning_raw_zorium",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.CITADEL_MOD)));


    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }


}
