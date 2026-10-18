import java.util.ArrayList;

public class Hold {
    private ArrayList<Suitcase> suitcases;
    private int maximumWeight;

    public Hold(int maximumWeight) {
        this.suitcases = new ArrayList<>();
        this.maximumWeight = maximumWeight;

    }

    public int finalWeight() {
        int sum = 0;
        for (Suitcase luggage : this.suitcases) {
            sum = sum + luggage.totalWeight();

        }
        return sum;
    }

    public void addSuitcase(Suitcase suitcase) {
        if (this.finalWeight() + suitcase.totalWeight() <= this.maximumWeight) {
            suitcases.add(suitcase);

        }
    }

    public void printItems() {
        for (Suitcase luggage : suitcases) {
            luggage.printItems();

        }
    }

    public String toString() {
        return this.suitcases.size() + " suitcases " + "(" + finalWeight() + " kg" + ")";

    }

}
