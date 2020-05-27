package com.willko.arcanatechnica.init;

import com.willko.arcanatechnica.ArcanaTechnica;
import com.willko.arcanatechnica.containers.ArcanePedestalContainer;
import net.minecraft.inventory.container.ContainerType;
import net.minecraftforge.common.extensions.IForgeContainerType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;


public class ModContainers {
    public static final DeferredRegister<ContainerType<?>> CONTAINER_TYPES = new DeferredRegister<>(
            ForgeRegistries.CONTAINERS, ArcanaTechnica.MOD_ID);

    public static final RegistryObject<ContainerType<ArcanePedestalContainer>> ARCANE_PEDESTAL = CONTAINER_TYPES
            .register("arcane_pedestal", () -> IForgeContainerType.create(ArcanePedestalContainer::new));
}
