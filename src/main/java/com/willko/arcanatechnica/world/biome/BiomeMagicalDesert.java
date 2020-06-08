package com.willko.arcanatechnica.world.biome;

import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.DesertBiome;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.IFeatureConfig;
import net.minecraft.world.gen.feature.structure.MineshaftConfig;
import net.minecraft.world.gen.feature.structure.MineshaftStructure;
import net.minecraft.world.gen.feature.structure.VillageConfig;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilder;

public class BiomeMagicalDesert extends Biome {
    protected BiomeMagicalDesert() {

        super((new Biome.Builder()).surfaceBuilder(SurfaceBuilder.DEFAULT,
                SurfaceBuilder.SAND_CONFIG).precipitation(RainType.NONE)
                .category(Category.DESERT).depth(.3f).scale(0.3f)
                .temperature(2f).downfall(0f).waterColor(0xc2b9f8)
                .waterFogColor(0xb1a7f6).parent((String) null));
        DesertBiome b;
        this.addStructure(Feature.VILLAGE.withConfiguration(new VillageConfig("village/desert/town_centers", 6)));
        this.addStructure(Feature.PILLAGER_OUTPOST.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG));
        this.addStructure(Feature.DESERT_PYRAMID.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG));
        this.addStructure(Feature.MINESHAFT.withConfiguration(new MineshaftConfig(0.004D, MineshaftStructure.Type.NORMAL)));
        this.addStructure(Feature.STRONGHOLD.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG));

    }
}
