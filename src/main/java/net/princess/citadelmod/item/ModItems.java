package net.princess.citadelmod.item;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.princess.citadelmod.CitadelMod;
import net.princess.citadelmod.item.custom.ModArmorItem;

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

   public static final RegistryObject<Item> NETHERITE_HAMMER = ITEMS.register("netherite_hammer",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.CITADEL_MOD)));



   public static final RegistryObject<Item> ZORIUM_PICKAXE = ITEMS.register("zorium_pickaxe",
           () -> new PickaxeItem(Modtiers.ZORIUM,1,-1.6f,
                   new Item.Properties().tab(ModCreativeModeTab.CITADEL_MOD)));

    public static final RegistryObject<Item> ZORIUM_AXE = ITEMS.register("zorium_axe",
            () -> new AxeItem(Modtiers.ZORIUM,8,-1.8f,
                    new Item.Properties().tab(ModCreativeModeTab.CITADEL_MOD)));

    public static final RegistryObject<Item> ZORIUM_SWORD = ITEMS.register("zorium_sword",
            () -> new SwordItem(Modtiers.ZORIUM,8,-1f,
                    new Item.Properties().tab(ModCreativeModeTab.CITADEL_MOD)));

    public static final RegistryObject<Item> ZORIUM_HOE = ITEMS.register("zorium_hoe",
            () -> new HoeItem(Modtiers.ZORIUM,1,-1.6f,
                    new Item.Properties().tab(ModCreativeModeTab.CITADEL_MOD)));

    public static final RegistryObject<Item> ZORIUM_SHOVEL = ITEMS.register("zorium_shovel",
            () -> new ShovelItem(Modtiers.ZORIUM,1,-1.6f,
                    new Item.Properties().tab(ModCreativeModeTab.CITADEL_MOD)));



    public static final RegistryObject<Item> SAKURABOW = ITEMS.register("sakurabow",
            () -> new BowItem(new Item.Properties().tab(ModCreativeModeTab.CITADEL_MOD).durability(1400)));



    public static final RegistryObject<Item> ZORIUM_HELMET = ITEMS.register("zorium_helmet",
            () -> new ArmorItem(ModArmorMaterials.ZORIUM, EquipmentSlot.HEAD,
                    new Item.Properties().tab(ModCreativeModeTab.CITADEL_MOD)));

    public static final RegistryObject<Item> ZORIUM_CHESTPLATE = ITEMS.register("zorium_chestplate",
            () -> new ModArmorItem(ModArmorMaterials.ZORIUM, EquipmentSlot.CHEST,
                    new Item.Properties().tab(ModCreativeModeTab.CITADEL_MOD)));

    public static final RegistryObject<Item> ZORIUM_LEGGING = ITEMS.register("zorium_leggings",
            () -> new ArmorItem(ModArmorMaterials.ZORIUM, EquipmentSlot.LEGS,
                    new Item.Properties().tab(ModCreativeModeTab.CITADEL_MOD)));

    public static final RegistryObject<Item> ZORIUM_BOOTs = ITEMS.register("zorium_boots",
            () -> new ArmorItem(ModArmorMaterials.ZORIUM, EquipmentSlot.FEET,
                    new Item.Properties().tab(ModCreativeModeTab.CITADEL_MOD)));














    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }


}
