import java.util.Arrays;
import java.util.Scanner;

class ArraySort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите зарплату(построчно): ");
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr);

        for (int values : arr) {
            System.out.print(values + ", ");
        }
    }
}