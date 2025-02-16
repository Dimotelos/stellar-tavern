package com.permastars.stellartavern.Register.RegCreativeTab;

import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import static com.permastars.stellartavern.StellarTavern.modid;

import static com.permastars.stellartavern.Register.RegBlock.DecorativeBlock.example_block2;
import static com.permastars.stellartavern.Register.RegBlock.FunctionBlock.example_block;
import static com.permastars.stellartavern.Register.RegItem.DecorativeBlockItem.example_block_item2;
import static com.permastars.stellartavern.Register.RegItem.FunctionBlockItem.example_block_item;
import static com.permastars.stellartavern.Register.RegItem.DecorativeItem.example_item2;
import static com.permastars.stellartavern.Register.RegItem.FunctionItem.example_item;


public class CreativeTab {
    public static final DeferredRegister<CreativeModeTab> creativeTabRegister = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, modid);

    public static final RegistryObject<CreativeModeTab> example_tab = creativeTabRegister.register(
        "example_tab",
        () -> CreativeModeTab.builder()
            .withTabsBefore(CreativeModeTabs.COMBAT)
            .icon(() -> example_item.get().getDefaultInstance())
            .displayItems((parameters, output) -> {
                output.accept(example_block.get());
                output.accept(example_block2.get());
                output.accept(example_block_item.get());
                output.accept(example_block_item2.get());
                output.accept(example_item.get());
                output.accept(example_item2.get());
            })
            .build()
    );

    public static void register(IEventBus eventBus) {
        creativeTabRegister.register(eventBus);
    }
}
