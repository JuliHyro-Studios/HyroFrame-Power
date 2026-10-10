package com.julihyrostudio.hyroframepower.Core.DTO;

import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;

import static com.julihyrostudio.hyroframepower.Core.Registry.ModRegistry.ITEMS;
import static com.julihyrostudio.hyroframepower.Core.Registry.ModRegistry.RegisterBlock;

public class RegistryMeta {
    public static void init() {}
    // Define a Item
    public static final DeferredItem<Item> BISMUTH =
            ITEMS.register("bismuth", () -> new Item(new Item.Properties()));
    // Define a block
    public static final DeferredBlock<Block> BISMUTH_BLOCK = RegisterBlock("bismuth_block", () -> new Block(BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops().sound(SoundType.AMETHYST)));
}
