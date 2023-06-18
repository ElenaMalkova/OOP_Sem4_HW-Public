package Protection.Shield;

public class IronShield extends Shield{
    @Override
    public int strength() {
        return 6;
    }

    @Override
    public int blockDamage() {
        return 60;
    }
    @Override
    public String toString() {
        return String.format("Iron Shield Strength: %d, BlockDamage: %d", strength(), blockDamage());
    }
}
