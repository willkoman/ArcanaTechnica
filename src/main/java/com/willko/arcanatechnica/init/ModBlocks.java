package com.willko.arcanatechnica.init;

import com.willko.arcanatechnica.ArcanaTechnica;
import com.willko.arcanatechnica.block.*;
import net.minecraft.block.Block;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<Block>(ForgeRegistries.BLOCKS, ArcanaTechnica.MOD_ID);


    public static final RegistryObject<Block> RITUAL_BRICKS = BLOCKS.register("ritual_bricks",()->new RitualBricks());
    public static final RegistryObject<Block> ARCANE_PEDESTAL = BLOCKS.register("arcane_pedestal",()->new ArcanePedestal());
    public static final RegistryObject<Block> ARCANE_TORCH = BLOCKS.register("arcane_torch",()->new ArcaneTorch());
    public static final RegistryObject<Block> ARCANE_WALL_TORCH = BLOCKS.register("arcane_wall_torch",()->new ArcaneWallTorch());
    public static final RegistryObject<Block> RITUAL_STAIRS = BLOCKS.register("ritual_stairs",()->new RitualStairs(RITUAL_BRICKS.get().getDefaultState()));
    public static final RegistryObject<Block> ARCANE_ORE = BLOCKS.register("arcane_ore",()->new ArcaneOre());
}
