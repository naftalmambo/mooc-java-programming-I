import java.util.ArrayList;

public class BirdDatabase {
    private ArrayList<Bird> birds;

    public BirdDatabase() {
        this.birds = new ArrayList<>();
    }

    public void addBird(String name, String latinName) {
        this.birds.add(new Bird(name, latinName));
    }

    public boolean addObservation(String name) {
        for (Bird bird : this.birds) {
            if (bird.getName().equalsIgnoreCase(name)) {
                bird.incrementObservations();
                return true;
            }
        }
        return false;
    }

    public void printAll() {
        for (Bird bird : this.birds) {
            System.out.println(bird);
        }
    }

    public void printOne(String name) {
        for (Bird bird : this.birds) {
            if (bird.getName().equalsIgnoreCase(name)) {
                System.out.println(bird);
                return;
            }
        }
    }
}
