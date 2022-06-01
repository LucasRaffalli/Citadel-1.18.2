package net.princess.citadelmod.world.feature;

import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.placement.VegetationPlacements;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.placement.*;

public class ModPlacedFeatures {
    public static final Holder<PlacedFeature> SAKURA_PLACED = PlacementUtils.register("sakura_placed",
            ModConfiguredFeatures.SAKURA_SPAWN, VegetationPlacements.treePlacement(
                    PlacementUtils.countExtra(1, 0.5f, 2)));


    public static final Holder<PlacedFeature> ARCHAIC_FLOWER_PLACED = PlacementUtils.register("archaic_flower_placed",
            ModConfiguredFeatures.ARCHAIC_FLOWER, RarityFilter.onAverageOnceEvery(16),
            InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());



    public static final Holder<PlacedFeature> ZORIUM_ORE_PLACED = PlacementUtils.register("zorium_ore_placed",
            ModConfiguredFeatures.ZORIUM_ORE, ModOrePlacement.commonOrePlacement(8, // VeinsPerChunk
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80))));

}