package com.willko.arcanatechnica;

import com.willko.arcanatechnica.block.ArcanePedestal;
import com.willko.arcanatechnica.init.ModBlocks;
import com.willko.arcanatechnica.init.ModContainers;
import com.willko.arcanatechnica.init.ModItems;
import com.willko.arcanatechnica.init.ModTileEntities;
import com.willko.arcanatechnica.tab.CreativeTabArcana;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


@Mod(ArcanaTechnica.MOD_ID)
@Mod.EventBusSubscriber(modid = ArcanaTechnica.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ArcanaTechnica
{
    public static ArcanaTechnica instance;
    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "arcanatechnica";
    public static final ItemGroup TAB_ARCANA = new CreativeTabArcana();

    public ArcanaTechnica(){
        final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        modEventBus.addListener(this::doClientStuff);

        ModItems.ITEMS.register(modEventBus);
        ModBlocks.BLOCKS.register(modEventBus);
        ModTileEntities.TILE_ENTITY_TYPES.register(modEventBus);
        ModContainers.CONTAINER_TYPES.register(modEventBus);

        instance=this;
        MinecraftForge.EVENT_BUS.register(this);
        LOGGER.info("Initial Registration Complete");
    }
    private void doClientStuff(final FMLClientSetupEvent event) {
        RenderTypeLookup.setRenderLayer(ModBlocks.ARCANE_TORCH.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.ARCANE_WALL_TORCH.get(), RenderType.getCutout());
        LOGGER.info("Client Setup Complete");

    }
}
