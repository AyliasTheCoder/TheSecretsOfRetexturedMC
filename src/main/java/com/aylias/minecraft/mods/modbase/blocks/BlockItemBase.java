package com.aylias.minecraft.mods.modbase.blocks;

import com.aylias.minecraft.mods.modbase.ModBase;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;

public class BlockItemBase extends BlockItem {


    public BlockItemBase(Block block) {
        super(block, new Properties().group(ModBase.TAB));
    }
}
