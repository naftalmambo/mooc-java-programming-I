
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    public String toString() {
        int itemsNo = this.elements.size();
        String output = "The collection " + this.name + " has " + itemsNo + " elements:\n";

        if (this.elements.isEmpty()) {
            return "The collection " + this.name + " is empty.";
        }

        if (itemsNo == 1) {
            output = "The collection " + this.name + " has " + itemsNo + " element:\n";
            return output + this.elements.get(0);
        }

        String items = "";
        for (String item : elements) {
            items = items + item + "\n";
        }

        return output + items;

    }
}