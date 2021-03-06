package com.operatorsInfo.springR6S.loadout;

public class PrimaryWeapon implements Weapon{
    private String name;
    private String type;

    public PrimaryWeapon(String name, String type) {
        this.name = name;
        this.type = type;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public String getName() {
        return name;
    }
}
