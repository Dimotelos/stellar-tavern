package com.permastars.stellartavern;

import com.mojang.logging.LogUtils;
import com.permastars.stellartavern.register.creativetab.CreativeTab;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.ForgeRegistries;
import org.slf4j.Logger;

import com.permastars.stellartavern.register.block.Block;
import com.permastars.stellartavern.register.item.BlockItem;
import com.permastars.stellartavern.register.item.Item;


@Mod(StellarTavern.modid)
public class StellarTavern
{
    // 在一个公共地方定义 mod id，以便所有内容都可以引用
    public static final String modid = "stellartavern";
    // 直接引用一个 slf4j 日志记录器
    private static final Logger logger = LogUtils.getLogger();

    public StellarTavern()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        // 注册 commonSetup 方法以进行 mod 加载
        modEventBus.addListener(this::commonSetup);

        // 注册各种方块和物品
        Block.register(modEventBus);
        BlockItem.register(modEventBus);
        Item.register(modEventBus);

        // 注册Stellar Tavern独属的创造物品栏
        CreativeTab.register(modEventBus);

        // 注册我们自己以接收服务器和其他游戏事件
        MinecraftForge.EVENT_BUS.register(this);

        // 注册我们的 mod 的 ForgeConfigSpec，以便 Forge 可以为我们创建和加载配置文件
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {
        // 一些通用的设置代码
        logger.info("HELLO FROM COMMON SETUP");

        if (Config.logDirtBlock)
            logger.info("DIRT BLOCK >> {}", ForgeRegistries.BLOCKS.getKey(Blocks.DIRT));

        logger.info("{}{}", Config.magicNumberIntroduction, Config.magicNumber);

        Config.items.forEach((item) -> logger.info("ITEM >> {}", item.toString()));
    }
}