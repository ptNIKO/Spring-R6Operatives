package com.operatorsInfo.springR6S.model;

import javax.persistence.*;

@Entity
@Table(name = "weapons")
public class Weapon {

    @OneToOne(cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private Operative operative;

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String primaryWeapon;
    private String secondaryWeapon;
    private String gadget;

    public Weapon() {
    }

    public Operative getOperative() {
        return operative;
    }

    public void setOperative(Operative operative) {
        this.operative = operative;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPrimaryWeapon() {
        return primaryWeapon;
    }

    public void setPrimaryWeapon(String primaryWeapon) {
        this.primaryWeapon = primaryWeapon;
    }

    public String getSecondaryWeapon() {
        return secondaryWeapon;
    }

    public void setSecondaryWeapon(String secondaryWeapon) {
        this.secondaryWeapon = secondaryWeapon;
    }

    public String getGadget() {
        return gadget;
    }

    public void setGadget(String gadget) {
        this.gadget = gadget;
    }

    @Override
    public String toString() {
        return "Weapon{" +
                "operative=" + operative +
                ", id=" + id +
                ", primaryWeapon='" + primaryWeapon + '\'' +
                ", secondaryWeapon='" + secondaryWeapon + '\'' +
                ", gadget='" + gadget + '\'' +
                '}';
    }
}
