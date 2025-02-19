package com.permastars.stellartavern.register.datagen.data;

public record LangInfo(String key, String zhCn, String enUs) {
    public String getKey() { return key; }
    public String getZhCN() { return zhCn; }
    public String getEnUS() { return enUs; }
}
