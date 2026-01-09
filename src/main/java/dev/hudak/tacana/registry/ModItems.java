package dev.hudak.tacana.registry;

import dev.hudak.tacana.Tacana;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
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

}
