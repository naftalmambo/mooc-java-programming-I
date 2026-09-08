import java.util.ArrayList;
import java.util.Scanner;

public class RememberTheseNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        // Phase 1: Data Entry Loop
        while (true) {
            int luku = Integer.valueOf(scanner.nextLine());
            if (luku == -1) {
                break;
            }
            numbers.add(luku);
        }

        // Phase 2: Manual While Loop Printing Engine
        int index = 0;
        while (index < numbers.size()) {
            int output = numbers.get(index);

            System.out.println(output);
            index++;
        }
    }
}
