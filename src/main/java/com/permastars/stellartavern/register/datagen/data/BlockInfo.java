package com.permastars.stellartavern.register.datagen.data;

import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

public record BlockInfo(RegistryObject<Block> value, String zhCn, String enUs, boolean defaultModel, Item blockItem) {}
