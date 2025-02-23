package com.permastars.stellartavern.register.datagen.data;

import com.permastars.stellartavern.register.datagen.type.BlockItemModelType;
import com.permastars.stellartavern.register.datagen.type.BlockModelType;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.List;
import java.util.stream.Stream;

public class BlockRepository {
    private final Map<RegistryObject<Block>, BlockInfo> blocks = new HashMap<>();

    // 构造函数
    public BlockRepository(BlockInfo... blockInfos) {
        for (BlockInfo block : blockInfos) {
            blocks.put(block.block(), block);
        }
    }

    // 根据 block 获取项
    public BlockInfo get(RegistryObject<Block> block) {
        return blocks.get(block);
    }

    // 返回符合条件的所有 BlockInfo 列表
    public List<BlockInfo> getAll(BlockModelType blockModelType, BlockItemModelType blockItemModelType) {
        return filterBlocks(blockModelType, blockItemModelType)
            .collect(Collectors.toList());
    }
    // with_default
    public List<BlockInfo> getAll(BlockModelType blockModelType) {
        return getAll(blockModelType, null);
    }
    public List<BlockInfo> getAll() {
        return getAll(null, null);
    }

    // 返回符合条件的所有 Block 注册值列表
    public List<RegistryObject<Block>> getAllValues(BlockModelType blockModelType, BlockItemModelType blockItemModelType) {
        return filterBlocks(blockModelType, blockItemModelType)
            .map(BlockInfo::block)
            .collect(Collectors.toList());
    }
    // with_default
    public List<RegistryObject<Block>> getAllValues(BlockModelType blockModelType) {
        return getAllValues(blockModelType, null);
    }
    public List<RegistryObject<Block>> getAllValues() {
        return getAllValues(null, null);
    }

    // 返回符合条件的所有 BlockItem 注册值列表
    public List<RegistryObject<Item>> getAllBlockItemValues(BlockModelType blockModelType, BlockItemModelType blockItemModelType) {
        return filterBlocks(blockModelType, blockItemModelType)
            .map(BlockInfo::getBlockItem)
            .collect(Collectors.toList());
    }
    // with_default
    public List<RegistryObject<Item>> getAllBlockItemValues(BlockModelType blockModelType) {
        return getAllBlockItemValues(blockModelType, null);
    }
    public List<RegistryObject<Item>> getAllBlockItemValues() {
        return getAllBlockItemValues(null, null);
    }

    // 抽象出的高复用代码：过滤 BlockInfo 流
    private Stream<BlockInfo> filterBlocks(BlockModelType blockModelType, BlockItemModelType blockItemModelType) {
        return blocks.values().stream()
            .filter(block -> blockModelType == null || block.getBlockModelType() == blockModelType)
            .filter(block -> blockItemModelType == null || block.getBlockItemModelType() == blockItemModelType);
    }
}