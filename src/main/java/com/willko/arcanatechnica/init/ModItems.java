package com.willko.arcanatechnica.init;

import com.willko.arcanatechnica.ArcanaTechnica;
import com.willko.arcanatechnica.item.ArcaneBlend;
import net.minecraft.block.Blocks;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.WallOrFloorItem;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, ArcanaTechnica.MOD_ID);

    public static final RegistryObject<Item> ARCANE_BLEND = ITEMS.register("arcane_blend",()->new ArcaneBlend());
    public static final RegistryObject<Item> RITUAL_BRICKS = ITEMS.register("ritual_bricks",()->new BlockItem(ModBlocks.RITUAL_BRICKS.get(),new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<Item> ARCANE_PEDESTAL = ITEMS.register("arcane_pedestal",()->new BlockItem(ModBlocks.ARCANE_PEDESTAL.get(),new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<Item> RITUAL_STAIRS = ITEMS.register("ritual_stairs",()->new BlockItem(ModBlocks.RITUAL_STAIRS.get(),new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<Item> ARCANE_TORCH = ITEMS.register("arcane_torch",()->new WallOrFloorItem(ModBlocks.ARCANE_TORCH.get(), ModBlocks.ARCANE_WALL_TORCH.get(), (new Item.Properties()).group(ItemGroup.DECORATIONS)));


}
