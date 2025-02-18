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
    public static final RegistryObject<Item> barStoolItem = itemRegister.register("bar_stool", () -> new BlockItem(barStool.get(), new Item.Properties()));
    public static final RegistryObject<Item> barChairItem = itemRegister.register("bar_chair", () -> new BlockItem(barChair.get(), new Item.Properties()));
    public static final RegistryObject<Item> pubStoolItem = itemRegister.register("pub_stool", () -> new BlockItem(pubStool.get(), new Item.Properties()));
    public static final RegistryObject<Item> pubChairItem = itemRegister.register("pub_chair", () -> new BlockItem(pubChair.get(), new Item.Properties()));
    public static final RegistryObject<Item> sofaItem = itemRegister.register("sofa", () -> new BlockItem(sofa.get(), new Item.Properties()));
    public static final RegistryObject<Item> counterTableItem = itemRegister.register("counter_table", () -> new BlockItem(counterTable.get(), new Item.Properties()));
    public static final RegistryObject<Item> faucetItem = itemRegister.register("faucet", () -> new BlockItem(faucet.get(), new Item.Properties()));

    public static final RegistryObject<Item> auroraOreItem = itemRegister.register("aurora_ore", () -> new BlockItem(auroraOre.get(), new Item.Properties()));
    public static final RegistryObject<Item> deepslateAuroraOreItem = itemRegister.register("deepslate_aurora_ore", () -> new BlockItem(deepslateAuroraOre.get(), new Item.Properties()));

    // 注册新物品
    public static void register(IEventBus eventBus) { itemRegister.register(eventBus); };
}
