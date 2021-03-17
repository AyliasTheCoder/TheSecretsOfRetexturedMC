package com.aylias.minecraft.mods.modbase.util;

import com.aylias.minecraft.mods.modbase.ModBase;
import com.aylias.minecraft.mods.modbase.blocks.BasicBlock;
import com.aylias.minecraft.mods.modbase.blocks.BlockItemBase;
import com.aylias.minecraft.mods.modbase.items.CorruptPearlItem;
import com.aylias.minecraft.mods.modbase.items.ItemBase;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ModBase.MODID);
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, ModBase.MODID);

    public static void init() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    // Items
    public static final RegistryObject<Item> CORRUPT_PEARL = ITEMS.register("corrupt_pearl", CorruptPearlItem::new);

    // Blocks
    //public static final RegistryObject<Block> EXAMPLEBLOCK = BLOCKS.register("exampleblock_id", () -> new BasicBlock(Material.ANVIL, 1.0f, 1.0f, SoundType.METAL, 1, ToolType.PICKAXE));

    // Block Items
    //public static final RegistryObject<Item> EXAMPLEBLOCK_ITEM = ITEMS.register("exampleblock_id", () -> new BlockItemBase(EXAMPLEBLOCK.get()));

}
