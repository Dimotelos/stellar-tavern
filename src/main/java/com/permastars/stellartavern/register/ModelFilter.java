package com.permastars.stellartavern.register;

public enum ModelFilter {
    ALL,           // 返回所有 BlockInfo
    DEFAULT_MODEL, // 返回 isDefaultModel() == true 的 BlockInfo
    CUSTOM_MODEL   // 返回 isDefaultModel() == false 的 BlockInfo
}
