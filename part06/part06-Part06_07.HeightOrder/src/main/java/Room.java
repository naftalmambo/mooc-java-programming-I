import java.util.ArrayList;

public class Room {
    private ArrayList<Person> persons;

    public Room() {
        this.persons = new ArrayList<>();
    }

    public void add(Person person) {
        this.persons.add(person);
    }

    public boolean isEmpty() {
        if (persons.isEmpty()) {
            return true;

        } else {
            return false;
        }

    }

    public ArrayList<Person> getPersons() {
        return persons;

    }

    public Person shortest() {
        if (this.persons.isEmpty()) {
            return null;

        }

        Person shorty = this.persons.get(0);

        for (Person mtu : this.persons) {

            if (shorty.getHeight() > mtu.getHeight()) {
                shorty = mtu;

            }

        }
        return shorty;

    }

    public Person take() {
        if (this.persons.isEmpty()) {
            return null;

        }

        Person shortestPerson = this.shortest();
        this.persons.remove(shortestPerson);
        return shortestPerson;

    }

}
