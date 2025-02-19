package com.permastars.stellartavern.register.blockitem;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static com.permastars.stellartavern.register.block.FunctionBlock.*;
import static com.permastars.stellartavern.StellarTavern.modid;


public class FunctionBlockItem {

    public static final DeferredRegister<Item> itemRegister = DeferredRegister.create(ForgeRegistries.ITEMS, modid);

    // 创建新方块物品
    public static final RegistryObject<Item> foodPassTableItem = itemRegister.register("food_pass_table", () -> new BlockItem(foodPassTable.get(), new Item.Properties()));
    public static final RegistryObject<Item> dishwashingItem = itemRegister.register("dishwashing", () -> new BlockItem(dishwashing.get(), new Item.Properties()));
    public static final RegistryObject<Item> starscarDishwashingItem = itemRegister.register("starscar_dishwashing", () -> new BlockItem(starscarDishwashing.get(), new Item.Properties()));
    public static final RegistryObject<Item> cashierItem = itemRegister.register("cashier", () -> new BlockItem(cashier.get(), new Item.Properties()));
    public static final RegistryObject<Item> trayItem = itemRegister.register("tray", () -> new BlockItem(tray.get(), new Item.Properties()));

    // 注册新物品
    public static void register(IEventBus eventBus) { itemRegister.register(eventBus); };
}
