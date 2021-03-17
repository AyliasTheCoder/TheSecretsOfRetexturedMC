package com.aylias.minecraft.mods.modbase.util;

import com.aylias.minecraft.mods.modbase.ModBase;
import com.aylias.minecraft.mods.modbase.entities.CorruptPearlEntity;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class EntityRegisters {

    public static EntityType<CorruptPearlEntity> CORRUPT_PEARL = EntityType.Builder.<CorruptPearlEntity>create(CorruptPearlEntity::new, EntityClassification.MISC).size(0.25F, 0.25F).func_233606_a_(4).func_233608_b_(10).build(ModBase.MODID + ":corrupt_pearl");

    @SubscribeEvent
    public static void registerEntities(final RegistryEvent.Register<EntityType<?>> e) {
        e.getRegistry().registerAll(
            CORRUPT_PEARL.setRegistryName(ModBase.MODID, "corrupt_pearl")
        );
    }

}
