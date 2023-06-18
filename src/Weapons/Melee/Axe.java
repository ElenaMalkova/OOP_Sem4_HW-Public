package Weapons.Melee;

public class Axe implements Melee{
    @Override
    public int damage() {
        return 80;
    }
    @Override
    public String toString() {
        return String.format("Axe Damage: %d", damage());
    }
}
