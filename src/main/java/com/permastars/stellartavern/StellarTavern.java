package com.permastars.stellartavern;

import com.mojang.logging.LogUtils;
import net.minecraft.client.Minecraft;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.slf4j.Logger;

// 这里的值应与 META-INF/mods.toml 文件中的条目匹配
@Mod(StellarTavern.MODID)
public class StellarTavern
{
    // 在一个公共地方定义 mod id，以便所有内容都可以引用
    public static final String MODID = "stellartavern";
    // 直接引用一个 slf4j 日志记录器
    private static final Logger LOGGER = LogUtils.getLogger();
    // 创建一个延迟注册器来保存方块，这些方块将在 "stellartavern" 命名空间下注册
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MODID);
    // 创建一个延迟注册器来保存物品，这些物品将在 "stellartavern" 命名空间下注册
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MODID);
    // 创建一个延迟注册器来保存创造模式标签页，这些标签页将在 "stellartavern" 命名空间下注册
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MODID);

    // 创建一个新的方块，id 为 "stellartavern:example_block"，结合命名空间和路径
    public static final RegistryObject<Block> EXAMPLE_BLOCK = BLOCKS.register(
        "example_block", () -> new Block(
            BlockBehaviour.Properties.of().mapColor(MapColor.STONE)
        ));
    // 创建一个新的方块物品，id 为 "stellartavern:example_block"，结合命名空间和路径
    public static final RegistryObject<Item> EXAMPLE_BLOCK_ITEM = ITEMS.register(
        "example_block", () -> new BlockItem(
            EXAMPLE_BLOCK.get(), new Item.Properties()
        ));

    // 创建一个新的食物物品，id 为 "stellartavern:example_id"，营养值为 1，饱和度为 2
    public static final RegistryObject<Item> EXAMPLE_ITEM = ITEMS.register(
        "example_item", () -> new Item(
            new Item.Properties().food(
                new FoodProperties.Builder()
                    .alwaysEat()
                    .nutrition(1)
                    .saturationMod(2f)
                    .build()
            )
        )
    );

    // 为示例物品创建一个创造模式标签页，id 为 "stellartavern:example_tab"，放置在战斗标签页之后
    public static final RegistryObject<CreativeModeTab> EXAMPLE_TAB = CREATIVE_MODE_TABS.register(
        "example_tab",
        () -> CreativeModeTab.builder()
            .withTabsBefore(CreativeModeTabs.COMBAT)
            .icon(() -> EXAMPLE_ITEM.get().getDefaultInstance())
            .displayItems((parameters, output) -> {
                output.accept(EXAMPLE_ITEM.get()); // 将示例物品添加到标签页。对于你自己的标签页，推荐使用此方法而不是事件
            })
            .build()
    );

    public StellarTavern()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        // 注册 commonSetup 方法以进行 mod 加载
        modEventBus.addListener(this::commonSetup);

        // 将延迟注册器注册到 mod 事件总线，以便注册方块
        BLOCKS.register(modEventBus);
        // 将延迟注册器注册到 mod 事件总线，以便注册物品
        ITEMS.register(modEventBus);
        // 将延迟注册器注册到 mod 事件总线，以便注册标签页
        CREATIVE_MODE_TABS.register(modEventBus);

        // 注册我们自己以接收服务器和其他游戏事件
        MinecraftForge.EVENT_BUS.register(this);

        // 将物品注册到创造模式标签页
        modEventBus.addListener(this::addCreative);

        // 注册我们的 mod 的 ForgeConfigSpec，以便 Forge 可以为我们创建和加载配置文件
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {
        // 一些通用的设置代码
        LOGGER.info("HELLO FROM COMMON SETUP");

        if (Config.logDirtBlock)
            LOGGER.info("DIRT BLOCK >> {}", ForgeRegistries.BLOCKS.getKey(Blocks.DIRT));

        LOGGER.info("{}{}", Config.magicNumberIntroduction, Config.magicNumber);

        Config.items.forEach((item) -> LOGGER.info("ITEM >> {}", item.toString()));
    }

    // 将示例方块物品添加到建筑方块标签页
    private void addCreative(BuildCreativeModeTabContentsEvent event)
    {
        if (event.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS)
            event.accept(EXAMPLE_BLOCK_ITEM);
    }

    // 你可以使用 SubscribeEvent 并让事件总线发现要调用的方法
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event)
    {
        // 在服务器启动时执行某些操作
        LOGGER.info("HELLO from server starting");
    }

    // 你可以使用 EventBusSubscriber 自动注册类中所有带有 @SubscribeEvent 注解的静态方法
    @Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {
            // 一些客户端设置代码
            LOGGER.info("HELLO FROM CLIENT SETUP");
            LOGGER.info("MINECRAFT NAME >> {}", Minecraft.getInstance().getUser().getName());
        }
    }
}