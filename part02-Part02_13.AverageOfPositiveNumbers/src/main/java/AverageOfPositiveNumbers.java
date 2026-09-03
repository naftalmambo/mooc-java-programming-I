import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double average = 0;
        int number = 0;
        int sumOfPositives = 0;
        int count = 0;

        while (true) {
            System.out.println("Give a number:");
            number = Integer.valueOf(scanner.nextLine());

            if (number == 0) {
                break;
            // Fixed: Negative numbers are ignored, skipping the rest of the loop block
            } else if (number < 0) {
                continue; 
            } else {
                sumOfPositives = sumOfPositives + number;
                count = count + 1;
            }
        }

        // Fixed: Check at the end if any positive numbers were actually counted
        if (count == 0) {
            System.out.println("Cannot calculate the average");
        } else {
            average = (double) sumOfPositives / count;
            System.out.println(average);
        }
    }
}
