package Warriors;

import Protection.Protection;
import Weapons.Weapon;

import java.util.Random;

public abstract class Warrior<W extends Weapon, P extends Protection> {
    private String name;
    private int healthPoint;
    private W weapon;
    private P protection;

    public Warrior(String name, int healthPoint, W weapon, P protection) {
        this.name = name;
        this.healthPoint = healthPoint;
        this.weapon = weapon;
        this.protection = protection;
    }

    public String getName() {
        return name;
    }

    public int getHealthPoint() {
        return healthPoint;
    }

    public W getWeapon() {
        return weapon;
    }

    public P getProtection() {
        return protection;
    }
    public int hit() {
        Random random = new Random();
        int hitDamage = random.nextInt(0, weapon.damage() + 1);
        return hitDamage;
    }
    public void reduceHealth(int damage) {
        int pStrength = protection.strength();
        int bDamage = protection.blockDamage();
        if (pStrength > 0) {
            pStrength -=1;
            protection.strength();
        } else {
            bDamage -= damage;
            if (bDamage <= 0) {
                bDamage = 0;
            }
        }
        if (pStrength == 0 && bDamage == 0 ) {
            healthPoint -= damage;
            if (healthPoint < 0) {
                healthPoint = 0;
            }
        }

    }
    @Override
    public String toString() {
        return String.format("Name: %s, Weapon: %s, HP: %d, Protection: %s", name, weapon, healthPoint, protection);
    }
}
