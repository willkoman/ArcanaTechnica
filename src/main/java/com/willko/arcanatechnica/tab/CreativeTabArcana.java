package com.willko.arcanatechnica.tab;

import com.willko.arcanatechnica.init.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;


public class CreativeTabArcana extends ItemGroup {
    public CreativeTabArcana() {
        super("arcana_technica");
    }

    @Override
    public ItemStack createIcon() {
        return new ItemStack(ModBlocks.ARCANE_PEDESTAL.get());
    }
}
