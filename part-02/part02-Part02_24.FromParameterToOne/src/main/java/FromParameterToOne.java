public class FromParameterToOne {

    public static void main(String[] args) {
        // Call your method with the number 5 to test it
        printFromNumberToOne(8);
    }

    // 1. ADDED "static" so the main method can call it directly
    public static void printFromNumberToOne(int number) {

        // 2. Loop runs continuously as long as the number is greater than or equal to 1
        while (number >= 1) {
            System.out.println(number); // Prints the current value
            number = number - 1;        // Decreases the number by 1 for the next loop
        }
    }
}
