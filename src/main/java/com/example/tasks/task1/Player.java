package com.example.tasks.task1;

import lombok.Value;

@Value
public class Player {
    private Weapon weaponType;
    private String name;

    public void action() {
        if (weaponType == Weapon.KNIFE) {
            System.out.println("Perform knife attack");
        } else {
            if (weaponType == Weapon.REVOLVER) {
                System.out.println("Perform revolver attack");
            } else {
                if (weaponType == Weapon.PLASMAGUN) {
                    System.out.println("Perform plasma gun attack");
                }
            }
        }
    }
}
