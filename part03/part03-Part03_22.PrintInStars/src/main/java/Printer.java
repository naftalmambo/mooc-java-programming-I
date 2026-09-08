public class Printer {

    public static void main(String[] args) {
        // You can test the method here
        int[] array = { 5, 1, 3, 4, 2 };
        printArrayInStars(array);
    }

    public static void printArrayInStars(int[] array) {
        int index = 0;

        // Outer loop: Iterates through each index of the array
        while (index < array.length) {
            int numberOfStars = array[index]; // The value tells us how many stars to print

            // Inner loop: Prints the exact number of stars for the current row
            int starCounter = 0;
            while (starCounter < numberOfStars) {
                System.out.print("*");
                starCounter++;
            }

            // Move to a new line after finishing the current row of stars
            System.out.println("");

            index++;
        }
    }
}
