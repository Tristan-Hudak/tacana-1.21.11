package dev.hudak.tacana.registry;

import dev.hudak.tacana.Tacana;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModCreativeTab {

    public static final DeferredRegister<CreativeModeTab> TABS =
            DeferredRegister. create(Registries.CREATIVE_MODE_TAB,Tacana.MODID);

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> MAIN =
            TABS.register(
                    "main",
                    () -> CreativeModeTab.builder()
                            .title(Component.translatable("itemGroup." + Tacana.MODID + ".main"))
                            .icon(() -> new ItemStack(ModItems.TEST_ITEM.get()))
                            .displayItems((params, output) -> {
                                output.accept(ModItems.TEST_ITEM.get());
                            })
                            .build()
            );


    public static void register(IEventBus bus) {
        TABS.register(bus);
    }
}
