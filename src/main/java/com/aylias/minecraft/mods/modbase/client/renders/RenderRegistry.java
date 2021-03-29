package com.aylias.minecraft.mods.modbase.client.renders;

import com.aylias.minecraft.mods.modbase.entities.CorruptPearlEntity;
import com.aylias.minecraft.mods.modbase.util.EntityRegisters;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.client.model.ModelLoaderRegistry;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

@OnlyIn(Dist.CLIENT)
public class RenderRegistry {

    public static void registerEntityRenders() {
        // RenderingRegistry.registerEntityRenderingHandler(EntityRegisters.CORRUPT_PEARL, new CorruptPearlRenderer.RenderFactory());
    }
}
