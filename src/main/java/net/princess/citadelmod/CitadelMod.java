package net.princess.citadelmod;

import com.mojang.logging.LogUtils;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FlowerPotBlock;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.princess.citadelmod.block.ModBlocks;
import net.princess.citadelmod.block.entity.ModBlockEntities;
import net.princess.citadelmod.item.ModItems;
import net.princess.citadelmod.painting.ModPaintings;
import net.princess.citadelmod.recipe.ModRecipes;
import net.princess.citadelmod.screen.ForgeStationScreen;
import net.princess.citadelmod.screen.ModMenuTypes;
import net.princess.citadelmod.util.ModItemProperties;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(CitadelMod.MOD_ID)
public class CitadelMod {
    public static final String MOD_ID = "citadelmod";

    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();

    public CitadelMod()
    {

        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(eventBus);
        ModBlocks.register(eventBus);
        ModPaintings.register(eventBus);

        ModBlockEntities.register(eventBus);
        ModMenuTypes.register(eventBus);

        ModRecipes.register(eventBus);

        eventBus.addListener(this::setup);
        eventBus.addListener(this::clientSetup);
        
        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);

    }

    private void clientSetup(final FMLClientSetupEvent event) {

        ItemBlockRenderTypes.setRenderLayer(ModBlocks.SAKURA_LEAVES.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.SAKURA_SAPLING.get(), RenderType.cutout());

        ItemBlockRenderTypes.setRenderLayer(ModBlocks.ARCHAIC_FLOWER.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.POTTED_ARCHAIC_FLOWER.get(), RenderType.cutout());

        ItemBlockRenderTypes.setRenderLayer(ModBlocks.FORGE_STATION.get(), RenderType.translucent());
        MenuScreens.register(ModMenuTypes.FORGE_STATION_MENU.get(), ForgeStationScreen::new);


        ModItemProperties.addCustomItemProperties();
    }



    private void setup(final FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.ARCHAIC_FLOWER.getId(), ModBlocks.POTTED_ARCHAIC_FLOWER);
        });
    }
}
