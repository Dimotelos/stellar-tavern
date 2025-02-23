package com.permastars.stellartavern.register.item;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static com.permastars.stellartavern.StellarTavern.modid;

public class Item {

    public static final DeferredRegister<net.minecraft.world.item.Item> itemRegister = DeferredRegister.create(ForgeRegistries.ITEMS, modid);

    // 有交互物品
    public static final RegistryObject<net.minecraft.world.item.Item> accountBook = itemRegister.register("account_book", () -> new net.minecraft.world.item.Item(new net.minecraft.world.item.Item.Properties()));
    public static final RegistryObject<net.minecraft.world.item.Item> menu = itemRegister.register("menu", () -> new net.minecraft.world.item.Item(new net.minecraft.world.item.Item.Properties()));
    // 无交互物品
    public static final RegistryObject<net.minecraft.world.item.Item> auroraGem = itemRegister.register("aurora_gem", () -> new net.minecraft.world.item.Item(new net.minecraft.world.item.Item.Properties()));
    public static final RegistryObject<net.minecraft.world.item.Item> auroraCore = itemRegister.register("aurora_core", () -> new net.minecraft.world.item.Item(new net.minecraft.world.item.Item.Properties()));

    // 注册新物品
    public static void register(IEventBus eventBus) { itemRegister.register(eventBus); }
}
