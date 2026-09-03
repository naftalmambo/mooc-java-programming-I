
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double average = 0;
        int number = 0;
        int sum = 0;
        int count = 0;

        while (true) {

            System.out.println("Give a number:");
            number = Integer.valueOf(scanner.nextLine());

            if (number == 0) {
                break;

            } else {
                sum = sum + number;
                count = count + 1;
                average = (double) sum / count;

            }

        }

        System.out.println("Average of the numbers: " + average);

    }
}
