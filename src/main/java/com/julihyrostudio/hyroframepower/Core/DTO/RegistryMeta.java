package com.julihyrostudio.hyroframepower.Core.DTO;

import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredItem;

import static com.julihyrostudio.hyroframepower.Core.Registry.ModRegistry.ITEMS;

public class RegistryMeta {
    // Define a Item
    public static final DeferredItem<Item> BISMUTH =
            ITEMS.register("bismuth", () -> new Item(new Item.Properties()));
    // Define a block
}
