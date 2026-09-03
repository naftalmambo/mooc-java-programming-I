import java.util.ArrayList;
import java.util.Scanner;

public class PrintInRange {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;

            }

            numbers.add(input);

        }

        System.out.print("Enter lower limit: ");
        int lower = Integer.valueOf(scanner.nextLine());

        System.out.println("Enter upper limit: ");
        int upper = Integer.valueOf(scanner.nextLine());

        printNumbersInRange(numbers, lower, upper);

    }

    // 3. This method sits completely OUTSIDE the main method, but INSIDE the class
    public static void printNumbersInRange(ArrayList<Integer> numbers, int lowerLimit, int upperLimit) {
        // It has exactly ONE job: loop and filter based on inclusive limits
        for (int number : numbers) {
            if (number >= lowerLimit && number <= upperLimit) {
                System.out.println(number);
            }
        }
    }
}
