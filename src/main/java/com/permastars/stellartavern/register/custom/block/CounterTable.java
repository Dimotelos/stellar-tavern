package com.permastars.stellartavern.register.custom.block;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.IntegerProperty;

public class CounterTable extends Block {

//    public static final BooleanProperty leg = BooleanProperty.create("leg");
//    public static final IntegerProperty group = IntegerProperty.create("group", 0, 500);

    public CounterTable(Properties properties) {
        super(properties);
//        registerDefaultState(this.stateDefinition.any().setValue(leg, true));
    }

}
