package com.mogu.neofactories.items;

import com.mogu.neofactories.NeoFactories;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class NeoFactories_Items {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(NeoFactories.MOD_ID);
    public static final DeferredItem<Item> TERMIUM = ITEMS.registerSimpleItem("termium");

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}