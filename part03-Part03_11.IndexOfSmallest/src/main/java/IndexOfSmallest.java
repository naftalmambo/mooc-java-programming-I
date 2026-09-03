import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        // Stage 1: Collect numbers until user enters 9999
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == 9999) {
                break;
            }
            list.add(input);
        }

        System.out.println("");

        // Stage 2: Find the smallest number in the list

        int smallest = list.get(0);
        for (int i = 0; i < list.size(); i++) {

            int number = list.get(i);
            if (smallest > number) {
                smallest = number;
            }

        }

        System.out.println("Smallest number: " + smallest);

        for (int i = 0; i < list.size(); i++) {
            if (smallest == list.get(i)) {
                System.out.println("Found at index: " + i);

            }

        }
    }
}