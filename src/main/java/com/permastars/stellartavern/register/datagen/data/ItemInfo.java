package com.permastars.stellartavern.register.datagen.data;

import com.permastars.stellartavern.register.datagen.type.ItemModelType;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.RegistryObject;

public record ItemInfo(
    RegistryObject<Item> item,
    String zhCn,
    String enUs,
    ItemModelType itemModelType
) {
    // 重载构造函数：省略 itemModelType
    public ItemInfo(RegistryObject<Item> value, String zhCn, String enUs) {
        this(value, zhCn, enUs, ItemModelType.Texture);
    }

    // 获取 Item 的注册对象
    public RegistryObject<Item> getItem() { return item; }

    // 获取中文名称
    public String getZhCN() { return zhCn; }

    // 获取英文名称
    public String getEnUS() { return enUs; }

    // 获取 Item 的模型类型
    public ItemModelType getItemModelType() { return itemModelType; }
}
