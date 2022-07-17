package net.princess.citadelmod.datagen;

import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ConfiguredModel;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.princess.citadelmod.CitadelMod;
import net.princess.citadelmod.block.ModBlocks;

import java.util.function.Function;

public class ModBlocksStateProvider extends BlockStateProvider {
    public ModBlocksStateProvider(DataGenerator gen, ExistingFileHelper exFileHelper) {
        super(gen, CitadelMod.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        simpleBlock(ModBlocks.ZORIUM_BLOCK.get());
        simpleBlock(ModBlocks.RAW_ZORIUM_BLOCK.get());
        simpleBlock(ModBlocks.ZORIUM_ORE.get());
        simpleBlock(ModBlocks.DEEPSLATE_ZORIUM_ORE.get());

        fenceBlock((FenceBlock) ModBlocks.SAKURA_FENCE.get(), blockTexture(ModBlocks.ZORIUM_BLOCK.get()));

        fenceGateBlock((FenceGateBlock) ModBlocks.SAKURA_FENCE_GATE.get(), blockTexture(ModBlocks.ZORIUM_BLOCK.get()));
        slabBlock((SlabBlock) ModBlocks.SAKURA_SLAB.get(), blockTexture(ModBlocks.ZORIUM_BLOCK.get()),
                blockTexture(ModBlocks.ZORIUM_BLOCK.get()));
        stairsBlock((StairBlock) ModBlocks.SAKURA_STAIRS.get(), blockTexture(ModBlocks.ZORIUM_BLOCK.get()));

        doorBlock((DoorBlock) ModBlocks.SAKURA_DOOR.get(), new ResourceLocation(CitadelMod.MOD_ID, "block/sakura_door_bottom"),
                new ResourceLocation(CitadelMod.MOD_ID, "block/sakura_door_top"));
        trapdoorBlock((TrapDoorBlock) ModBlocks.SAKURA_TRAPDOOR.get(), blockTexture(ModBlocks.SAKURA_TRAPDOOR.get()), true);

        logBlock((RotatedPillarBlock) ModBlocks.SAKURA_LOG.get());
        axisBlock((RotatedPillarBlock) ModBlocks.SAKURA_WOOD.get(), blockTexture(ModBlocks.SAKURA_LOG.get()), blockTexture(ModBlocks.SAKURA_LOG.get()));
        axisBlock((RotatedPillarBlock) ModBlocks.STRIPPED_SAKURA_LOG.get(), new ResourceLocation(CitadelMod.MOD_ID, "block/stripped_sakura_log"),
                new ResourceLocation(CitadelMod.MOD_ID, "block/stripped_sakura_top"));
        axisBlock((RotatedPillarBlock) ModBlocks.STRIPPED_SAKURA_WOOD.get(), new ResourceLocation(CitadelMod.MOD_ID, "block/stripped_sakura_log"),
                new ResourceLocation(CitadelMod.MOD_ID, "block/stripped_sakura_top"));

        simpleBlock(ModBlocks.SAKURA_PLANKS.get());
        simpleBlock(ModBlocks.SAKURA_LEAVES.get());


        simpleBlock(ModBlocks.ARCHAIC_FLOWER.get(), models().cross(ModBlocks.ARCHAIC_FLOWER.get().getRegistryName().getPath(),
                blockTexture(ModBlocks.ARCHAIC_FLOWER.get())));
        simpleBlock(ModBlocks.SAKURA_SAPLING.get(), models().cross(ModBlocks.SAKURA_SAPLING.get().getRegistryName().getPath(),
                blockTexture(ModBlocks.SAKURA_SAPLING.get())));

        simpleBlock(ModBlocks.POTTED_ARCHAIC_FLOWER.get(), flowerPotCross(ModBlocks.POTTED_ARCHAIC_FLOWER.get().getRegistryName().getPath()));


    }

    public ModelFile flowerPotCross(String name) {
        return models().withExistingParent(name, "flower_pot_cross");
    }

    public void makeCrop(CropBlock block, String modelName, String textureName) {
        Function<BlockState, ConfiguredModel[]> function = state -> states(state, block, modelName, textureName);

        getVariantBuilder(block).forAllStates(function);
    }

    private ConfiguredModel[] states(BlockState state, CropBlock block, String modelName, String textureName) {
        ConfiguredModel[] models = new ConfiguredModel[1];
        models[0] = new ConfiguredModel(models().crop(modelName + state.getValue(block.getAgeProperty()),
                new ResourceLocation(CitadelMod.MOD_ID, "block/" + textureName + state.getValue(block.getAgeProperty()))));

        return models;
    }
}