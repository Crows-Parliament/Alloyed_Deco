package com.crow.alloyed_deco.block;

import com.crow.alloyed_deco.AlloyedDeco;
import com.crow.alloyed_deco.item.ModCreativeModeTab;
import com.crow.alloyed_deco.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.WeatheringCopper;
import net.minecraft.world.level.block.WeatheringCopperFullBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.checkerframework.checker.units.qual.C;

import java.util.function.Supplier;

public class ModBlocks
{
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, AlloyedDeco.MOD_ID);

//Bronze Sheet Metal
    public static final RegistryObject<Block> BRONZE_SHEET_METAL = registerBlock("bronze_sheet_metal",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(5f)
                    .requiresCorrectToolForDrops()
            ),
            ModCreativeModeTab.ALLOYEDDECOTAB);

//Exposed Bronze Sheet Metal
    public static final RegistryObject<Block> EXPOSED_BRONZE_SHEET_METAL = registerBlock("exposed_bronze_sheet_metal",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(5f)
                    .requiresCorrectToolForDrops()
            ),
            ModCreativeModeTab.ALLOYEDDECOTAB);

//Weathered Bronze Sheet Metal
    public static final RegistryObject<Block> WEATHERED_BRONZE_SHEET_METAL = registerBlock("weathered_bronze_sheet_metal",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(5f)
                    .requiresCorrectToolForDrops()
            ),
            ModCreativeModeTab.ALLOYEDDECOTAB);

//Oxidized Bronze Sheet Metal
    public static final RegistryObject<Block> OXIDIZED_BRONZE_SHEET_METAL = registerBlock("oxidized_bronze_sheet_metal",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(5f)
                    .requiresCorrectToolForDrops()
            ),
            ModCreativeModeTab.ALLOYEDDECOTAB);


    //create block
    private static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab)
    {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    //create item
    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab)
    {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }


    public static void register(IEventBus eventBus)
    {
        BLOCKS.register(eventBus);
    }
}
