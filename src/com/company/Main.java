package com.company;

public class Main {
    static Boss boss = new Boss();

    public static void main(String[] args) {
        boss.setHeals(300);
        boss.setDamage(30);
        boss.setWeapon("Sword", "Katana");
        printInfo();
    }

    public static void printInfo() {
        System.out.println("Boss heals: " + boss.getHeals() + "\n" +
                        "Boss Damage: " + boss.getDamage() + "\n" +
                        "Boss weapon: " + boss.getWeapon());

    }
}