package com.smballard092.expandedmobsmod.entity;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.animal.Parrot;
import net.minecraft.world.level.Level;

public
class Falcon extends Parrot {
    public Falcon(EntityType<? extends Parrot> entityType, Level level) {
        super(entityType, level);
    }

    @Override
    public void tick() {
        super.tick();
        // Custom behavior for Falcon
    }
}
