package com.permastars.stellartavern.Register.RegBlock;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static com.permastars.stellartavern.StellarTavern.modid;


public class DecorativeBlock {

    private static final DeferredRegister<Block> blockRegister = DeferredRegister.create(ForgeRegistries.BLOCKS, modid);

    // 创建新方块
    public static final RegistryObject<Block> barStool = blockRegister.register("bar_stool", () -> new Block(BlockBehaviour.Properties.of()));
    public static final RegistryObject<Block> barChair = blockRegister.register("bar_chair", () -> new Block(BlockBehaviour.Properties.of()));
    public static final RegistryObject<Block> pubStool = blockRegister.register("pub_stool", () -> new Block(BlockBehaviour.Properties.of()));
    public static final RegistryObject<Block> pubChair = blockRegister.register("pub_chair", () -> new Block(BlockBehaviour.Properties.of()));
    public static final RegistryObject<Block> sofa = blockRegister.register("sofa", () -> new Block(BlockBehaviour.Properties.of()));
    public static final RegistryObject<Block> counterTable = blockRegister.register("counter_table", () -> new Block(BlockBehaviour.Properties.of()));
    public static final RegistryObject<Block> faucet = blockRegister.register("faucet", () -> new Block(BlockBehaviour.Properties.of()));

    public static final RegistryObject<Block> auroraOre = blockRegister.register("aurora_ore", () -> new Block(BlockBehaviour.Properties.of()));
    public static final RegistryObject<Block> deepslateAuroraOre = blockRegister.register("aurora_deep_ore", () -> new Block(BlockBehaviour.Properties.of()));

    // 注册新方块
    public static void register(IEventBus eventBus) { blockRegister.register(eventBus); };
}