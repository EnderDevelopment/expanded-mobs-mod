package com.smballard092.expandedmobsmod.entity;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.monster.Spider;
import net.minecraft.world.level.Level;

public
class JumpingSpider extends Spider {
    public JumpingSpider(EntityType<? extends Spider> entityType, Level level) {
        super(entityType, level);
    }

    @Override
    public void tick() {
        super.tick();
        // Custom behavior for Jumping Spider
    }
}
