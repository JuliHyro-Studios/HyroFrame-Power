package com.julihyrostudio.hyroframepower.Item;

import com.julihyrostudio.hyroframepower.ModMeta.Meta;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS =
            DeferredRegister.createItems(Meta.MODID);

    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(Meta.MODID);

    public static final DeferredItem<Item> BISMUTH =
            ITEMS.register("bismuth", () -> new Item(new Item.Properties()));

    public static void Register(IEventBus bus) {
        ITEMS.register(bus);
        BLOCKS.register(bus);
    }
}