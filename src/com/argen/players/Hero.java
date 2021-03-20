package com.argen.players;

public abstract class Hero extends GameEntity implements HavingSuperAbility {


    public Hero(int health, int damage, String name) {
        super(health, damage, name);
    }
}
