package com.mogu.neofactories;

import com.mogu.neofactories.blocks.NeoFactories_Blocks;
import com.mogu.neofactories.items.NeoFactories_Items;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.server.ServerStartingEvent;

@Mod(NeoFactories.MOD_ID)
public class NeoFactories {
    public static final String MOD_ID = "neofactories";

    public NeoFactories(IEventBus modBus, ModContainer modContainer){

        modBus.addListener(this::commonSetup);
        NeoFactories_Items.register(modBus);
        NeoFactories_Blocks.register(modBus);
        NeoForge.EVENT_BUS.register(this);

    }

    private void commonSetup(FMLCommonSetupEvent event) {
    }
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {

    }
}
