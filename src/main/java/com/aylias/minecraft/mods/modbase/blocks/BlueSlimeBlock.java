package com.aylias.minecraft.mods.modbase.blocks;

import net.minecraft.block.BlockState;
import net.minecraft.block.SlimeBlock;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.IBlockReader;

public class BlueSlimeBlock extends SlimeBlock {

    final double horizontalForce = 6;
    final double verticalForce = 1.2;

    public BlueSlimeBlock() {
        super(Properties.create(Material.CLAY).zeroHardnessAndResistance().notSolid());
    }

    @Override
    public void onLanded(IBlockReader worldIn, Entity entityIn) {
        if (entityIn.isSuppressingBounce()) {
            super.onLanded(worldIn, entityIn);
        } else {
            bounce(entityIn);
        }
    }

    private void bounce(Entity entityIn) {
        Vector3d vector3d = entityIn.getMotion();
        if (vector3d.y < 0.0D) {
            entityIn.setMotion(vector3d.x * horizontalForce, -vector3d.y * verticalForce, vector3d.z * horizontalForce);
        }
    }

    @Override
    public boolean isSlimeBlock(BlockState state) {
        return true;
    }

    @Override
    public boolean isStickyBlock(BlockState state) {
        return true;
    }
}
