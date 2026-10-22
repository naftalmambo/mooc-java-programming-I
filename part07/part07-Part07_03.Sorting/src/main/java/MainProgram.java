import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] numbers = { 8, 3, 7, 9, 1, 2, 4 };
        MainProgram.sort(numbers);
    }

    public static int smallest(int[] array) {
        int smallest = array[0];

        for (int number : array) {
            if (smallest > number) {
                smallest = number;

            }

        }

        return smallest;

    }

    public static int indexOfSmallest(int[] array) {
        int smallIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[smallIndex] > array[i]) {
                smallIndex = i;

            }

        }
        return smallIndex;

    }

    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int smallIndex = startIndex;

        for (int i = startIndex; i < table.length; i++) {

            if (table[smallIndex] > table[i]) {
                smallIndex = i;

            }

        }
        return smallIndex;

    }

    public static void swap(int[] array, int index1, int index2) {

        int holder = array[index1];
        array[index1] = array[index2];
        array[index2] = holder;

    }

    public static void sort(int[] array) {
        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            int smallIndex = indexOfSmallestFrom(array, i);
            swap(array, i, smallIndex);
            System.out.println(Arrays.toString(array));

        }

    }

}
