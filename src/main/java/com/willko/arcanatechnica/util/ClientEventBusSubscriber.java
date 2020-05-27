package com.willko.arcanatechnica.util;

import com.willko.arcanatechnica.ArcanaTechnica;
import com.willko.arcanatechnica.gui.ArcanePedestalScreen;
import com.willko.arcanatechnica.init.ModContainers;
import net.minecraft.client.gui.ScreenManager;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = ArcanaTechnica.MOD_ID,bus = Mod.EventBusSubscriber.Bus.MOD,value= Dist.CLIENT)
public class ClientEventBusSubscriber {
    @SubscribeEvent
    public static void clientSetup(FMLClientSetupEvent event){
        ScreenManager.registerFactory(ModContainers.ARCANE_PEDESTAL.get(), ArcanePedestalScreen::new);
    }
}
