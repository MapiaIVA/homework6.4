import java.util.Arrays;
import java.util.Collections;

class ArraySort {
    public static void main(String[] args) {
        int[] arr = {5, 2, 1, 8, 10, 23, 7};
        Arrays.sort(arr);

        for (int values : arr) {
            System.out.print(values + ", ");

        }
        Integer[] arr1 = {2, 8, 6, 1, 11, 9, 8, 10};
        Arrays.sort(arr1, Collections.reverseOrder());

        for (int values : arr1) {
            System.out.print(values + ", ");

        }
    }
}