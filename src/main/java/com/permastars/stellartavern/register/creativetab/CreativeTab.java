package com.permastars.stellartavern.register.creativetab;

import com.permastars.stellartavern.register.datagen.data.Data;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import static com.permastars.stellartavern.StellarTavern.modid;

import static com.permastars.stellartavern.register.item.Item.*;


public class CreativeTab {
    public static final DeferredRegister<CreativeModeTab> creativeTabRegister = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, modid);

    public static final RegistryObject<CreativeModeTab> stellarTab = creativeTabRegister.register(
        "stellar_tab",
        () -> CreativeModeTab.builder()
            .withTabsBefore(CreativeModeTabs.COMBAT)
            .title(Component.translatable("creativetab.stellartavern.stellar_tab"))
            .icon(() -> accountBook.get().getDefaultInstance())
            .displayItems((parameters, output) -> {
                for (RegistryObject<Block> block : Data.blocks.getAllValues()) {
                    output.accept(block.get());
                }
                for (RegistryObject<Item> item : Data.items.getAllValues()) {
                    output.accept(item.get());
                }
            })
            .build()
    );

    public static final RegistryObject<CreativeModeTab> stellarStarscarTab = creativeTabRegister.register(
        "stellar_starscar_tab",
        () -> CreativeModeTab.builder()
            .withTabsBefore(CreativeModeTabs.COMBAT)
            .title(Component.translatable("creativetab.stellartavern.stellar_starscar_tab"))
            .icon(() -> accountBook.get().getDefaultInstance())
            .displayItems((parameters, output) -> {
                for (RegistryObject<Block> block : Data.starscar_blocks.getAllValues()) {
                    output.accept(block.get());
                }
                for (RegistryObject<Item> item : Data.starscar_items.getAllValues()) {
                    output.accept(item.get());
                }
            })
            .build()
    );

    public static void register(IEventBus eventBus) { creativeTabRegister.register(eventBus); }
}
