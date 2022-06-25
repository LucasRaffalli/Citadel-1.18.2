package net.princess.citadelmod.block.entity;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.princess.citadelmod.CitadelMod;
import net.princess.citadelmod.block.ModBlocks;
import net.princess.citadelmod.block.entity.custom.ForgeStationBlockEntity;

public class ModBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES, CitadelMod.MOD_ID);

    public static final RegistryObject<BlockEntityType<ForgeStationBlockEntity>> FORGE_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("forge_station_block_entity", () ->
                    BlockEntityType.Builder.of(ForgeStationBlockEntity::new,
                            ModBlocks.FORGE_STATION.get()).build(null));


    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }
}