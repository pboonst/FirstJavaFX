import java.util.*;

public class BubbleSort
{
    public static void main (String[] args) {
        // int[] array = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        System.out.println("Before sorting: " + Arrays.toString(array));
        
        for (int pass = 0; pass < array.length - 1; pass++) {
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i+1]) {
                    // The two neighboring numbers are out of order, swap them
                    int temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                }
            }
        }
        System.out.println("After Sorting: " + Arrays.toString(array));
    }
}