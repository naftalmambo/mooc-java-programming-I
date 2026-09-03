
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int oldest = 0;
        String nameOfOldest = "";

        while (true) {

            String text = scanner.nextLine();
            if (text.isEmpty()) {
                break;

            }
            String[] pieces = text.split(",");

            String currentName = pieces[0];

            int currentAge = Integer.valueOf(pieces[1]);
            if (currentAge > oldest) {

                oldest = currentAge;
                nameOfOldest = currentName;

            }

        }
        System.out.println("Name of the oldest: " + nameOfOldest);

    }
}
