package com.permastars.stellartavern.register.datagen.lang;

import com.permastars.stellartavern.StellarTavern;
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
        for (ItemInfo item: Data.items.getAll(0)) { add(item.getValue().get(), item.getZhCN()); }
        for (LangInfo lang: Data.langs.getAll()) { add(lang.getKey(), lang.getZhCN()); }
    }
}
