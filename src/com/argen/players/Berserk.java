package com.argen.players;

public class Berserk extends Hero {

    private int revert;
    public Berserk(int health, int damage, String name, EnumSuperAbility revertDamage, int revert) {
        super(health, damage, name);
        this.revert = revert;
    }

    @Override
    public void applyAbilityType(Boss boss, Hero[] heroes) {
        for (int i = 0; i < heroes.length; i++) {
            if (this != heroes[i] && heroes[i].getHealth() > 0) {
                boss.setHealth(boss.getHealth() - revert);


            }
        }
    }
}