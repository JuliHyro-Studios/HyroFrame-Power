package com.julihyrostudio.hyroframepower.Tab;

import com.julihyrostudio.hyroframepower.Core.DTO.RegistryMeta;
import com.julihyrostudio.hyroframepower.ModMeta.Meta;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class CreativeTabControl {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Meta.MODID);
    public static void Register(IEventBus bus) {
        CREATIVE_MODE_TAB.register(bus);
    }
    public static final Supplier<CreativeModeTab> INGREDIENTS = CREATIVE_MODE_TAB.register("ingredients_tab",
            () -> CreativeModeTab.builder()
            .icon(() -> new ItemStack(RegistryMeta.BISMUTH_BLOCK.get()))
            .title(Component.translatable("creativetab.hyroframepower.ingredients_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(RegistryMeta.BISMUTH_BLOCK.get());
                        output.accept(RegistryMeta.BISMUTH);
                    }).build());
}