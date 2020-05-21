package com.willko.arcanatechnica.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class RitualBricks extends Block {
    public RitualBricks() {
        super(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f,30f));
    }
}
