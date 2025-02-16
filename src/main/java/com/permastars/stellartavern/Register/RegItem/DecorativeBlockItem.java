package com.permastars.stellartavern.Register.RegItem;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static com.permastars.stellartavern.Register.RegBlock.DecorativeBlock.*;
import static com.permastars.stellartavern.StellarTavern.modid;


public class DecorativeBlockItem {

    public static final DeferredRegister<Item> itemRegister = DeferredRegister.create(ForgeRegistries.ITEMS, modid);

    // 创建新方块物品
    public static final RegistryObject<Item> example_block_item2 = itemRegister.register(
        "example_block_item2", () -> new BlockItem(
            example_block2.get(), new Item.Properties()
        ));

    // 注册新物品
    public static void register(IEventBus eventBus) {
        itemRegister.register(eventBus);
    };
}
