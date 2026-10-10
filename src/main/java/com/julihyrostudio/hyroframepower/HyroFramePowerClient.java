package com.julihyrostudio.hyroframepower;

import net.minecraft.client.Minecraft;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.neoforge.client.gui.ConfigurationScreen;
import net.neoforged.neoforge.client.gui.IConfigScreenFactory;
import com.julihyrostudio.hyroframepower.ModMeta.Meta;
@Mod(value = Meta.MODID, dist = Dist.CLIENT)
@EventBusSubscriber(modid = Meta.MODID, value = Dist.CLIENT)
public class HyroFramePowerClient {
    public HyroFramePowerClient(ModContainer container) {
    }

    @SubscribeEvent
    static void onClientSetup(FMLClientSetupEvent event) {
    }
}
