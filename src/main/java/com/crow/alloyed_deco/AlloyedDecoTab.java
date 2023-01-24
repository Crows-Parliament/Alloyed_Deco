package com.crow.alloyed_deco;

import com.crow.alloyed_deco.registry.ModItems;
import com.simibubi.create.foundation.data.CreateRegistrate;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class AlloyedDecoTab
{
    //creating the tab
    public static final CreativeModeTab ALLOYED_DECO_TAB = new CreativeModeTab("alloyed_deco")
    {
        //giving it the bronze coin icon
        @Override
        public ItemStack makeIcon()
        {
            return new ItemStack(ModItems.BRONZE_COIN.get());
        }
    };

    //creating tab name
    private static final CreateRegistrate REGISTRATE = AlloyedDeco.REGISTRATE
            .creativeModeTab(() -> ALLOYED_DECO_TAB, "Alloyed Deco");
}
