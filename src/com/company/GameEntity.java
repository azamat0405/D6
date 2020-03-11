package com.company;

public class GameEntity {
    private int bossHealth = 400;// тут я правильно сделал или нет
    private int bossDamage = 30;

    private  int heroesHeals = 300;
    private int heroesDamage = 20;

    public int getBossHealth() {
        return bossHealth;
    }

    public void setBossHealth(int bossHealth) {
        this.bossHealth = bossHealth;
    }

    public int getBossDamage() {
        return bossDamage;
    }

    public void setBossDamage(int bossDamage) {
        this.bossDamage = bossDamage;
    }

    public int getHeroesHeals() {
        return heroesHeals;
    }

    public void setHeroesHeals(int heroesHeals) {
        this.heroesHeals = heroesHeals;
    }

    public int getHeroesDamage() {
        return heroesDamage;
    }

    public void setHeroesDamage(int heroesDamage) {
        this.heroesDamage = heroesDamage;
    }
}



