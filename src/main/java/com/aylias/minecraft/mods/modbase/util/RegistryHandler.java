package com.aylias.minecraft.mods.modbase.util;

import com.aylias.minecraft.mods.modbase.ModBase;
import com.aylias.minecraft.mods.modbase.blocks.BasicBlock;
import com.aylias.minecraft.mods.modbase.blocks.BlockItemBase;
import com.aylias.minecraft.mods.modbase.blocks.BlueSlimeBlock;
import com.aylias.minecraft.mods.modbase.items.*;
import net.minecraft.advancements.criterion.UsedTotemTrigger;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
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
    public static final RegistryObject<Item> DIAMOND_APPLE = ITEMS.register("diamond_apple", DiamondApple::new);
    public static final RegistryObject<Item> DIAMOND_CARROT = ITEMS.register("diamond_carrot", DiamondCarrot::new);
    public static final RegistryObject<Item> TOTEM_OF_DYING = ITEMS.register("totem_of_dying", ItemBase::new);
    public static final RegistryObject<Item> INFINITE_WATER_BUCKET = ITEMS.register("infinite_water_bucket", InfiniteWaterBucket::new);

    // Blocks
    public static final RegistryObject<Block> BLUE_SLIME_BLOCK = BLOCKS.register("blue_slime_block", () -> new BlueSlimeBlock());

    // Block Items
    public static final RegistryObject<Item> BLUE_SLIME_BLOCK_ITEM = ITEMS.register("blue_slime_block", () -> new BlockItemBase(BLUE_SLIME_BLOCK.get()));

}
