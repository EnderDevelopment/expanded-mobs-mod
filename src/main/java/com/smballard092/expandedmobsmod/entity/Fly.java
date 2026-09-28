package com.smballard092.expandedmobsmod.entity;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.animal.Bee;
import net.minecraft.world.level.Level;

public
class Fly extends Bee {
    public Fly(EntityType<? extends Bee> entityType, Level level) {
        super(entityType, level);
    }

    @Override
    public void tick() {
        super.tick();
        // Custom behavior for Fly
    }
}
