package com.permastars.stellartavern.Register.RegCreativeTab;

import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import static com.permastars.stellartavern.StellarTavern.modid;

import static com.permastars.stellartavern.Register.RegItem.DecorativeBlockItem.*;
import static com.permastars.stellartavern.Register.RegItem.FunctionBlockItem.*;
import static com.permastars.stellartavern.Register.RegItem.DecorativeItem.*;
import static com.permastars.stellartavern.Register.RegItem.FunctionItem.*;


public class CreativeTab {
    public static final DeferredRegister<CreativeModeTab> creativeTabRegister = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, modid);

    public static final RegistryObject<CreativeModeTab> example_tab = creativeTabRegister.register(
        "example_tab",
        () -> CreativeModeTab.builder()
            .withTabsBefore(CreativeModeTabs.COMBAT)
            .icon(() -> accountBook.get().getDefaultInstance())
            .displayItems((parameters, output) -> {
                output.accept(foodPassTableItem.get());
                output.accept(dishwashingItem.get());
                output.accept(starscarDishwashingItem.get());
                output.accept(cashierItem.get());
                output.accept(open_signItem.get());
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
            })
            .build()
    );

    public static void register(IEventBus eventBus) {
        creativeTabRegister.register(eventBus);
    }
}
