package com.aylias.minecraft.mods.modbase.items;

import com.aylias.minecraft.mods.modbase.ModBase;
import net.minecraft.item.Item;

public class ItemBase extends Item {
    public ItemBase() {
        super(new Item.Properties().group(ModBase.TAB));
    }
}
