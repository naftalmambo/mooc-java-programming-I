import java.util.Scanner;

public class TextUI {

    private Scanner scanner;
    private SimpleDictionary dictionary;

    public TextUI(Scanner scanner, SimpleDictionary dictionary) {
        this.scanner = scanner;
        this.dictionary = dictionary;

    }

    public void start() {
        while (true) {

            System.out.print("Command: ");
            String comm = scanner.nextLine();

            if (comm.equals("end")) {
                System.out.println("Bye bye!");
                break;

            }

            if (comm.equals("add")) {
                System.out.print("Word: ");
                String word = scanner.nextLine();

                System.out.print("Translation: ");
                String translation = scanner.nextLine();

                this.dictionary.add(word, translation);

            }

            if (comm.equals("search")) {
                System.out.print("To be translated: ");
                String text = scanner.nextLine();

                String translation = this.dictionary.translate(text);
                if (translation == null) {
                    System.out.println("Word " + text + " was not found");

                } else {
                    System.out.println("Translation: " + translation);
                }

                continue;

            }

            System.out.println("Unkown command");

        }

    }

}
