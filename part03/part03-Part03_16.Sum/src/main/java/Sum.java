
import java.util.ArrayList;
import java.util.Scanner;

public class Sum {

    public static void main(String[] args) {
        // Try your method here

        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;

            }

            numbers.add(input);

        }
        System.out.println("Sum: " + sum(numbers));

    }

    public static int sum(ArrayList<Integer> numbers) {

        int sum = 0;

        for (int number : numbers) {
            sum = sum + number;

        }
        return sum;

    }

}
