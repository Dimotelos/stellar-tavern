package com.permastars.stellartavern.register.datagen.data;

import com.permastars.stellartavern.register.datagen.type.BlockItemModelType;
import com.permastars.stellartavern.register.datagen.type.BlockModelType;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

public record BlockInfo(
    RegistryObject<Block> block,           // Block 的注册对象
    String zhCn,                           // 中文名称
    String enUs,                           // 英文名称
    RegistryObject<Item> blockItem,        // 对应的 BlockItem
    BlockModelType blockModelType,         // 使用枚举类型 BlockModelType，默认值为 BlockModelType.Simple
    BlockItemModelType blockItemModelType  // BlockItem 的模型类型，默认值为 DEFAULT_BLOCK_ITEM_MODEL
) {
    // 重载构造函数：省略 blockItemModelType
    public BlockInfo(RegistryObject<Block> value, String zhCn, String enUs, RegistryObject<Item> blockItem, BlockModelType defaultModel) {
        this(value, zhCn, enUs, blockItem, defaultModel, BlockItemModelType.BlockItem);
    }

    // 重载构造函数：省略 blockModelType
    public BlockInfo(RegistryObject<Block> value, String zhCn, String enUs, RegistryObject<Item> blockItem, BlockItemModelType blockItemModelType) {
        this(value, zhCn, enUs, blockItem, BlockModelType.Simple, blockItemModelType);
    }

    // 重载构造函数：省略 blockModelType 和 blockItemModelType
    public BlockInfo(RegistryObject<Block> value, String zhCn, String enUs, RegistryObject<Item> blockItem) {
        this(value, zhCn, enUs, blockItem, BlockModelType.Simple, BlockItemModelType.BlockItem);
    }

    // 获取 Block 的注册对象
    public RegistryObject<Block> getBlock() { return block; }

    // 获取中文名称
    public String getZhCN() { return zhCn; }

    // 获取英文名称
    public String getEnUS() { return enUs; }

    // 获取对应的 BlockItem
    public RegistryObject<Item> getBlockItem() { return blockItem; }

    // 获取 Block 的模型类型
    public BlockModelType getBlockModelType() { return blockModelType; }

    // 获取 BlockItem 的模型类型
    public BlockItemModelType getBlockItemModelType() { return blockItemModelType; }
}