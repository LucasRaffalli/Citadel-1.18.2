package net.princess.citadelmod.world.feature;

import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.princess.citadelmod.CitadelMod;
import net.princess.citadelmod.world.gen.ModFlowerGeneration;
import net.princess.citadelmod.world.gen.ModOreGeneration;
import net.princess.citadelmod.world.gen.ModTreeGeneration;

@Mod.EventBusSubscriber(modid = CitadelMod.MOD_ID)
public class ModWorldEvents {

    @SubscribeEvent
    public static void biomeLoadingEvent(final BiomeLoadingEvent event) {
        ModTreeGeneration.generateTrees(event);
        ModFlowerGeneration.generateFlowers(event);
        ModOreGeneration.generateOres(event);
    }


}