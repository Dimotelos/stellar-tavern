package com.permastars.stellartavern.register.datagen.data;

import com.permastars.stellartavern.register.datagen.type.BlockItemModelType;
import com.permastars.stellartavern.register.datagen.type.BlockModelType;
import com.permastars.stellartavern.register.datagen.type.ItemModelType;

import static com.permastars.stellartavern.register.block.Block.*;
import static com.permastars.stellartavern.register.item.BlockItem.*;
import static com.permastars.stellartavern.register.item.Item.*;

public class Data {

    // 物品数据
    public static final ItemRepository items = new ItemRepository(
        // 有交互物品
        new ItemInfo(menu, "菜单", "Menu"),
        new ItemInfo(accountBook, "账簿", "Account Book", ItemModelType.Blockbench)
        // 无交互物品
    );

    // 方块数据
    public static final BlockRepository blocks = new BlockRepository(
        // 有交互方块
        new BlockInfo(foodPassTable, "传菜桌", "Food-pass Table", foodPassTableItem, BlockModelType.Blockbench),
        new BlockInfo(dishwashing, "洗碗台", "Dishwashing", dishwashingItem, BlockModelType.Blockbench),
        new BlockInfo(cashier, "收银机", "Cashier", cashierItem, BlockModelType.Blockbench),
        new BlockInfo(tray, "托盘", "Tray", trayItem, BlockModelType.Blockbench),
        // 无交互方块
        new BlockInfo(barStool, "吧台凳", "Bar Stool", barStoolItem, BlockModelType.Blockbench),
        new BlockInfo(barChair, "吧台椅", "Bar Chair", barChairItem, BlockModelType.Blockbench),
        new BlockInfo(pubStool, "酒吧凳", "Pub Stool", pubStoolItem, BlockModelType.Blockbench),
        new BlockInfo(pubChair, "酒吧椅", "Pub Chair", pubChairItem, BlockModelType.Blockbench),
        new BlockInfo(sofa, "沙发", "Sofa", sofaItem, BlockModelType.Blockbench),
        new BlockInfo(counterTable, "台面桌", "Counter Table", counterTableItem, BlockModelType.Blockbench),
        new BlockInfo(faucet, "水龙头", "Faucet", faucetItem, BlockModelType.Blockbench, BlockItemModelType.TextureItem)
        );

    // 星痕扩展
    public static final ItemRepository starscar_items = new ItemRepository(
        new ItemInfo(auroraGem, "奥罗拉宝石", "Aurora Gem"),
        new ItemInfo(auroraCore, "奥罗拉核心", "Aurora Core")
    );

    public static final BlockRepository starscar_blocks = new BlockRepository(
        new BlockInfo(starscarDishwashing, "星痕洗碗台", "Dishwashing of Starscar", starscarDishwashingItem, BlockModelType.Blockbench),
        new BlockInfo(auroraOre, "奥罗拉矿石", "Aurora Ore", auroraOreItem, BlockModelType.Simple),
        new BlockInfo(deepslateAuroraOre, "深层奥罗拉矿石", "Deepslate Aurora Ore", deepslateAuroraOreItem, BlockModelType.Simple)
    );

    public static final LangInfoRepository langs = new LangInfoRepository(
        new LangInfo("creativetab.stellartavern.stellar_tab", "星辰酒馆物语", "Stellar Tavern"),
        new LangInfo("creativetab.stellartavern.stellar_starscar_tab", "星辰酒馆物语：奥罗拉", "Stellar Tavern: Aurora")
    );
}
