import java.util.ArrayList;
import java.util.Scanner;

public class OnlyTheseNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        // Phase 1: Data Entry Loop
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number == -1) {
                break;
            }
            numbers.add(number);
        }

        // Phase 2: Ask for boundaries EXACTLY ONCE (Outside the loop)
        System.out.print("From where? ");
        int start = Integer.valueOf(scanner.nextLine());

        System.out.print("To where? ");
        int end = Integer.valueOf(scanner.nextLine());

        // Phase 3: Targeted Printing Engine
        // Set your pointer finger to start directly at the user's 'start' position!
        int index = start;

        // Loop runs as long as your finger is less than or equal to the 'end' position
        while (index <= end) {
            int output = numbers.get(index);
            System.out.println(output);

            index++; // Push pointer finger forward
        }
    }
}
