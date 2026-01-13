package dev.hudak.tacana.registry;

import dev.hudak.tacana.Tacana;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {

    public static final DeferredRegister.Items ITEMS =
            DeferredRegister.createItems(Tacana.MODID);

    public static final DeferredItem<Item> TEST_ITEM =
        ITEMS.register(
                "test_item",
                () -> new Item(new Item.Properties()
                )
    );

    private ModItems() {}

    public static void register(IEventBus bus){
        ITEMS.register(bus);
    }

    public static DeferredItem<Item> registerBlockItem(String name, DeferredBlock<? extends Block> block){
        return ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

}
