package com.willko.arcanatechnica.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ArcanePedestal extends Block {
    public ArcanePedestal() {
        super(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f,30f));
    }
}
