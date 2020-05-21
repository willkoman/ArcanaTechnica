package com.willko.arcanatechnica.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.StairsBlock;

public class RitualStairs extends StairsBlock {
    public RitualStairs(BlockState state){
        super(state, Block.Properties.from(Blocks.STONE_BRICK_STAIRS));
    }
}
