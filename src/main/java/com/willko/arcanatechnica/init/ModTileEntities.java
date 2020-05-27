package com.willko.arcanatechnica.init;

import com.willko.arcanatechnica.ArcanaTechnica;
import com.willko.arcanatechnica.tile.ArcanePedestalTile;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;


public class ModTileEntities {
    public static final DeferredRegister<TileEntityType<?>> TILE_ENTITY_TYPES = new DeferredRegister<>(
            ForgeRegistries.TILE_ENTITIES, ArcanaTechnica.MOD_ID);


    public static final RegistryObject<TileEntityType<ArcanePedestalTile>> ARCANE_PEDESTAL = TILE_ENTITY_TYPES
            .register("arcane_pedestal", () -> TileEntityType.Builder
                    .create(ArcanePedestalTile::new, ModBlocks.ARCANE_PEDESTAL.get()).build(null));


}
