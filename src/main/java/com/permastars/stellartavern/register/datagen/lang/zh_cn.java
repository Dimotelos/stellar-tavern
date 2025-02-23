package com.permastars.stellartavern.register.datagen.lang;

import com.permastars.stellartavern.StellarTavern;
import com.permastars.stellartavern.register.datagen.data.BlockInfo;
import com.permastars.stellartavern.register.datagen.data.Data;
import com.permastars.stellartavern.register.datagen.data.ItemInfo;
import com.permastars.stellartavern.register.datagen.data.LangInfo;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.LanguageProvider;


public class zh_cn extends LanguageProvider {
    public zh_cn(PackOutput output, String locale) {
        super(output, StellarTavern.modid, locale);
    }

    @Override
    protected void addTranslations() {
        for (BlockInfo block: Data.blocks.getAll()) { add(block.getBlock().get(), block.getZhCN()); }
        for (ItemInfo item: Data.items.getAll()) { add(item.getItem().get(), item.getZhCN()); }
        for (LangInfo lang: Data.langs.getAll()) { add(lang.getKey(), lang.getZhCN()); }

        for (BlockInfo block: Data.starscar_blocks.getAll()) { add(block.getBlock().get(), block.getZhCN()); }
        for (ItemInfo item: Data.starscar_items.getAll()) { add(item.getItem().get(), item.getZhCN()); }
    }
}
