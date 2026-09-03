import java.util.Scanner;

public class Message {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write a message: ");
        
        // Read the string written by the user and store it in a variable
        String message = scanner.nextLine();
        
        // Print the string that was provided by the user
        System.out.println(message);
    }
}
