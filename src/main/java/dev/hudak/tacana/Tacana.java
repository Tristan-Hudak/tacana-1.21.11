package dev.hudak.tacana;

import dev.hudak.tacana.registry.ModBlocks;
import dev.hudak.tacana.registry.ModCreativeTab;
import dev.hudak.tacana.registry.ModItems;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

// The value here should match an entry in the META-INF/neoforge.mods.toml file
@Mod(Tacana.MODID)
public class Tacana {
    // Define mod id in a common place for everything to reference
    public static final String MODID = "tacana";

    public Tacana(IEventBus modEventBus) {
        ModBlocks.register(modEventBus);
        ModItems.register(modEventBus);
        ModCreativeTab.register(modEventBus);
    }
}
