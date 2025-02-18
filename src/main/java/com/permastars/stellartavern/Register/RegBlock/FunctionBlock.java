package com.permastars.stellartavern.Register.RegBlock;

import com.permastars.stellartavern.Register.RegBlock.Custom.FoodPassTable;
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
    public static final RegistryObject<Block> foodPassTable = blockRegister.register(
        "food_pass_table", () -> new FoodPassTable(BlockBehaviour.Properties.of()));
    public static final RegistryObject<Block> dishwashing = blockRegister.register(
        "dishwashing", () -> new Block(BlockBehaviour.Properties.of()));
    public static final RegistryObject<Block> starscarDishwashing = blockRegister.register(
        "starscar_dishwashing", () -> new Block(BlockBehaviour.Properties.of()));
    public static final RegistryObject<Block> cashier = blockRegister.register(
        "cashier", () -> new Block(BlockBehaviour.Properties.of()));
    public static final RegistryObject<Block> openSign = blockRegister.register(
        "open_sign", () -> new Block(BlockBehaviour.Properties.of()));
    public static final RegistryObject<Block> tray = blockRegister.register(
        "tray", () -> new Block(BlockBehaviour.Properties.of()));

//    var a = Stream.of(
//        Block.box(0, 0, 1.5, 16, 15.5, 16),
//        VoxelShapes.join(Block.box(2, 5.75, 0.5, 8.5, 14.25, 2.5), Block.box(1.25, 13, 0.75, 9.25, 14, 2.75), IBooleanFunction.OR),
//        VoxelShapes.join(Block.box(12, 9.5, 1, 14.25, 13.75, 2), Block.box(10.5, 8.75, 1.25, 12.75, 13, 2.25), IBooleanFunction.OR),
//        Block.box(1, 0.25, 0.5, 15, 2.75, 2.5),
//        Stream.of(
//            VoxelShapes.join(Block.box(6.5, 14.25, 12.25, 15.5, 16.25, 12.75), Block.box(6.75, 11.45279, 14.93001, 15.25, 13.45279, 17.68001), IBooleanFunction.OR),
//            Block.box(1.5, 14.75, 2.25, 14.5, 16.25, 10.75),
//            Block.box(-0.25, 14.75, 0.1, 16.25, 15.75, 16.25)
//        ).reduce((v1, v2) -> VoxelShapes.join(v1, v2, IBooleanFunction.OR)).get();
//        ).reduce((v1, v2) -> VoxelShapes.join(v1, v2, IBooleanFunction.OR)).get();

    // 注册新方块
    public static void register(IEventBus eventBus) { blockRegister.register(eventBus); };
}
