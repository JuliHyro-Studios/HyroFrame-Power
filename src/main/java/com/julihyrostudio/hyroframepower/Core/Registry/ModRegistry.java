package com.julihyrostudio.hyroframepower.Core.Registry;

import com.julihyrostudio.hyroframepower.Core.DTO.RegistryMeta;
import com.julihyrostudio.hyroframepower.ModMeta.Meta;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModRegistry {
    // Register DeferredRegister
    public static final DeferredRegister.Items ITEMS =
            DeferredRegister.createItems(Meta.MODID);

    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(Meta.MODID);
    public static <T extends  Block> DeferredBlock<T> RegisterBlock(String name, Supplier<T> block)
    {
        DeferredBlock<T> ToReturn = BLOCKS.register(name, block);
        RegisterBlockItem(name, ToReturn);
        return ToReturn;
    }
    private static <T extends Block> void RegisterBlockItem(String name, DeferredBlock<T> block)
    {
        ModRegistry.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }
    // Registration function for the Block
    public static void BlockRegister(IEventBus modEventBus) {
        RegistryMeta.init();
        BLOCKS.register(modEventBus);
    }
    // Registration function for the Item
    public static void ItemRegister(IEventBus bus) {
        RegistryMeta.init();
        ITEMS.register(bus);
    }
}