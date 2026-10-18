import java.util.Scanner;

public class UserInterface {
    private TodoList todo;
    private Scanner scanner;

    public UserInterface(TodoList todo, Scanner scanner) {
        this.todo = todo;
        this.scanner = scanner;

    }

    public void start() {

        while (true) {
            System.out.print("Command: ");
            String comm = scanner.nextLine();

            if (comm.equals("stop")) {
                break;

            }

            if (comm.equals("add")) {
                System.out.print("To add: ");
                String task = scanner.nextLine();
                this.todo.add(task);

            }

            if (comm.equals("list")) {
                this.todo.print();

            }

            if (comm.equals("remove")) {
                System.out.print("Which one is removed? ");
                int num = Integer.valueOf(scanner.nextLine());
                this.todo.remove(num);

            }

        }

    }

}
