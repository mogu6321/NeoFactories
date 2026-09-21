package com.mogu.neofactories.blocks;

import com.mogu.neofactories.NeoFactories;
import com.mogu.neofactories.items.NeoFactories_Items;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Function;

public class NeoFactories_Blocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(NeoFactories.MOD_ID);

    public static final DeferredBlock<Block> TEST = registerBlock("test", Block::new);

    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Function<BlockBehaviour.Properties, T> function) {
        DeferredBlock<T> toReturn = BLOCKS.registerBlock(name, function);
        NeoFactories_Items.ITEMS.registerSimpleBlockItem(toReturn);
        return toReturn;
    }
    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }

}
