package net.princess.citadelmod.painting;

import net.minecraft.world.entity.decoration.Motive;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.princess.citadelmod.CitadelMod;

public class ModPaintings {
    public static final DeferredRegister<Motive> PAINTING_MOVTIES =
            DeferredRegister.create(ForgeRegistries.PAINTING_TYPES, CitadelMod.MOD_ID);


    public static final RegistryObject<Motive> raton =
            PAINTING_MOVTIES.register("raton", () -> new Motive(32, 32));
    public static final RegistryObject<Motive> PRINCESS32X =
            PAINTING_MOVTIES.register("princess32x", () -> new Motive(32, 32));
    public static final RegistryObject<Motive> PRINCESS16X =
            PAINTING_MOVTIES.register("princess16x", () -> new Motive(16, 16));


    public static void register(IEventBus eventBus) {
        PAINTING_MOVTIES.register(eventBus);
    }
}
