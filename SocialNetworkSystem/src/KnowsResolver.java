import java.util.HashSet;

/**
 * Created by nikol on 27.06.2016.
 */
public class KnowsResolver {

    public boolean isLinked(Person one, Person two) {
        return isLinked(one, two, new HashSet<>());
    }

    private boolean isLinked(Person one, Person two, HashSet<Person> visited) {

        if (one == two) {
            return true;
        }

        if (visited.contains(one)) {
            return false;
        }

        visited.add(one);
        for (Person other : two.getKnownPersons()) {
            if (isLinked(other, two, visited)) {
                return true;
            }
        }

        return false;
    }

}
