package com.smballard092.expandedmobsmod;

import net.fabricmc.api.ModInitializer;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.levelgen.feature.StructureFeature;
import net.minecraft.world.level.levelgen.feature.configurations.StructureFeatureConfiguration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public
class ExpandedMobsMod implements ModInitializer {
    public static final String MOD_ID = "expandedmobsmod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("Initializing Expanded Mobs Mod");
        registerBiomes();
        registerStructures();
        registerMobs();
    }

    private void registerBiomes() {
        // Register new biomes
        Registry.register(BuiltInRegistries.BIOME, "expandedmobsmod:new_biome", new Biome.BiomeBuilder().build());
    }

    private void registerStructures() {
        // Register new structures
        Registry.register(BuiltInRegistries.STRUCTURE_FEATURE, "expandedmobsmod:new_structure", new StructureFeature<>(StructureFeatureConfiguration.CODEC));
    }

    private void registerMobs() {
        // Register new mobs
        Registry.register(BuiltInRegistries.ENTITY_TYPE, "expandedmobsmod:flowper", EntityType.Builder.of((EntityType.EntityFactory<Flowper>) Flowper::new, MobCategory.MONSTER).sized(0.5f, 0.5f).build("flowper"));
    }
}
