package com.julihyrostudio.hyroframepower;

import com.julihyrostudio.hyroframepower.Item.ModItems;
import com.julihyrostudio.hyroframepower.Tab.CreativeTabControl;
import org.slf4j.Logger;
import com.mojang.logging.LogUtils;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.ModContainer;
import net.neoforged.neoforge.event.tick.ServerTickEvent;
import net.neoforged.bus.api.SubscribeEvent;
import com.julihyrostudio.hyroframepower.ModMeta.Meta;

@Mod(Meta.MODID)
public class HyroFramePower {
    public HyroFramePower(IEventBus modEventBus, ModContainer modContainer) {
        NeoForge.EVENT_BUS.register(this);
        ModItems.Register(modEventBus);
        CreativeTabControl.Register(modEventBus);
    }
    @SubscribeEvent
    public void onServerTick(ServerTickEvent.Post event) {
    }
}