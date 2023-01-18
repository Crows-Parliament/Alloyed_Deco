package com.crow.alloyed_deco.item;

import com.crow.alloyed_deco.AlloyedDeco;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems
{
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, AlloyedDeco.MOD_ID);

//bronze coin
    public static final RegistryObject<Item> BRONZECOIN = ITEMS.register("bronze_coin",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.ALLOYEDDECOTAB)));

//oxidized bronze coin
    public static final RegistryObject<Item> OXIDIZEDBRONZECOIN = ITEMS.register("oxidized_bronze_coin",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.ALLOYEDDECOTAB)));

    public static void register(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }
}
