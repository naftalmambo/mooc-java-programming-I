
import java.util.ArrayList;
import java.util.Scanner;

public class RemoveLast {

    public static void main(String[] args) {
        // Try your method in here

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> strings = new ArrayList<>();

        while (true) {
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                break;

            }

            strings.add(input);

        }

        System.out.println("Originals: " + strings);
        removeLast(strings);
        System.out.println("After removal: " + strings);

    }

    public static void removeLast(ArrayList<String> strings) {

        if (!strings.isEmpty()) {
            strings.remove(strings.size() - 1);

        }

    }

}
