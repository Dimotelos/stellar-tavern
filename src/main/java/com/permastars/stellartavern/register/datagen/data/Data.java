package com.permastars.stellartavern.register.datagen.data;

import static com.permastars.stellartavern.register.blockitem.DecorativeBlockItem.*;
import static com.permastars.stellartavern.register.blockitem.FunctionBlockItem.*;
import static com.permastars.stellartavern.register.block.DecorativeBlock.*;
import static com.permastars.stellartavern.register.block.FunctionBlock.*;
import static com.permastars.stellartavern.register.item.DecorativeItem.*;
import static com.permastars.stellartavern.register.item.FunctionItem.*;


public class Data {

    // 初始化静态字段，直接在类加载时初始化所有数据
    public static final ItemRepository items = new ItemRepository(
        // item.DecorativeItem
        new ItemInfo(auroraGem, "奥罗拉宝石", "Aurora Gem", true),
        new ItemInfo(auroraCore, "奥罗拉核心", "Aurora Core", true)
        // item.FunctionItem
    );

    private static final BlockRepository blocks = new BlockRepository(
        // block.DecorativeBlock
        new BlockInfo(auroraOre, "奥罗拉矿石", "Aurora Ore", true, auroraOreItem.get())
        // block.FunctionBlock
    );
}
