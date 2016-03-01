import java.util.*;

public class SelectionSort {
    public static void main (String[] args) {
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        System.out.println(Arrays.toString(array));
        
        // Sort the array
        // Your code here...

        for (int i = 1; i < array.length-1; i++) {
            if( array[i] > array[i+1] ) {
                int temp = array[i];
                array[i] = array[i+1];
                array[i+1] = temp;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}