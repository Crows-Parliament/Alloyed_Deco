package com.crow.alloyed_deco.registry;

import com.crow.alloyed_deco.AlloyedDeco;
import com.crow.alloyed_deco.AlloyedDecoTab;
import com.github.talrey.createdeco.items.CoinStackItem;
import com.simibubi.create.foundation.data.CreateRegistrate;
import com.tterrag.registrate.util.entry.ItemEntry;
import net.minecraft.advancements.critereon.InventoryChangeTrigger;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;
import net.minecraft.world.item.Item;

public class ModItems
{

    private static CreateRegistrate REGISTRATE = AlloyedDeco.REGISTRATE.creativeModeTab(() -> AlloyedDecoTab.ALLOYED_DECO_TAB);

    //bronze coin
    public static ItemEntry<Item> BRONZE_COIN = REGISTRATE
            .item("bronze_coin", Item::new) //creates the item
            .recipe((ctx, prov) -> ShapelessRecipeBuilder.shapeless(ctx.get(), 4) //creating the recipe
                    .requires(BRONZE_COINSTACK) //ingredients
                    .unlockedBy("has_item", InventoryChangeTrigger.TriggerInstance.hasItems(BRONZE_COINSTACK)) //unlocks the recipe in the book
                    .save(prov) //no idea
            )
            .lang("Bronze Coin") //creates en_us name
            .lang("en_gb", "Bronze Coin"); //creates en_gb name

    //bronze coinstack
    public static ItemEntry<CoinStackItem> BRONZE_COINSTACK = REGISTRATE
            .item("bronze_coinstack", Item::new)
            .recipe((ctx, prov) -> ShapelessRecipeBuilder.shapeless(ctx.get())
                    .requires(BRONZE_COIN)
                    .unlockedBy("has_item", InventoryChangeTrigger.TriggerInstance.hasItems(BRONZE_COIN))
                    .save(prov)
            )
            .lang("Bronze Coinstack")
            .lang("en_gb", "Bronze Coinstack");

    //oxidized bronze coin
    public static ItemEntry<Item> OXDIZED_BRONZE_COIN = REGISTRATE
            .item("oxidized_bronze_coin", Item::new) //creates the item
            .recipe((ctx, prov) -> ShapelessRecipeBuilder.shapeless(ctx.get(), 4) //creating the recipe
                    .requires(OXIDIZED_BRONZE_COINSTACK) //ingredients
                    .unlockedBy("has_item", InventoryChangeTrigger.TriggerInstance.hasItems(OXIDIZED_BRONZE_COINSTACK))
                    .save(prov)
            )
            .lang("Oxidized Bronze Coin")
            .lang("en_gb", "Oxidized Bronze Coin");

    //oxidized bronze coinstack
    public static ItemEntry<CoinStackItem> OXIDIZED_BRONZE_COINSTACK = REGISTRATE
            .item("oxidized_bronze_coinstack", Item::new)
            .recipe((ctx, prov) -> ShapelessRecipeBuilder.shapeless(ctx.get())
                    .requires(OXDIZED_BRONZE_COIN)
                    .unlockedBy("has_item", InventoryChangeTrigger.TriggerInstance.hasItems(OXDIZED_BRONZE_COIN))
                    .save(prov)
            )
            .lang("Bronze Coinstack")
            .lang("en_gb", "Bronze Coinstack");

}
