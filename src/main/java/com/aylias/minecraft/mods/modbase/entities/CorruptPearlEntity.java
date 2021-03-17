package com.aylias.minecraft.mods.modbase.entities;

import com.aylias.minecraft.mods.modbase.util.CorruptPearlReboundEvents;
import com.aylias.minecraft.mods.modbase.util.EntityRegisters;
import net.minecraft.client.renderer.ItemModelMesher;
import net.minecraft.client.renderer.entity.ArrowRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.item.EnderPearlEntity;
import net.minecraft.util.math.EntityRayTraceResult;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;

public class CorruptPearlEntity extends EnderPearlEntity {


    CorruptPearlReboundEvents.Rebounder toActivate;

    public CorruptPearlEntity(World worldIn, LivingEntity throwerIn) {
        super(worldIn, throwerIn);
        CorruptPearlReboundEvents.addRebounder(throwerIn);
        toActivate = CorruptPearlReboundEvents.toRebound.get(CorruptPearlReboundEvents.toRebound.size() - 1);
    }

    public CorruptPearlEntity(World worldIn, double x, double y, double z) {
        super(worldIn, x, y, z);
    }

    public CorruptPearlEntity(EntityType<? extends EnderPearlEntity> p_i50153_1_, World p_i50153_2_) {
        super(p_i50153_1_, p_i50153_2_);
    }

    @Override
    protected void onImpact(RayTraceResult result) {
        toActivate.activate();
        super.onImpact(result);
    }
}
