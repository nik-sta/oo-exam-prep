public class Main {

    public static void main(String[] args) {
        Network network = new Network();

        Person nikola = new Person("Nikola");
        Person sandra = new Person("Sandra");
        Person dragana = new Person("Dragana");
        Person jovana = new Person("Jovana");
        Person mile = new Person("Mile");
        Person biljana = new Person("Biljana");
        Person patrick = new Person("Patrick");
        Person max = new Person("Max");

        nikola.addFriend(sandra);
        nikola.addFriend(dragana);
        nikola.addFriend(jovana);
        nikola.addFriend(mile);
        nikola.addFriend(biljana);
        nikola.addFriend(patrick);

        sandra.addFriend(jovana);
        patrick.addFriend(nikola);
        patrick.addFriend(max);
        max.addFriend(patrick);

        network.addPerson(nikola);
        network.addPerson(sandra);
        network.addPerson(dragana);
        network.addPerson(jovana);
        network.addPerson(mile);
        network.addPerson(biljana);
        network.addPerson(patrick);
        network.addPerson(max);

        System.out.println(nikola.toString());
        System.out.println(patrick.toString());
        System.out.println(max.toString());
        System.out.println("Nikola is linked with Max: " + network.getKnowsResolver().isLinked(nikola,max));
    }
}
