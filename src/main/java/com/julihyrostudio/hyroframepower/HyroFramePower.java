package com.julihyrostudio.hyroframepower;

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
    public static final String MODID = Meta.MODID;
    public static final Logger LOGGER = LogUtils.getLogger();

    public HyroFramePower(IEventBus modEventBus, ModContainer modContainer) {
        NeoForge.EVENT_BUS.register(this);
    }

    @SubscribeEvent
    public void onServerTick(ServerTickEvent.Post event) {
    }
}