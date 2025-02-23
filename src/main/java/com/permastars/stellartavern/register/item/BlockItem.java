package com.permastars.stellartavern.register.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static com.permastars.stellartavern.register.block.Block.*;
import static com.permastars.stellartavern.StellarTavern.modid;

public class BlockItem {

    public static final DeferredRegister<Item> itemRegister = DeferredRegister.create(ForgeRegistries.ITEMS, modid);

    // 有交互方块物品
    public static final RegistryObject<Item> foodPassTableItem = itemRegister.register("food_pass_table", () -> new net.minecraft.world.item.BlockItem(foodPassTable.get(), new Item.Properties()));
    public static final RegistryObject<Item> dishwashingItem = itemRegister.register("dishwashing", () -> new net.minecraft.world.item.BlockItem(dishwashing.get(), new Item.Properties()));
    public static final RegistryObject<Item> starscarDishwashingItem = itemRegister.register("starscar_dishwashing", () -> new net.minecraft.world.item.BlockItem(starscarDishwashing.get(), new Item.Properties()));
    public static final RegistryObject<Item> cashierItem = itemRegister.register("cashier", () -> new net.minecraft.world.item.BlockItem(cashier.get(), new Item.Properties()));
    public static final RegistryObject<Item> trayItem = itemRegister.register("tray", () -> new net.minecraft.world.item.BlockItem(tray.get(), new Item.Properties()));
    // 无交互方块物品
    public static final RegistryObject<Item> barStoolItem = itemRegister.register("bar_stool", () -> new net.minecraft.world.item.BlockItem(barStool.get(), new Item.Properties()));
    public static final RegistryObject<Item> barChairItem = itemRegister.register("bar_chair", () -> new net.minecraft.world.item.BlockItem(barChair.get(), new Item.Properties()));
    public static final RegistryObject<Item> pubStoolItem = itemRegister.register("pub_stool", () -> new net.minecraft.world.item.BlockItem(pubStool.get(), new Item.Properties()));
    public static final RegistryObject<Item> pubChairItem = itemRegister.register("pub_chair", () -> new net.minecraft.world.item.BlockItem(pubChair.get(), new Item.Properties()));
    public static final RegistryObject<Item> sofaItem = itemRegister.register("sofa", () -> new net.minecraft.world.item.BlockItem(sofa.get(), new Item.Properties()));
    public static final RegistryObject<Item> counterTableItem = itemRegister.register("counter_table", () -> new net.minecraft.world.item.BlockItem(counterTable.get(), new Item.Properties()));
    public static final RegistryObject<Item> faucetItem = itemRegister.register("faucet", () -> new net.minecraft.world.item.BlockItem(faucet.get(), new Item.Properties()));

    public static final RegistryObject<Item> auroraOreItem = itemRegister.register("aurora_ore", () -> new net.minecraft.world.item.BlockItem(auroraOre.get(), new Item.Properties()));
    public static final RegistryObject<Item> deepslateAuroraOreItem = itemRegister.register("deepslate_aurora_ore", () -> new net.minecraft.world.item.BlockItem(deepslateAuroraOre.get(), new Item.Properties()));


    // 注册新物品
    public static void register(IEventBus eventBus) { itemRegister.register(eventBus); }
}
