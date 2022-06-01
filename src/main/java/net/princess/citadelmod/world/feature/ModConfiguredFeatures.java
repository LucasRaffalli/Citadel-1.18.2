package net.princess.citadelmod.world.feature;
import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.data.worldgen.features.TreeFeatures;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.WeightedPlacedFeature;
import net.minecraft.world.level.levelgen.feature.configurations.*;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.BlobFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.trunkplacers.StraightTrunkPlacer;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.princess.citadelmod.block.ModBlocks;

import java.util.List;

public class ModConfiguredFeatures {
        public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> SAKURA_TREE =
                FeatureUtils.register("sakura", Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                        BlockStateProvider.simple(ModBlocks.SAKURA_LOG.get()),
                        new StraightTrunkPlacer(2, 2, 2),
                        BlockStateProvider.simple(ModBlocks.SAKURA_LEAVES.get()),
                        new BlobFoliagePlacer(ConstantInt.of(3), ConstantInt.of(2), 2),
                        new TwoLayersFeatureSize(1, 1, 1)).build());

        public static final Holder<PlacedFeature> SAKURA_CHECKED = PlacementUtils.register("sakura_checked", SAKURA_TREE,
                PlacementUtils.filteredByBlockSurvival(ModBlocks.SAKURA_SAPLING.get()));

        public static final Holder<ConfiguredFeature<RandomFeatureConfiguration, ?>> SAKURA_SPAWN =
                FeatureUtils.register("sakura_spawn", Feature.RANDOM_SELECTOR,
                        new RandomFeatureConfiguration(List.of(new WeightedPlacedFeature(SAKURA_CHECKED,
                                0.3F)), SAKURA_CHECKED));


        public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> ARCHAIC_FLOWER =
                FeatureUtils.register("flower_archaic", Feature.FLOWER,
                        new RandomPatchConfiguration(32, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                                new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.ARCHAIC_FLOWER.get())))));



        public static final List<OreConfiguration.TargetBlockState> OVERWORLD_ZORIUM_ORES = List.of(
                OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.ZORIUM_ORE.get().defaultBlockState()),
                OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_ZORIUM_ORE.get().defaultBlockState()));

        public static final Holder<ConfiguredFeature<OreConfiguration, ?>> ZORIUM_ORE = FeatureUtils.register("zorium_ore",
                Feature.ORE, new OreConfiguration(OVERWORLD_ZORIUM_ORES,5,1.0f));

}