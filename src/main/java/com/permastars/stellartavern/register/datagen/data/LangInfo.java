package com.permastars.stellartavern.register.datagen.data;

public record LangInfo(
    String key,
    String zhCn,
    String enUs
) {
    // 获取 语言 Key 值
    public String getKey() { return key; }

    // 获取中文名称
    public String getZhCN() { return zhCn; }

    // 获取英文名称
    public String getEnUS() { return enUs; }
}
