package com.willko.arcanatechnica;

import com.willko.arcanatechnica.block.ArcaneTorch;
import com.willko.arcanatechnica.init.ModBlocks;
import com.willko.arcanatechnica.init.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.InterModComms;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


@Mod(ArcanaTechnica.MOD_ID)
public class ArcanaTechnica
{
    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "arcanatechnica";
    public ArcanaTechnica(){
        ModItems.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        ModBlocks.BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);
    }
    private void doClientStuff(final FMLClientSetupEvent event) {
        // do something that can only be done on the client
        RenderTypeLookup.setRenderLayer(ModBlocks.ARCANE_TORCH.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.ARCANE_WALL_TORCH.get(), RenderType.getCutout());
        LOGGER.info("Got game settings {}", event.getMinecraftSupplier().get().gameSettings);
    }
}
