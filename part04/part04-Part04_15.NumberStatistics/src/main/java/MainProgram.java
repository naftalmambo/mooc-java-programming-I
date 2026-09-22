
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // you can write test code here

        Statistics total = new Statistics();
        Statistics sumEven = new Statistics();
        Statistics sumOdd = new Statistics();

        System.out.println("Enter numbers: ");

        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;

            } else if (input % 2 == 0) {
                sumEven.addNumber(input);

            } else {
                sumOdd.addNumber(input);

            }
            total.addNumber(input);

        }

        System.out.println("Sum: " + total.sum());
        System.out.println("Sum of even numbers: " + sumEven.sum());
        System.out.println("Sum of odd numbers: " + sumOdd.sum());

    }
}
