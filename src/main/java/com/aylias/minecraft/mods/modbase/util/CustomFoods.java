package com.aylias.minecraft.mods.modbase.util;

import net.minecraft.item.Food;

public class CustomFoods {
    public static final Food DIAMOND_APPLE = (new Food.Builder()).setAlwaysEdible().build();
    public static final Food DIAMOND_CARROT = (new Food.Builder()).hunger(10).saturation(5f).build();
}
