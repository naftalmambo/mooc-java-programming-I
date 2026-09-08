
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int oldest = 0;

        while (true) {

            String text = scanner.nextLine();
            if (text.isEmpty()) {
                break;

            }
            String[] pieces = text.split(",");

            int currentAge = Integer.valueOf(pieces[1]);
            if (currentAge > oldest) {

                oldest = currentAge;

            }

        }
        System.out.println("Age of the oldest: " + oldest);

    }
}
