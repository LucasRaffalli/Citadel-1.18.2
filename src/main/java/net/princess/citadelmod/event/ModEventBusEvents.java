package net.princess.citadelmod.event;

import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.common.loot.GlobalLootModifierSerializer;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.princess.citadelmod.CitadelMod;
import net.princess.citadelmod.event.loot.WingsPhantomAdditionModifiers;

import javax.annotation.Nonnull;

@Mod.EventBusSubscriber(modid = CitadelMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {

    @SubscribeEvent
    public static void registerModifierSerializers(@Nonnull final RegistryEvent.Register<GlobalLootModifierSerializer<?>>
                                                           event) {
        event.getRegistry().registerAll(
                new WingsPhantomAdditionModifiers.Serializer().setRegistryName
                        (new ResourceLocation(CitadelMod.MOD_ID,"wings_from_phantom"))
        );
    }
}