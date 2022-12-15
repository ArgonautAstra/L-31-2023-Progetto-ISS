package it.unipa.iss.rpg.screen.model.entitities;

import it.unipa.iss.rpg.combat.model.Statistics;

public class Mob implements Entity{
    private MobSprite mobSprite;
    private Statistics stats;

    public Mob(Statistics stas) {
        this.stats = stas;
    }

    public Statistics getStats() {
        return new Statistics(stats.getMaxHp(), stats.getDef(), stats.getStamina(), stats.getAtk());
    }
}
