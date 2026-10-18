import java.util.ArrayList;

public class Suitcase {
    private ArrayList<Item> items;
    private int maxWeight;

    public Suitcase(int maxWeight) {
        this.items = new ArrayList<>();
        this.maxWeight = maxWeight;

    }

    public int totalWeight() {
        int sum = 0;
        for (Item itm : items) {
            sum = sum + itm.getWeight();

        }
        return sum;

    }

    public void addItem(Item item) {

        if (totalWeight() + item.getWeight() <= maxWeight) {
            this.items.add(item);

        }

    }

    public void printItems() {
        for (Item itm : this.items) {
            System.out.println(itm);

        }

    }

    public Item heaviestItem() {

        if (this.items.isEmpty()) {
            return null;
        }
        Item heaviestItem = this.items.get(0);

        for (Item itm : this.items) {

            if (heaviestItem.getWeight() < itm.getWeight()) {
                heaviestItem = itm;

            }

        }

        return heaviestItem;

    }

    public String toString() {
        if (this.items.size() == 0) {
            return "no items (0 kg)";

        } else if (this.items.size() == 1) {
            return this.items.size() + " item " + "(" + totalWeight() + " kg" + ")";

        } else {
            return this.items.size() + " items " + "(" + totalWeight() + " kg" + ")";

        }

    }

}
