package com.permastars.stellartavern.Register.RegBlock;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static com.permastars.stellartavern.StellarTavern.modid;


public class FunctionBlock {

    private static final DeferredRegister<Block> blockRegister = DeferredRegister.create(ForgeRegistries.BLOCKS, modid);

    // 创建新方块
    public static final RegistryObject<Block> foodPassTable = blockRegister.register("food_pass_table", () -> new Block(BlockBehaviour.Properties.of()));
    public static final RegistryObject<Block> dishwashing = blockRegister.register("dishwashing", () -> new Block(BlockBehaviour.Properties.of()));
    public static final RegistryObject<Block> starscarDishwashing = blockRegister.register("starscar_dishwashing", () -> new Block(BlockBehaviour.Properties.of()));
    public static final RegistryObject<Block> cashier = blockRegister.register("cashier", () -> new Block(BlockBehaviour.Properties.of()));
    public static final RegistryObject<Block> open_sign = blockRegister.register("open_sign", () -> new Block(BlockBehaviour.Properties.of()));
    public static final RegistryObject<Block> tray = blockRegister.register("tray", () -> new Block(BlockBehaviour.Properties.of()));

    // 注册新方块
    public static void register(IEventBus eventBus) {
        blockRegister.register(eventBus);
    };
}
