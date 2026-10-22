import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private BirdDatabase database;

    public UserInterface(Scanner scanner) {
        this.scanner = scanner;
        this.database = new BirdDatabase();
    }

    public void start() {
        while (true) {
            System.out.print("? ");
            String command = scanner.nextLine().trim();

            if (command.equalsIgnoreCase("Quit")) {
                break;
            }

            processCommand(command);
        }
    }

    private void processCommand(String command) {
        if (command.equalsIgnoreCase("Add")) {
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Name in Latin: ");
            String latinName = scanner.nextLine();
            database.addBird(name, latinName);

        } else if (command.equalsIgnoreCase("Observation")) {
            System.out.print("Bird? ");
            String name = scanner.nextLine();
            boolean success = database.addObservation(name);
            if (!success) {
                System.out.println("Not a bird!");
            }

        } else if (command.equalsIgnoreCase("All")) {
            database.printAll();

        } else if (command.equalsIgnoreCase("One")) {
            System.out.print("Bird? ");
            String name = scanner.nextLine();
            database.printOne(name);
        }
    }
}
