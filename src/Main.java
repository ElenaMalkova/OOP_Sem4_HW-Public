import Protection.Shield.IronShield;
import Warriors.Infantryman;
import Warriors.Warrior;
import Weapons.Melee.Axe;

public class Main {
    public static void main(String[] args) {
        Team<Warrior> team1 = new Team<>();
        team1.add(new Infantryman("Jack", 300, new Axe(), new IronShield()));
        team1.add(new Infantryman("Олег", 200, new Axe(), new IronShield()));
        System.out.println(team1);

        Infantryman w1 = new Infantryman("W1", 300, new Axe(), new IronShield());
        Infantryman w2 = new Infantryman("W2", 300, new Axe(), new IronShield());

        Battle battle1 = new Battle(w1, w2);
        System.out.println("---fight---");
        battle1.fight();
    }
}