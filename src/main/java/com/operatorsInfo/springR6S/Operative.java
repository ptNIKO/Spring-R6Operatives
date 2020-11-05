package com.operatorsInfo.springR6S;

import com.operatorsInfo.springR6S.loadout.Weapon;

import java.awt.*;

public class Operative {
    private int id;
    private int armor;
    private int speed;
    private String name;
    private String description;
    private Countries country;
    private Sides side;
    private Weapon weapon;
    private Image photo;

    public Operative(int id, int armor, int speed, String name, String description, Countries country, Sides side, Weapon weapon, Image photo) {
        this.id = id;
        this.armor = armor;
        this.speed = speed;
        this.name = name;
        this.description = description;
        this.country = country;
        this.side = side;
        this.weapon = weapon;
        this.photo = photo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Countries getCountry() {
        return country;
    }

    public void setCountry(Countries country) {
        this.country = country;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public Sides getSide() {
        return side;
    }

    public void setSide(Sides side) {
        this.side = side;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
}
