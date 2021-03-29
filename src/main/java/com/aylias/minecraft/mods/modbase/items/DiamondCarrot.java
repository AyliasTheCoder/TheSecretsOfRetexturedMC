package com.aylias.minecraft.mods.modbase.items;

import com.aylias.minecraft.mods.modbase.ModBase;
import com.aylias.minecraft.mods.modbase.util.CustomFoods;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.UseAction;

public class DiamondCarrot extends Item {

    public DiamondCarrot() {
        super(new Item.Properties().food(CustomFoods.DIAMOND_CARROT).group(ModBase.TAB));
    }

    @Override
    public UseAction getUseAction(ItemStack stack) {
        return UseAction.EAT;
    }
}
