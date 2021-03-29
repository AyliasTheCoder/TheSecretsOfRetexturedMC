package com.aylias.minecraft.mods.modbase.client.renders;

import com.aylias.minecraft.mods.modbase.ModBase;
import com.aylias.minecraft.mods.modbase.entities.CorruptPearlEntity;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.ItemRenderer;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.SpriteRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.fml.client.registry.IRenderFactory;

@OnlyIn(Dist.CLIENT)
public class CorruptPearlRenderer extends SpriteRenderer<CorruptPearlEntity> {


    public CorruptPearlRenderer(EntityRendererManager renderManagerIn, ItemRenderer itemRendererIn) {
        super(renderManagerIn, itemRendererIn);
    }

    /*
    @Override
    public ResourceLocation getTheEntityTexture(Entity entity) {
        return new ResourceLocation(ModBase.MODID, "textures/item/corrupt_pearl.png");
    }
    */




    public static class RenderFactory implements IRenderFactory<CorruptPearlEntity> {

        @Override
        public EntityRenderer<? super CorruptPearlEntity> createRenderFor(EntityRendererManager manager) {
            manager.setRenderShadow(false);
            return new CorruptPearlRenderer(manager, Minecraft.getInstance().getItemRenderer());
        }
    }
}
