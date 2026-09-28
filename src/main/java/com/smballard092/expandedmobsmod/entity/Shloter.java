package com.smballard092.expandedmobsmod.entity;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.animal.Cat;
import net.minecraft.world.level.Level;

public
class Shloter extends Cat {
    public Shloter(EntityType<? extends Cat> entityType, Level level) {
        super(entityType, level);
    }

    @Override
    public void tick() {
        super.tick();
        // Custom behavior for Shloter
    }
}
