import java.util.HashSet;

/**
 * Created by nikol on 27.06.2016.
 */
public class Person {
    private String name;
    private HashSet<Person> knownPersons;

    public Person(String name) {
        setName(name);
        knownPersons = new HashSet<>();
    }

    public HashSet<Person> getKnownPersons() {
        return knownPersons;
    }

    public void addFriend(Person friend) {
        knownPersons.add(friend);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
         this.name = name;
    }

    @Override
    public String toString() {
        String value = getName() + " knows: ";

        for (Person person : knownPersons) {
            value += "{" + person.getName() + "} ";
        }

        return value;
    }
}
