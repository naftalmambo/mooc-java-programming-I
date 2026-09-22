
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        System.out.print("File? ");
        String file = scanner.nextLine();

        try (Scanner reader = new Scanner(Paths.get(file))) {
            while (reader.hasNextLine()) {
                list.add(Integer.valueOf(reader.nextLine()));

            }

        } catch (Exception e) {
            System.out.println("Reading the file " + file + " failed.");

        }

        int count = 0;

        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());

        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());

        for (int number : list) {
            if (number >= lowerBound && number <= upperBound) {
                count++;

            }

        }

        System.out.println("Numbers: " + count);

    }

}
