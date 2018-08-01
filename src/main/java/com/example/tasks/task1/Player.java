package com.example.tasks.task1;

import lombok.Value;

@Value
public class Player {
  private Weapon weapon;
  private String name;

  public void action() {
    if (this.weapon.getType() == "knife") {
      System.out.println("Perform knife attack");
    } else {
      if (this.weapon.getType() == "revolver") {
        System.out.println("Perform revolver attack");
      } else {
        if (this.weapon.getType() == "Plasma Gun") {
          System.out.println("Perform plasma gun attack");
        }
      }
    }
  }
}
