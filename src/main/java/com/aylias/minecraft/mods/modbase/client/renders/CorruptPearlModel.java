package com.aylias.minecraft.mods.modbase.client.renders;

import com.aylias.minecraft.mods.modbase.entities.CorruptPearlEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class CorruptPearlModel extends EntityModel<CorruptPearlEntity> {
    private final ModelRenderer main;

    public CorruptPearlModel() {
        textureWidth = 128;
        textureHeight = 128;

        main = new ModelRenderer(this);
        main.setRotationPoint(0.0F, 24.0F, 0.0F);
        main.setTextureOffset(0, 15).addBox(-6.0F, -1.0F, -7.0F, 13.0F, 1.0F, 13.0F, 0.0F, false);
    }

    @Override
    public void setRotationAngles(CorruptPearlEntity entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
    }

    @Override
    public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
        main.render(matrixStack, buffer, packedLight, packedOverlay);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
