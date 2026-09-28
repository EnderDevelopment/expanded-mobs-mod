package com.smballard092.expandedmobsmod.entity;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.monster.Creeper;
import net.minecraft.world.level.Level;

public
class Flowper extends Creeper {
    public Flowper(EntityType<? extends Creeper> entityType, Level level) {
        super(entityType, level);
    }

    @Override
    public void tick() {
        super.tick();
        // Custom behavior for Flowper
    }
}
