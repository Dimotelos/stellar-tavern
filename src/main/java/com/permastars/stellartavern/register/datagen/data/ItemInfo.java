package com.permastars.stellartavern.register.datagen.data;

import net.minecraft.world.item.Item;
import net.minecraftforge.registries.RegistryObject;

// 表示单个项的类
public record ItemInfo(RegistryObject<Item> value, String zhCn, String enUs, boolean defaultModel) {
    public RegistryObject<Item> getValue () { return value; }
    public String getZhCN() { return zhCn; }
    public String getEnUS() { return enUs; }
    public boolean isDefaultModel() { return defaultModel; }
}
