package com.argen.players;

import java.util.Random;

public class Warrior extends Hero{
public int [] randomNumbers = {2,3,4};
    public Warrior(int health, int damage, String name, EnumSuperAbility criticalDamage) {
        super(health, damage, name);
    }

    public int  chanceHero (){
        Random random = new Random();
        return random.nextInt(randomNumbers.length);


    }


    @Override
    public void applyAbilityType(Boss boss, Hero[] heroes) {
        for (int i = 0; i < heroes.length; i++) {
            if(this != heroes[i] && heroes[i].getHealth() > 0){
                this.setDamage(getDamage()  * chanceHero());
            }

        }

    }
}
