package com.willko.arcanatechnica.block;


import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class ArcaneOre extends Block {
    public ArcaneOre() {
        super(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f,30f).harvestTool(ToolType.PICKAXE).harvestLevel(2));
    }
}
