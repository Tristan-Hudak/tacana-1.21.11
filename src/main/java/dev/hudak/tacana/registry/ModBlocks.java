package dev.hudak.tacana.registry;

import dev.hudak.tacana.Tacana;
import dev.hudak.tacana.blocks.TacanaLeavesBlocks;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.LeavesBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.LeavesBlock;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModBlocks {

    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(Tacana.MODID);

    public static final DeferredBlock<Block> TEST_BLOCK =
            BLOCKS.register(
                    "test_block",
                    () -> new Block(
                            BlockBehaviour.Properties.of()
                                    .mapColor(MapColor.STONE)
                                    .strength(1.5f)
                    )
            );

    //Beginning tree set up with logs, leaves, and sapling
    public static final DeferredBlock<Block> CASECADA_LOG =
            BLOCKS.register(
                    "casecada_log",
                    () -> new RotatedPillarBlock(
                            BlockBehaviour.Properties.of()
                                    .mapColor(MapColor.WOOD)
                                    .strength(2.0f)
                                    .sound(SoundType.WOOD)
                                    .ignitedByLava()
                    )
            );

    public static final DeferredBlock<Block> CASECADA_LEAVES =
            BLOCKS.register(
                    "casecada_leaves",
                    () -> new TacanaLeavesBlocks(
                            0.01f,// can be tweaked later
                            BlockBehaviour.Properties.of()
                                    .mapColor(MapColor.PLANT)
                                    .strength(0.2f)
                                    .sound(SoundType.GRASS)
                                    .noOcclusion()
                                    .randomTicks()
                                    .ignitedByLava()
                    ) {}
            );

    public static final DeferredItem<Item> TEST_BLOCK_ITEM =
            ModItems.registerBlockItem("test_block", TEST_BLOCK);

    public static final DeferredItem<Item> CASECADA_LOG_ITEM =
            ModItems.registerBlockItem("casecada_log", CASECADA_LOG);

    public static final DeferredItem<Item> CASECADA_LEAVES_ITEM =
            ModItems.registerBlockItem("casecada_leaves", CASECADA_LEAVES);

    private ModBlocks() {}

    public static void register(IEventBus bus){
        BLOCKS.register(bus);
    }

}
