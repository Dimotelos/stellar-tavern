package com.permastars.stellartavern.register.datagen.data;

import net.minecraft.world.item.Item;
import net.minecraftforge.registries.RegistryObject;

import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Map;

// 存储多个项的容器类
public class ItemRepository {
    private final Map<RegistryObject<Item>, ItemInfo> items = new HashMap<>();
    // 构造函数
    public ItemRepository(ItemInfo... itemInfos) { for (ItemInfo item : itemInfos) { items.put(item.value(), item); } }
    // 根据value获取项
    public ItemInfo get(RegistryObject<Item> value) { return items.get(value); }
    // 返回符合条件的所有 ItemInfo 数组
    public ItemInfo[] getAll(int filter) {
        return items.values().stream()
            .filter(item -> filter == 0 || (filter > 0 && item.defaultModel()) || (filter < 0 && !item.defaultModel()))
            .toArray(ItemInfo[]::new);
    }
    // 返回符合条件的所有 value 数组
    @SuppressWarnings("unchecked")
    public RegistryObject<Item>[] getAllValues(int filter) {
        return items.values().stream()
            .filter(item -> filter == 0 || (filter > 0 && item.defaultModel()) || (filter < 0 && !item.defaultModel()))
            .map(ItemInfo::value)
            .toArray(size -> (RegistryObject<Item>[]) Array.newInstance(RegistryObject.class, size));
    }
}
