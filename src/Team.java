import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import Warriors.Warrior;

public class Team<T extends Warrior> implements Iterable<T> {
    List<T> team = new ArrayList<>();

    public void add(T soldier) {
        team.add(soldier);
    }

    @Override
    public Iterator<T> iterator() {
        return team.iterator();
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (T t:this) {
            sb.append(t).append("\n");
        }
        return sb.toString();
    }
}