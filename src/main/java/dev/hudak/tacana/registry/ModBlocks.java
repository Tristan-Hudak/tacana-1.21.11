package dev.hudak.tacana.registry;

import dev.hudak.tacana.Tacana;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModBlocks {

    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(Tacana.MODID);

    public static final DeferredBlock<Block> TEST_BLOCK =
            BLOCKS.register(
                    "test_block",
                    () -> new Block(
                            BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(1.5f)
                    )
            );

    public static void register(IEventBus bus){
        BLOCKS.register(bus);
    }

}
