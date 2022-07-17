package net.princess.citadelmod.datagen;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;
import net.princess.citadelmod.CitadelMod;

@Mod.EventBusSubscriber(modid = CitadelMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();

        generator.addProvider(new ModRecipeProvider(generator));

        generator.addProvider(new ModLootTableProvider(generator));
        generator.addProvider(new ModBlocksStateProvider(generator, existingFileHelper));
        generator.addProvider(new ModItemModelProvider(generator, existingFileHelper));
    }
}
