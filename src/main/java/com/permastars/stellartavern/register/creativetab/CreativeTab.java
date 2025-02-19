package com.permastars.stellartavern.register.creativetab;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import static com.permastars.stellartavern.StellarTavern.modid;

import static com.permastars.stellartavern.register.blockitem.DecorativeBlockItem.*;
import static com.permastars.stellartavern.register.blockitem.FunctionBlockItem.*;
import static com.permastars.stellartavern.register.item.DecorativeItem.*;
import static com.permastars.stellartavern.register.item.FunctionItem.*;


public class CreativeTab {
    public static final DeferredRegister<CreativeModeTab> creativeTabRegister = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, modid);

    public static final RegistryObject<CreativeModeTab> stellarTab = creativeTabRegister.register(
        "stellar_tab",
        () -> CreativeModeTab.builder()
            .withTabsBefore(CreativeModeTabs.COMBAT)
            .title(Component.translatable("creativetab.stellar_tab"))
            .icon(() -> accountBook.get().getDefaultInstance())
            .displayItems((parameters, output) -> {
                output.accept(foodPassTableItem.get());
                output.accept(dishwashingItem.get());
                output.accept(starscarDishwashingItem.get());
                output.accept(cashierItem.get());
                output.accept(trayItem.get());
                output.accept(barStoolItem.get());
                output.accept(barChairItem.get());
                output.accept(pubStoolItem.get());
                output.accept(pubChairItem.get());
                output.accept(sofaItem.get());
                output.accept(counterTableItem.get());
                output.accept(faucetItem.get());
                output.accept(accountBook.get());
                output.accept(menu.get());
                output.accept(auroraGem.get());
                output.accept(auroraCore.get());
                output.accept(auroraOreItem.get());
                output.accept(deepslateAuroraOreItem.get());
            })
            .build()
    );

    public static void register(IEventBus eventBus) { creativeTabRegister.register(eventBus); }
}
