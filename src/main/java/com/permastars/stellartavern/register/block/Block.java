package com.permastars.stellartavern.register.block;

import com.permastars.stellartavern.register.block.custom.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static com.permastars.stellartavern.StellarTavern.modid;

public class Block {

    private static final DeferredRegister<net.minecraft.world.level.block.Block> blockRegister = DeferredRegister.create(ForgeRegistries.BLOCKS, modid);

    // 有交互方块
    public static final RegistryObject<net.minecraft.world.level.block.Block> foodPassTable = blockRegister.register(
        "food_pass_table", () -> new FoodPassTable(
            BlockBehaviour.Properties.of()
                .noOcclusion() // 设置为不完整方块渲染以解决底边透视问题
        )); // 传菜桌
    public static final RegistryObject<net.minecraft.world.level.block.Block> dishwashing = blockRegister.register(
        "dishwashing", () -> new Dishwashing(
            BlockBehaviour.Properties.of()
        )); // 洗碗台
    public static final RegistryObject<net.minecraft.world.level.block.Block> starscarDishwashing = blockRegister.register(
        "starscar_dishwashing", () -> new StarscarDishwashing(
            BlockBehaviour.Properties.of()
        )); // 星痕洗碗台
    public static final RegistryObject<net.minecraft.world.level.block.Block> cashier = blockRegister.register(
        "cashier", () -> new Cashier(
            BlockBehaviour.Properties.of()
        )); // 收银机
    public static final RegistryObject<net.minecraft.world.level.block.Block> tray = blockRegister.register(
        "tray", () -> new net.minecraft.world.level.block.Block(
            BlockBehaviour.Properties.of()
        )); // 托盘

    // 无交互方块
    public static final RegistryObject<net.minecraft.world.level.block.Block> barStool = blockRegister.register("bar_stool", () -> new net.minecraft.world.level.block.Block(BlockBehaviour.Properties.of()));
    public static final RegistryObject<net.minecraft.world.level.block.Block> barChair = blockRegister.register("bar_chair", () -> new net.minecraft.world.level.block.Block(BlockBehaviour.Properties.of()));
    public static final RegistryObject<net.minecraft.world.level.block.Block> pubStool = blockRegister.register("pub_stool", () -> new net.minecraft.world.level.block.Block(BlockBehaviour.Properties.of()));
    public static final RegistryObject<net.minecraft.world.level.block.Block> pubChair = blockRegister.register("pub_chair", () -> new net.minecraft.world.level.block.Block(BlockBehaviour.Properties.of()));
    public static final RegistryObject<net.minecraft.world.level.block.Block> sofa = blockRegister.register("sofa", () -> new net.minecraft.world.level.block.Block(BlockBehaviour.Properties.of()));
    public static final RegistryObject<net.minecraft.world.level.block.Block> counterTable = blockRegister.register("counter_table", () -> new net.minecraft.world.level.block.Block(BlockBehaviour.Properties.of()));
    public static final RegistryObject<net.minecraft.world.level.block.Block> faucet = blockRegister.register("faucet", () -> new net.minecraft.world.level.block.Block(BlockBehaviour.Properties.of()));

    public static final RegistryObject<net.minecraft.world.level.block.Block> auroraOre = blockRegister.register("aurora_ore", () -> new net.minecraft.world.level.block.Block(BlockBehaviour.Properties.of()));
    public static final RegistryObject<net.minecraft.world.level.block.Block> deepslateAuroraOre = blockRegister.register("deepslate_aurora_ore", () -> new net.minecraft.world.level.block.Block(BlockBehaviour.Properties.of()));

    // 注册新方块
    public static void register(IEventBus eventBus) { blockRegister.register(eventBus); }
}
