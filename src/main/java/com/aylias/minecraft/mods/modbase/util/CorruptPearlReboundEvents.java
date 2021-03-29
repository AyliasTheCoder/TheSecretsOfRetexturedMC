package com.aylias.minecraft.mods.modbase.util;

import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.World;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.ArrayList;
import java.util.List;

@Mod.EventBusSubscriber
public class CorruptPearlReboundEvents {

    public static List<Rebounder> toRebound = new ArrayList<>();

    @SubscribeEvent
    public static void worldTick(TickEvent.WorldTickEvent e) {
        toRebound.removeIf(Rebounder::tick);
    }

    public static void addRebounder(LivingEntity entityIn) {
        toRebound.add(new Rebounder(entityIn));
    }

    public static class Rebounder {
        int ticks;
        Entity entity;
        Vector3d pos;
        double x;
        double y;
        double z;
        World world;
        boolean active;

        public Rebounder(LivingEntity e) {
            ticks = 20*15*5;
            entity = e;
            pos = e.getPositionVec();
            x = pos.getX();
            y = pos.getY();
            z = pos.getZ();
            world = e.getEntityWorld();
            active = false;
        }

        public void activate() {
            active = true;
        }

        public boolean tick() {
            if (!active) return false;

            ticks--;

            if (ticks == 0) rebound();

            return ticks == 0;
        }

        public void rebound() {
            entity.setWorld(world);
            entity.teleportKeepLoaded(x, y, z);
            //entity.setLocationAndAngles(x, y, z, entity.rotationYaw, entity.rotationPitch);
        }
    }
}
