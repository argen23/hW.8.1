package com.argen.players;

import java.util.Random;

public class Magic extends Hero {

    public int[] randomNum = {1, 2, 4, 5, 8, 6, 9};

    public Magic(int health, int damage, String name, EnumSuperAbility boost) {
        super(health, damage, name);
    }

    public int chanceHero() {
        Random random = new Random();
        return random.nextInt(randomNum.length);
    }

    @Override
    public void applyAbilityType(Boss boss, Hero[] heroes) {

        for (int i = 0; i < heroes.length; i++) {
            if (this != heroes[i] && heroes[i].getHealth() > 0) {
                this.setDamage(getDamage() + chanceHero());

            }
        }
    }
}