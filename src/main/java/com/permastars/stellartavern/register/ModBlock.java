package com.permastars.stellartavern.register;

import com.permastars.stellartavern.register.custom.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.minecraft.world.level.block.Block;

import static com.permastars.stellartavern.StellarTavern.modid;

public class ModBlock {

    private static final DeferredRegister<Block> blockRegister = DeferredRegister.create(ForgeRegistries.BLOCKS, modid);

    // 有交互方块
    public static final RegistryObject<Block> foodPassTable = blockRegister.register(
        "food_pass_table", () -> new FoodPassTable(
            BlockBehaviour.Properties.of()
                .noOcclusion() // 设置为不完整方块渲染以解决底边透视问题
        )); // 传菜桌
    public static final RegistryObject<Block> dishwashing = blockRegister.register(
        "dishwashing", () -> new Dishwashing(
            BlockBehaviour.Properties.of()
        )); // 洗碗台
    public static final RegistryObject<Block> starscarDishwashing = blockRegister.register(
        "starscar_dishwashing", () -> new StarscarDishwashing(
            BlockBehaviour.Properties.of()
        )); // 星痕洗碗台
    public static final RegistryObject<Block> cashier = blockRegister.register(
        "cashier", () -> new Cashier(
            BlockBehaviour.Properties.of()
        )); // 收银机
    public static final RegistryObject<Block> tray = blockRegister.register("tray", () -> new Block(BlockBehaviour.Properties.of())); // 托盘

    // 无交互方块
    public static final RegistryObject<Block> barStool = blockRegister.register("bar_stool", () -> new Block(BlockBehaviour.Properties.of()));
    public static final RegistryObject<Block> barChair = blockRegister.register("bar_chair", () -> new Block(BlockBehaviour.Properties.of()));
    public static final RegistryObject<Block> pubStool = blockRegister.register("pub_stool", () -> new Block(BlockBehaviour.Properties.of()));
    public static final RegistryObject<Block> pubChair = blockRegister.register("pub_chair", () -> new Block(BlockBehaviour.Properties.of()));
    public static final RegistryObject<Block> sofa = blockRegister.register("sofa", () -> new Block(BlockBehaviour.Properties.of()));
    public static final RegistryObject<Block> counterTable = blockRegister.register(
        "counter_table", () -> new CounterTable(BlockBehaviour.Properties.of()
        )); // 台面桌
    public static final RegistryObject<Block> faucet = blockRegister.register("faucet", () -> new Block(BlockBehaviour.Properties.of()));

    public static final RegistryObject<Block> auroraOre = blockRegister.register("aurora_ore", () -> new Block(BlockBehaviour.Properties.of()));
    public static final RegistryObject<Block> deepslateAuroraOre = blockRegister.register("deepslate_aurora_ore", () -> new Block(BlockBehaviour.Properties.of()));

    // 注册新方块
    public static void register(IEventBus eventBus) { blockRegister.register(eventBus); }
}
