package com.permastars.stellartavern.register.datagen.data;

import java.util.HashMap;
import java.util.Map;


public class LangInfoRepository {
    private final Map<String, LangInfo> langs = new HashMap<>();
    // 构造函数
    public LangInfoRepository(LangInfo... langInfos) { for (LangInfo lang : langInfos) { langs.put(lang.key(), lang); } }
    // 根据key获取项
    public LangInfo get(String key) { return langs.get(key); }
    // 返回符合条件的所有 LangInfo 数组
    public LangInfo[] getAll() {
        return langs.values().toArray(LangInfo[]::new);
    }
}
