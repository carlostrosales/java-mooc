
import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        MainProgram.sort(numbers);
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length;i++) {
            System.out.println(Arrays.toString(array));
            int smallest = indexOfSmallestFrom(array, i);
            swap(array,i, smallest);
        }
    }

    public static int smallest(int[] array) {
        int min = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }

        return min;
    }

    public static int indexOfSmallest(int[] array) {
        int min = 0;
        int smallest = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] <= smallest) {
                smallest = array[i];
                min = i;
            }
        }

        return min;
    }

    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int min = table[startIndex];
        int smallest = 0;

        for (int i = startIndex; i < table.length; i++) {
            if (table[i] <= min) {
                min = table[i];
                smallest = i;
            }
        }

        return smallest;
    }

    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}
