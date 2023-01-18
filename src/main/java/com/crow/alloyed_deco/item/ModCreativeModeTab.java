package com.crow.alloyed_deco.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab ALLOYEDDECOTAB = new CreativeModeTab("alloyed_deco")
    {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.BRONZECOIN.get());
        }
    };
}
