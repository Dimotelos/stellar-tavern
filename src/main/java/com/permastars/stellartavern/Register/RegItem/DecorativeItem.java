package com.permastars.stellartavern.Register.RegItem;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static com.permastars.stellartavern.StellarTavern.modid;


public class DecorativeItem {

    public static final DeferredRegister<Item> itemRegister = DeferredRegister.create(ForgeRegistries.ITEMS, modid);

    // 创建新物品
    public static final RegistryObject<Item> example_item2 = itemRegister.register(
        "example_item2", () -> new Item(
            new Item.Properties()
        )
    );

    // 注册新物品
    public static void register(IEventBus eventBus) {
        itemRegister.register(eventBus);
    };
}
