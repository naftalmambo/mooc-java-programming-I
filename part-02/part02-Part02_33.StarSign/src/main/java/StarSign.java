
public class StarSign {

    public static void main(String[] args) {

        // The tests are not checking the main, so you can modify it freely.
        // NB: If the tests don't seem to pass, you should try the methods here
        // in the main to make sure they print the correct shapes!

        printStars(5);
        printStars(3);
        printStars(9);

        printSquare(4);

        printRectangle(17, 3);

        printTriangle(4);
    }

    public static void printStars(int number) {

        int i = 1;

        while (i <= number) {
            System.out.print("*");
            i++;
        }
        System.out.println("");

    }

    public static void printSquare(int size) {
        int row = 1;
        while (row <= size) {
            printStars(size);
            row++;

        }

    }

    public static void printRectangle(int width, int height) {

        int row = 1;
        while (row <= height) {
            printStars(width);
            row++;

        }

    }

    public static void printTriangle(int size) {

        int row = 1;

        while (row <= size) {
            printStars(row);
            row++;

        }

    }

}
