package com.permastars.stellartavern.register.datagen.data;

import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Map;

public class BlockRepository {
    private final Map<RegistryObject<Block>, BlockInfo> blocks = new HashMap<>();
    // 构造函数
    public BlockRepository(BlockInfo... blockInfos) { for (BlockInfo block : blockInfos) { blocks.put(block.value(), block); } }
    // 根据value获取项
    public BlockInfo get(RegistryObject<Block> value) { return blocks.get(value); }
    // 返回符合条件的所有 BlockInfo 数组
    public BlockInfo[] getAll(int filter) {
        return blocks.values().stream()
            .filter(block -> filter == 0 || (filter > 0 && block.defaultModel()) || (filter < 0 && !block.defaultModel()))
            .toArray(BlockInfo[]::new);
    }
    // 返回符合条件的所有 value 数组
    @SuppressWarnings("unchecked")
    public RegistryObject<Block>[] getAllValues(int filter) {
        return blocks.values().stream()
            .filter(block -> filter == 0 || (filter > 0 && block.defaultModel()) || (filter < 0 && !block.defaultModel()))
            .map(BlockInfo::value)
            .toArray(size -> (RegistryObject<Block>[]) Array.newInstance(RegistryObject.class, size));
    }
}
