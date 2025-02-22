package com.permastars.stellartavern.register.datagen.data;

import com.permastars.stellartavern.register.BlockItemModelType;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

public record BlockInfo(
    RegistryObject<Block> value,           // Block 的注册对象
    String zhCn,                           // 中文名称
    String enUs,                           // 英文名称
    RegistryObject<Item> blockItem,        // 对应的 BlockItem
    boolean defaultModel,                  // 是否使用默认 Block 模型，默认值为 false
    BlockItemModelType blockItemModelType  // BlockItem 的模型类型，默认值为 DEFAULT_BLOCK_ITEM_MODEL
) {
    // 重载构造函数：省略 defaultModel 和 blockItemModelType
    public BlockInfo(RegistryObject<Block> value, String zhCn, String enUs, RegistryObject<Item> blockItem) {
        this(value, zhCn, enUs, blockItem, true, BlockItemModelType.DEFAULT_BLOCK_ITEM_MODEL);
    }

    // 重载构造函数：省略 blockItemModelType
    public BlockInfo(RegistryObject<Block> value, String zhCn, String enUs, RegistryObject<Item> blockItem, boolean defaultModel) {
        this(value, zhCn, enUs, blockItem, defaultModel, BlockItemModelType.DEFAULT_BLOCK_ITEM_MODEL);
    }

    // 获取 Block 的注册对象
    public RegistryObject<Block> getValue() { return value; }

    // 获取中文名称
    public String getZhCN() { return zhCn; }

    // 获取英文名称
    public String getEnUS() { return enUs; }

    // 获取对应的 BlockItem
    public RegistryObject<Item> getBlockItem() { return blockItem; }

    // 是否使用默认 Block 模型
    public boolean isDefaultModel() { return defaultModel; }

    // 获取 BlockItem 的模型类型
    public BlockItemModelType getBlockItemModelType() { return blockItemModelType; }
}