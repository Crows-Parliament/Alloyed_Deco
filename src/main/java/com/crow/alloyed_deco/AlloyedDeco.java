package com.crow.alloyed_deco;

import com.mojang.logging.LogUtils;
import com.simibubi.create.foundation.data.CreateRegistrate;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;
import vectorwing.farmersdelight.common.registry.ModBlocks;
import vectorwing.farmersdelight.common.registry.ModItems;

@Mod(AlloyedDeco.MOD_ID)
public class AlloyedDeco 
{
    public static final String MOD_ID = "alloyed_deco";
    private static final Logger LOGGER = LogUtils.getLogger();

    //compat with crystal clear
    //public static boolean isCrystalClearLoaded = false;

    public static final CreateRegistrate REGISTRATE = CreateRegistrate.create(MOD_ID);

    public AlloyedDeco()
    {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        MinecraftForge.EVENT_BUS.register(this);
        REGISTRATE.registerEventListeners(eventBus);

        //isCrystalClearLoaded = ModList.get().isLoaded();

        //ModItems.register();
        //ModBlocks.register();
    }

    public static ResourceLocation asResource(String path)
    {
        return new ResourceLocation(MOD_ID, path);
    }
}

