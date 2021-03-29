package com.aylias.minecraft.mods.modbase.util;

import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.stats.Stats;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber
public class TotemEvents {

    @SubscribeEvent
    public static void playerDamage(LivingHurtEvent e) {
        if (e.getEntityLiving() instanceof ServerPlayerEntity) {
            System.out.println("I AM A SERVER PLAYER");
            ServerPlayerEntity serverplayerentity = (ServerPlayerEntity)e.getEntityLiving();
            serverplayerentity.addStat(Stats.ITEM_USED.get(RegistryHandler.TOTEM_OF_DYING.get()));
            CriteriaTriggers.USED_TOTEM.trigger(serverplayerentity, new ItemStack(RegistryHandler.TOTEM_OF_DYING.get(), 1));
        }
    }
}
