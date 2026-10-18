import java.util.ArrayList;

public class TodoList {

    private ArrayList<String> list;

    public TodoList() {
        this.list = new ArrayList<>();
    }

    public void add(String task) {
        this.list.add(task);

    }

    public void print() {
        int count = 1;
        for (String task : this.list) {
            System.out.println(count + ": " + task);
            count++;

        }

    }

    public void remove(int number) {
        int index = number - 1;
        this.list.remove(index);

    }

}
