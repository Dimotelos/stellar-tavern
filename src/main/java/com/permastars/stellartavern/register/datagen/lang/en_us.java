package com.permastars.stellartavern.register.datagen.lang;

import com.permastars.stellartavern.StellarTavern;
import com.permastars.stellartavern.register.datagen.data.BlockInfo;
import com.permastars.stellartavern.register.datagen.data.Data;
import com.permastars.stellartavern.register.datagen.data.ItemInfo;
import com.permastars.stellartavern.register.datagen.data.LangInfo;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.LanguageProvider;


public class en_us extends LanguageProvider {
    public en_us(PackOutput output, String locale) {
        super(output, StellarTavern.modid, locale);
    }

    @Override
    protected void addTranslations() {
        for (BlockInfo block: Data.blocks.getAll()) { add(block.getValue().get(), block.getEnUS()); }
        for (ItemInfo item: Data.items.getAll()) { add(item.getValue().get(), item.getEnUS()); }
        for (LangInfo lang: Data.langs.getAll()) { add(lang.getKey(), lang.getEnUS()); }

        for (BlockInfo block: Data.starscar_blocks.getAll()) { add(block.getValue().get(), block.getEnUS()); }
        for (ItemInfo item: Data.starscar_items.getAll()) { add(item.getValue().get(), item.getEnUS()); }
    }
}
