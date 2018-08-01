package com.example.tasks.task1;

/**
 * Created by anastasiia_911 on 8/1/18.
 */
public class Main {
    public static void main(String[] args) {
        Player player = new Player("Ninja");
        player.action(Weapon.KNIFE);
        player.action(Weapon.REVOLVER);
        player.action(Weapon.PLASMAGUN);
    }
}
