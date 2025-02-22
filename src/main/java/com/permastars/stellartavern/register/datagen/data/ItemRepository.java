package com.permastars.stellartavern.register.datagen.data;

import net.minecraft.world.item.Item;
import net.minecraftforge.registries.RegistryObject;
import com.permastars.stellartavern.register.ModelFilter;

import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.stream.Collectors;

// 存储多个项的容器类
public class ItemRepository {
    private final Map<RegistryObject<Item>, ItemInfo> items = new HashMap<>();

    // 构造函数
    public ItemRepository(ItemInfo... itemInfos) {
        for (ItemInfo item : itemInfos) {
            items.put(item.value(), item);
        }
    }

    // 根据 value 获取项
    public ItemInfo get(RegistryObject<Item> value) {
        return items.get(value);
    }

    // 返回符合条件的所有 ItemInfo 列表
    public List<ItemInfo> getAll(ModelFilter filter) {
        return items.values().stream()
            .filter(item -> filter == ModelFilter.ALL ||
                (filter == ModelFilter.DEFAULT_MODEL && item.isDefaultModel()) ||
                (filter == ModelFilter.CUSTOM_MODEL && !item.isDefaultModel()))
            .collect(Collectors.toList());
    }

    // 返回符合条件的所有 value 列表
    public List<RegistryObject<Item>> getAllValues(ModelFilter filter) {
        return items.values().stream()
            .filter(item -> filter == ModelFilter.ALL ||
                (filter == ModelFilter.DEFAULT_MODEL && item.isDefaultModel()) ||
                (filter == ModelFilter.CUSTOM_MODEL && !item.isDefaultModel()))
            .map(ItemInfo::value)
            .collect(Collectors.toList());
    }

    // 为 filter 设置默认值的方法
    public List<ItemInfo> getAll() {
        return getAll(ModelFilter.ALL);
    }

    public List<RegistryObject<Item>> getAllValues() {
        return getAllValues(ModelFilter.ALL);
    }
}