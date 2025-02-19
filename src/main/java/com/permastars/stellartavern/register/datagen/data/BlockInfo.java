package com.permastars.stellartavern.register.datagen.data;

import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

public record BlockInfo(RegistryObject<Block> value, String zhCn, String enUs, boolean defaultModel, Item blockItem) {
    public RegistryObject<Block> getValue () { return value; }
    public String getZhCN() { return zhCn; }
    public String getEnUS() { return enUs; }
    public boolean isDefaultModel() { return defaultModel; }
    public Item getBlockItem() { return blockItem; }
}
