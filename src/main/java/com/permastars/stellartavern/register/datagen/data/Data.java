package com.permastars.stellartavern.register.datagen.data;

import static com.permastars.stellartavern.register.block.Block.*;
import static com.permastars.stellartavern.register.item.BlockItem.*;
import static com.permastars.stellartavern.register.item.Item.*;


public class Data {

    // 物品数据
    public static final ItemRepository items = new ItemRepository(
        // 有交互物品
        new ItemInfo(menu, "菜单", "Menu"),
        new ItemInfo(accountBook, "账簿", "Account Book", false)
        // 无交互物品
    );

    // 方块数据
    public static final BlockRepository blocks = new BlockRepository(
        // 有交互方块
        new BlockInfo(foodPassTable, "传菜桌", "Food-pass Table", foodPassTableItem),
        new BlockInfo(dishwashing, "洗碗台", "Dishwashing", dishwashingItem),
        new BlockInfo(cashier, "收银机", "Cashier", cashierItem),
        new BlockInfo(tray, "托盘", "Tray", trayItem),
        // 无交互方块
        new BlockInfo(barStool, "吧台凳", "Bar Stool", barStoolItem),
        new BlockInfo(barChair, "吧台椅", "Bar Chair", barChairItem),
        new BlockInfo(pubStool, "酒吧凳", "Pub Stool", pubStoolItem),
        new BlockInfo(pubChair, "酒吧椅", "Pub Chair", pubChairItem),
        new BlockInfo(sofa, "沙发", "Sofa", sofaItem),
        new BlockInfo(counterTable, "台面桌", "Counter Table", counterTableItem),
        new BlockInfo(faucet, "水龙头", "Faucet", faucetItem)
        );

    // 星痕扩展
    public static final ItemRepository starscar_items = new ItemRepository(
        new ItemInfo(auroraGem, "奥罗拉宝石", "Aurora Gem"),
        new ItemInfo(auroraCore, "奥罗拉核心", "Aurora Core")
    );

    public static final BlockRepository starscar_blocks = new BlockRepository(
        new BlockInfo(starscarDishwashing, "星痕洗碗台", "Dishwashing of Starscar", starscarDishwashingItem),
        new BlockInfo(auroraOre, "奥罗拉矿石", "Aurora Ore", auroraOreItem),
        new BlockInfo(deepslateAuroraOre, "深层奥罗拉矿石", "Deepslate Aurora Ore", deepslateAuroraOreItem)
    );

    public static final LangInfoRepository langs = new LangInfoRepository(
        new LangInfo("creativetab.stellartavern.stellar_tab", "星辰酒馆物语", "Stellar Tavern"),
        new LangInfo("creativetab.stellartavern.stellar_starscar_tab", "星辰酒馆物语：奥罗拉", "Stellar Tavern: Aurora")
    );
}
