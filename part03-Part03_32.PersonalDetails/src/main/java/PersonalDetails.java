
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int name = 0;
        String longestName = "";
        int sum = 0;
        int count = 0;

        while (true) {

            String text = scanner.nextLine();
            if (text.isEmpty()) {
                break;

            }
            String[] pieces = text.split(",");

            int lengthOfName = pieces[0].length();
            String currentName = pieces[0];

            if (lengthOfName > name) {

                name = lengthOfName;
                longestName = currentName;

            }

            sum = sum + Integer.valueOf(pieces[1]);
            count = count + 1;
            if (count > 0) {

            }

        }
        Double averageBirthYears = 1.0 * sum / count;

        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + averageBirthYears);

    }
}
