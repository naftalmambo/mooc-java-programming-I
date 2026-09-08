
import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {

            String text = scanner.nextLine();
            if (text.isEmpty()) {
                break;

            }
            String[] pieces = text.split(" ");

            String result = pieces[0];

            System.out.println(result);

        }

    }
}
