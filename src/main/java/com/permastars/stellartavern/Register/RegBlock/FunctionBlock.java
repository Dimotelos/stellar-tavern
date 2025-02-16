package com.permastars.stellartavern.Register.RegBlock;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static com.permastars.stellartavern.StellarTavern.modid;


public class FunctionBlock {

    private static final DeferredRegister<Block> blockRegister = DeferredRegister.create(ForgeRegistries.BLOCKS, modid);

    // 创建新方块
    public static final RegistryObject<Block> example_block = blockRegister.register(
        "example_block", () -> new Block(
            BlockBehaviour.Properties.of().mapColor(MapColor.STONE)
        ));

    // 注册新方块
    public static void register(IEventBus eventBus) {
        blockRegister.register(eventBus);
    };
}
