package com.julihyrostudio.hyroframepower.Tab;

import com.julihyrostudio.hyroframepower.Core.DTO.RegistryMeta;
import net.minecraft.world.item.CreativeModeTabs;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;

public class CreativeTabControl {
    public static void Register(IEventBus bus) {
        CreativeTabControl control = new CreativeTabControl();
        bus.addListener(control::addCreative);
    }

    public void addCreative(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey() == CreativeModeTabs.INGREDIENTS)
        {
            event.accept(RegistryMeta.BISMUTH);
        }
    }
}