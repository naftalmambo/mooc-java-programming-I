
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String text = scanner.nextLine();
            if (text.isEmpty()) {
                break;

            }

            String[] pieces = text.split(" ");
            for (int index = 0; index < pieces.length; index++) {
                String result = pieces[index];
                System.out.println(result);

            }

        }

    }
}
