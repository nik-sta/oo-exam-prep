/**
 * Created by nikol on 27.06.2016.
 */
public class StarResolver {
    public boolean isStar(Network network, Person person) {
        if (person.getKnownPersons().size() > 1_000) {
            return false;
        }

        int fans = 0;

        for (Person other: network.getPersons()) {
            if (other.getKnownPersons().contains(person)) {
                fans++;
            }
        }

        if (fans >= 100_000) {
            return true;
        }

        return false;
    }
}
