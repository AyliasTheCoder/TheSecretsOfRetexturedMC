package com.aylias.minecraft.mods.modbase;

import com.aylias.minecraft.mods.modbase.client.renders.RenderRegistry;
import com.aylias.minecraft.mods.modbase.util.RegistryHandler;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(ModBase.MODID)
public class ModBase
{
    public static final String MODID = "tso_retexturedmc";
    private static final Logger LOGGER = LogManager.getLogger();

    public ModBase() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);

        RegistryHandler.init();

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {}

    private void doClientStuff(final FMLClientSetupEvent event) {
        RenderRegistry.registerEntityRenders();

        RenderType translucent = RenderType.getTranslucent();

        RenderTypeLookup.setRenderLayer(RegistryHandler.BLUE_SLIME_BLOCK.get(), translucent);
    }

    public static final ItemGroup TAB = new ItemGroup("TSO RetexturedMC") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(RegistryHandler.CORRUPT_PEARL.get());
        }
    };
}
