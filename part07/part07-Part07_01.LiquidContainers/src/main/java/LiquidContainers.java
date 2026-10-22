
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int hold1 = 0;

        int hold2 = 0;
        int movingAmount = 0;
        int removeAmount = 0;

        System.out.println("First: " + hold1 + "/" + 100);
        System.out.println("Second: " + hold2 + "/" + 100);

        while (true) {

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);

            if (amount >= 0 && command.equals("add")) {
                hold1 = hold1 + amount;

                if (hold1 > 100) {
                    hold1 = 100;
                }

            }

            if (command.equals("move") && amount > 0) {

                if (amount > hold1) {
                    movingAmount = hold1;

                } else {
                    movingAmount = amount;

                }

                hold1 = hold1 - movingAmount;
                hold2 = hold2 + movingAmount;

                if (hold2 > 100) {
                    hold2 = 100;

                }

            }

            if (command.equals("remove") && amount > 0) {
                if (amount > hold2) {
                    removeAmount = hold2;

                } else {
                    removeAmount = amount;
                }

                hold2 = hold2 - removeAmount;

            }

            System.out.println("First: " + hold1 + "/" + 100);
            System.out.println("Second: " + hold2 + "/" + 100);

        }
    }

}
