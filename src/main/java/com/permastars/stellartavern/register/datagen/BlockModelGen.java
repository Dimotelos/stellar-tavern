package com.permastars.stellartavern.register.datagen;

import com.permastars.stellartavern.StellarTavern;
import com.permastars.stellartavern.register.datagen.data.Data;
import com.permastars.stellartavern.register.datagen.type.BlockModelType;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class BlockModelGen extends BlockStateProvider {

    public BlockModelGen(PackOutput output, ExistingFileHelper helper) {
        super(output, StellarTavern.modid, helper);
    }

    @Override
    protected void registerStatesAndModels() {
        // 简单方块：无变体六面同材质方块
        for (RegistryObject<Block> block : Data.starscar_blocks.getAllValues(BlockModelType.Simple)) {

            this.simpleBlockWithItem(block.get(), this.cubeAll(block.get()));
        }
    }
}
