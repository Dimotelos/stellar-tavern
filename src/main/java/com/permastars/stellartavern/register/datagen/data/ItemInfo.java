package com.permastars.stellartavern.register.datagen.data;

import net.minecraft.world.item.Item;
import net.minecraftforge.registries.RegistryObject;

// 表示单个项的类
public record ItemInfo(
    RegistryObject<Item> value,
    String zhCn,
    String enUs,
    boolean defaultModel
) {
    // 重载构造函数：省略 defaultModel
    public ItemInfo(RegistryObject<Item> value, String zhCn, String enUs) {
        this(value, zhCn, enUs, true);
    }

    // 获取 Item 的注册对象
    public RegistryObject<Item> getValue() { return value; }

    // 获取中文名称
    public String getZhCN() { return zhCn; }

    // 获取英文名称
    public String getEnUS() { return enUs; }

    // 是否使用默认 Item 模型
    public boolean isDefaultModel() { return defaultModel; }
}
