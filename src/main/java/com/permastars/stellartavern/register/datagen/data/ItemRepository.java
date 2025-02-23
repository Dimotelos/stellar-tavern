package com.permastars.stellartavern.register.datagen.data;

import com.permastars.stellartavern.register.datagen.type.ItemModelType;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.RegistryObject;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ItemRepository {
    private final Map<RegistryObject<Item>, ItemInfo> items = new HashMap<>();

    // 构造函数
    public ItemRepository(ItemInfo... itemInfos) {
        for (ItemInfo item : itemInfos) {
            items.put(item.item(), item);
        }
    }

    // 根据 block 获取项
    public ItemInfo get(RegistryObject<Item> item) {
        return items.get(item);
    }

    // 返回符合条件的所有 ItemInfo 列表
    public List<ItemInfo> getAll(ItemModelType itemModelType) {
        return filterItems(itemModelType)
            .collect(Collectors.toList());
    }
    // with_default
    public List<ItemInfo> getAll() {
        return getAll(null);
    }

    // 返回符合条件的所有 block 列表
    public List<RegistryObject<Item>> getAllValues(ItemModelType itemModelType) {
        return filterItems(itemModelType)
            .map(ItemInfo::item)
            .collect(Collectors.toList());
    }
    // with_default
    public List<RegistryObject<Item>> getAllValues() {
        return getAllValues(null);
    }

    // 抽象出的高复用代码：过滤 ItemInfo 流
    private Stream<ItemInfo> filterItems(ItemModelType itemModelType) {
        return items.values().stream()
            .filter(item -> itemModelType == null || item.getItemModelType() == itemModelType);
    }
}