package com.example.tasks.task1;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Player {
    private String name;

    public Player(String playerName){
        this.name= playerName;
    }

    public void action(Weapon weaponType) {
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
