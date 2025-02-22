package com.permastars.stellartavern.register.datagen.data;

import static com.permastars.stellartavern.register.block.Block.*;
import static com.permastars.stellartavern.register.item.BlockItem.*;
import static com.permastars.stellartavern.register.item.Item.*;


public class Data {

    // 初始化静态字段，直接在类加载时初始化所有数据
    public static final ItemRepository items = new ItemRepository(
        // 有交互物品
        new ItemInfo(menu, "菜单", "Menu", true),
        new ItemInfo(accountBook, "账簿", "Account Book", false),
        // 无交互物品
        new ItemInfo(auroraGem, "奥罗拉宝石", "Aurora Gem", true),
        new ItemInfo(auroraCore, "奥罗拉核心", "Aurora Core", true)
    );

    public static final BlockRepository blocks = new BlockRepository(
        // 有交互方块
        new BlockInfo(foodPassTable, "zh_cn", "en_us", true, foodPassTableItem.get()),
        new BlockInfo(dishwashing, "zh_cn", "en_us", true, dishwashingItem.get()),
//        new BlockInfo(starscarDishwashing, "zh_cn", "en_us", true, starscarDishwashingItem.get()),
        new BlockInfo(cashier, "zh_cn", "en_us", true, cashierItem.get()),
        new BlockInfo(tray, "zh_cn", "en_us", true, trayItem.get()),
        // 无交互方块
        new BlockInfo(barStool, "zh_cn", "en_us", true, barStoolItem.get()),
        new BlockInfo(barChair, "zh_cn", "en_us", true, barChairItem.get()),
        new BlockInfo(pubStool, "zh_cn", "en_us", true, pubStoolItem.get()),
        new BlockInfo(pubChair, "zh_cn", "en_us", true, pubChairItem.get()),
        new BlockInfo(sofa, "zh_cn", "en_us", true, sofaItem.get()),
        new BlockInfo(counterTable, "zh_cn", "en_us", true, counterTableItem.get()),
        new BlockInfo(faucet, "zh_cn", "en_us", true, faucetItem.get())
//        new BlockInfo(auroraOre, "zh_cn", "en_us", true, auroraOreItem.get()),
//        new BlockInfo(deepslateAuroraOre, "zh_cn", "en_us", true, deepslateAuroraOreItem.get())
        );

    public static final LangInfoRepository langs = new LangInfoRepository(
        new LangInfo("creativetab.stellartavern.stellar_tab", "星辰酒馆物语", "Stellar Tavern")
    );
}
