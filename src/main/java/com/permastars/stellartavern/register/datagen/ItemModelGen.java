package com.permastars.stellartavern.register.datagen;

import com.permastars.stellartavern.StellarTavern;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;
import java.util.Objects;


import static com.permastars.stellartavern.register.item.DecorativeItem.*;
import static com.permastars.stellartavern.register.item.FunctionItem.*;


public class ItemModelGen extends ItemModelProvider {
    public static final String generatedItem = "item/generated";
    public static final String handheldItem = "item/handheld";

    public ItemModelGen(PackOutput output, ExistingFileHelper helper) {
        super(output, StellarTavern.modid, helper);
    }

    @Override
    protected void registerModels() {
        List<RegistryObject<Item>> items = List.of(
            // RegItem.DecorativeItem
            auroraGem,
            auroraCore,
            // RegItem.FunctionItem
            menu
        );
        items.forEach(this::itemGeneratedModel);
    }

    public void itemGeneratedModel(RegistryObject<Item> item) {
        var itemName = Objects.requireNonNull(ForgeRegistries.ITEMS.getKey(item.get())).getPath();
        withExistingParent(itemName, generatedItem)
            .texture("layer0", new ResourceLocation(StellarTavern.modid, "item/" + itemName));
    }
}
