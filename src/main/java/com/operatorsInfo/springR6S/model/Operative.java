package com.operatorsInfo.springR6S.model;

import com.operatorsInfo.springR6S.Countries;
import com.operatorsInfo.springR6S.Sides;
import com.operatorsInfo.springR6S.model.Weapon;

import javax.persistence.*;
import java.util.Arrays;

@Entity
@Table(name = "operatives")
public class Operative {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private int armor;
    private int speed;
    private int difficulty;

    private String name;
    private String description;

    @Enumerated(EnumType.STRING)
    private Countries country;

    @Enumerated(EnumType.STRING)
    private Sides side;

    @OneToOne (optional=false, cascade=CascadeType.ALL)
    @JoinColumn (insertable = false, updatable = false, name="weapon_id")
    private Weapon weapon;

    private byte[] photo;

    public Operative() {
    }

    public Operative(Long id, int armor, int speed, int difficulty, String name, String description, Countries country, Sides side, Weapon weapon, byte[] photo) {
        this.id = id;
        this.armor = armor;
        this.speed = speed;
        this.difficulty = difficulty;
        this.name = name;
        this.description = description;
        this.country = country;
        this.side = side;
        this.weapon = weapon;
        this.photo = photo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public byte[] getPhoto() {
        return photo;
    }

    public void setPhoto(byte[] photo) {
        this.photo = photo;
    }

    public int getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(int difficulty) {
        this.difficulty = difficulty;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Operative{" +
                "id=" + id +
                ", armor=" + armor +
                ", speed=" + speed +
                ", difficulty=" + difficulty +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", country=" + country +
                ", side=" + side +
                ", weapon=" + weapon +
                ", photo=" + Arrays.toString(photo) +
                '}';
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
