package com.permastars.stellartavern.register.datagen.data;

import com.permastars.stellartavern.register.BlockItemModelType;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;
import com.permastars.stellartavern.register.ModelFilter;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.List;

public class BlockRepository {
    private final Map<RegistryObject<Block>, BlockInfo> blocks = new HashMap<>();

    // 构造函数
    public BlockRepository(BlockInfo... blockInfos) {
        for (BlockInfo block : blockInfos) {
            blocks.put(block.value(), block);
        }
    }

    // 根据 value 获取项
    public BlockInfo get(RegistryObject<Block> value) {
        return blocks.get(value);
    }

    // 返回符合条件的所有 BlockInfo 列表
    public List<BlockInfo> getAll(ModelFilter filter, BlockItemModelType blockItemModelType) {
        return filterBlocks(filter, blockItemModelType)
            .collect(Collectors.toList());
    }

    // 返回符合条件的所有 Block 注册值列表
    public List<RegistryObject<Block>> getAllValues(ModelFilter filter, BlockItemModelType blockItemModelType) {
        return filterBlocks(filter, blockItemModelType)
            .map(BlockInfo::value)
            .collect(Collectors.toList());
    }

    // 返回符合条件的所有 BlockItem 注册值列表
    public List<RegistryObject<Item>> getAllBlockItemValues(ModelFilter filter, BlockItemModelType blockItemModelType) {
        return filterBlocks(filter, blockItemModelType)
            .map(BlockInfo::getBlockItem) // 假设 BlockInfo 中有 getBlockItem 方法
            .collect(Collectors.toList());
    }

    // 为 filter 和 blockItemModelType 设置默认值的方法
    public List<BlockInfo> getAll() {
        return getAll(ModelFilter.ALL, BlockItemModelType.DEFAULT_BLOCK_ITEM_MODEL);
    }

    public List<RegistryObject<Block>> getAllValues() {
        return getAllValues(ModelFilter.ALL, BlockItemModelType.DEFAULT_BLOCK_ITEM_MODEL);
    }

    public List<RegistryObject<Item>> getAllBlockItemValues() {
        return getAllBlockItemValues(ModelFilter.ALL, BlockItemModelType.DEFAULT_BLOCK_ITEM_MODEL);
    }

    // 抽象出的高复用代码：过滤 BlockInfo 流
    private java.util.stream.Stream<BlockInfo> filterBlocks(ModelFilter filter, BlockItemModelType blockItemModelType) {
        return blocks.values().stream()
            .filter(block -> (filter == ModelFilter.ALL ||
                (filter == ModelFilter.DEFAULT_MODEL && block.isDefaultModel()) ||
                (filter == ModelFilter.CUSTOM_MODEL && !block.isDefaultModel())))
            .filter(block -> blockItemModelType == null || block.getBlockItemModelType() == blockItemModelType);
    }
}