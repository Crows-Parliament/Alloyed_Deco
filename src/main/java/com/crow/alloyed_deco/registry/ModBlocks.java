package com.crow.alloyed_deco.registry;

import com.crow.alloyed_deco.AlloyedDeco;
import com.crow.alloyed_deco.AlloyedDecoTab;
import com.crow.alloyed_deco.blocks.BronzeSheetSet;
import com.simibubi.create.AllTags;
import com.simibubi.create.foundation.block.CopperBlockSet;
import com.simibubi.create.foundation.data.CreateRegistrate;
import com.tterrag.registrate.util.DataIngredient;

public class ModBlocks {

    private static final CreateRegistrate REGISTRATE = AlloyedDeco.REGISTRATE.creativeModeTab(() -> AlloyedDecoTab.ALLOYED_DECO_TAB);

    //bronze sheet metal
    public static final BronzeSheetSet BRONZE_SHEET_METAL = new BronzeSheetSet( // Ignore that it says COPPER block set. The code works for any oxidizing metal.
            REGISTRATE,
            "bronze_sheet_metal",
            "bronze_sheet_metal",
            new BronzeSheetSet.Variant<?>[] { BronzeSheetSet.BlockVariant.INSTANCE },
            "bronze/"
    );

    //bronze sheet stairs
    public static final BronzeSheetSet BRONZE_SHEET_STAIRS = new BronzeSheetSet( // Ignore that it says COPPER block set. The code works for any oxidizing metal.
            REGISTRATE,
            "bronze_sheet_metal",
            "bronze_sheet_metal",
            new BronzeSheetSet.Variant<?>[] { BronzeSheetSet.StairVariant.INSTANCE },
            "bronze/"
    );

    //bronze sheet slab
    public static final BronzeSheetSet BRONZE_SHEET_SLAB = new BronzeSheetSet( // Ignore that it says COPPER block set. The code works for any oxidizing metal.
            REGISTRATE,
            "bronze_sheet_metal",
            "bronze_sheet_metal",
            new BronzeSheetSet.Variant<?>[] { BronzeSheetSet.SlabVariant.INSTANCE },
            "bronze/"
    );
}
