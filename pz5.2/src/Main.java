import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    public static void main(String[] args) {

        int a, b;

        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество строк массива: ");
        a = in.nextInt();

        System.out.print("Введите количество столбцов массива: ");
        b = in.nextInt();


        int[][] arr = new int[a][b];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print("Введите элемент arr[" + i + "][" + j + "]:");
                arr[i][j] = in.nextInt();
            }
        }
        System.out.println(Arrays.deepToString(arr));

        AtomicInteger sum = new AtomicInteger();
        for (int[] ints : arr) {
            for (int anInt : ints) {
                sum.addAndGet(anInt);
            }
        }
        System.out.println("Сумма всех элементов двумерного массива = " + sum);
    }
}