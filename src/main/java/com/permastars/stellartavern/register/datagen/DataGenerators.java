package com.permastars.stellartavern.register.datagen;

import com.permastars.stellartavern.StellarTavern;
import com.permastars.stellartavern.register.datagen.lang.*;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.concurrent.CompletableFuture;

@Mod.EventBusSubscriber(modid = StellarTavern.modid,  bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators {

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        // DataGenerators 相关前置属性
        DataGenerator generator = event.getGenerator();
        PackOutput output = generator.getPackOutput();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();
        ExistingFileHelper helper = event.getExistingFileHelper();
        // Gen: item without models
        generator.addProvider(event.includeClient(), new ItemModelGen(output, helper));
        // Gen: lang
        generator.addProvider(event.includeClient(), new zh_cn(output, "zh_cn"));
        generator.addProvider(event.includeClient(), new en_us(output, "en_us"));

    }
}
