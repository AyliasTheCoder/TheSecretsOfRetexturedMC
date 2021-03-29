package com.aylias.minecraft.mods.modbase.items;

import com.aylias.minecraft.mods.modbase.ModBase;
import com.aylias.minecraft.mods.modbase.util.CustomFoods;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Rarity;
import net.minecraft.item.UseAction;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.world.World;

public class DiamondApple extends Item {

    public DiamondApple() {
        super(new Item.Properties().food(CustomFoods.DIAMOND_APPLE).group(ModBase.TAB).rarity(Rarity.EPIC));
    }

    @Override
    public UseAction getUseAction(ItemStack stack) {
        return UseAction.EAT;
    }



    @Override
    public ItemStack onItemUseFinish(ItemStack stack, World worldIn, LivingEntity entityLiving) {
        entityLiving.addPotionEffect(new EffectInstance(Effects.SPEED, 30*20, 2));
        entityLiving.addPotionEffect(new EffectInstance(Effects.JUMP_BOOST, 30*20, 2));
        entityLiving.addPotionEffect(new EffectInstance(Effects.DOLPHINS_GRACE, 30*20, 2));
        entityLiving.addPotionEffect(new EffectInstance(Effects.INVISIBILITY, 15*20, 0));
        entityLiving.addPotionEffect(new EffectInstance(Effects.FIRE_RESISTANCE, 60*20, 1));
        entityLiving.addPotionEffect(new EffectInstance(Effects.RESISTANCE, 60*20, 1));
        entityLiving.addPotionEffect(new EffectInstance(Effects.SATURATION, 10, 10, true, true));
        entityLiving.addPotionEffect(new EffectInstance(Effects.INSTANT_HEALTH, 10, 10, true, true));
        return super.onItemUseFinish(stack, worldIn, entityLiving);
    }
}
