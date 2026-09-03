
public class AdvancedAstrology {

    public static void printStars(int number) {

        int i = 0;
        while (i < number) {
            System.out.print("*");
            i++;

        }

        System.out.println("");

    }

    public static void printSpaces(int number) {
        int i = 0;

        while (i < number) {
            System.out.print(" ");
            i++;

        }

    }

    public static void printTriangle(int size) {

        int row = 1;

        while (row <= size) {
            printSpaces(size - row);
            printStars(row);

            System.out.println("");

            row++;

        }
    }

    public static void christmasTree(int height) {
        int row = 1;

        while (row <= height) {
            printSpaces(height - row);
            printStars(2 * row - 1);
            row++;

        }

        int baseRow = 1;
        while (baseRow <= 2) {
            printSpaces(height - 2);
            printStars(3);
            baseRow++;

        }

    }

    // part 1 of the exercise

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(4);
        christmasTree(4);
        christmasTree(10);
    }
}
