package Warriors;

import Protection.Protection;
import Weapons.Weapon;

public class Infantryman extends Warrior{
    public Infantryman(String name, int healthPoint, Weapon weapon, Protection protection) {
        super(name, healthPoint, weapon, protection);
    }
    @Override
    public String toString() {
        return String.format("Infantryman: %s", super.toString());
    }
}
