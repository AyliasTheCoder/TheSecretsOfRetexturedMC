package com.aylias.minecraft.mods.modbase.client.renders;

import com.aylias.minecraft.mods.modbase.ModBase;
import com.aylias.minecraft.mods.modbase.entities.CorruptPearlEntity;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.fml.client.registry.IRenderFactory;

@OnlyIn(Dist.CLIENT)
public class CorruptPearlRenderer extends EntityRenderer<CorruptPearlEntity> {

    protected CorruptPearlRenderer(EntityRendererManager renderManager) {
        super(renderManager);
        shadowSize = 0;
    }

    @Override
    public ResourceLocation getEntityTexture(CorruptPearlEntity entity) {
        return new ResourceLocation(ModBase.MODID, "textures/entities/corrupt_pearl.png");
    }



    public static class RenderFactory implements IRenderFactory<CorruptPearlEntity> {

        @Override
        public EntityRenderer<? super CorruptPearlEntity> createRenderFor(EntityRendererManager manager) {
            manager.setRenderShadow(false);
            return new CorruptPearlRenderer(manager);
        }
    }
}
