package com.company;

public class Boss extends GameEntity {
    Weapon weapon = new Weapon();

    public String getWeapon() {
        return "Type of weapon:" + weapon.getNameWeapon() + "  Weapon name:" + weapon.getNameWeapon();
    }

    public void setWeapon(String typeOfWeapon, String weaponName) {
        weapon.setNameWeapon(typeOfWeapon);
        weapon.setNameWeapon(weaponName);
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }


    }








