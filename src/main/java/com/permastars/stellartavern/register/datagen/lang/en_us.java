package com.permastars.stellartavern.register.datagen.lang;

import com.permastars.stellartavern.StellarTavern;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.LanguageProvider;

import static com.permastars.stellartavern.register.item.DecorativeItem.auroraGem;

public class en_us extends LanguageProvider {
    public en_us(PackOutput output, String locale) {
        super(output, StellarTavern.modid, locale);
    }

    @Override
    protected void addTranslations() {
        add(auroraGem.get(), "Aurora Gem");
    }
}
