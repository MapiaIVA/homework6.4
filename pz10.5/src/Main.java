
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a, b;

        Scanner scan = new Scanner(System.in);
        System.out.print("Введите количество строк массива: ");
        a = scan.nextInt();

        System.out.print("Введите количество столбцов массива: ");
        b = scan.nextInt();


        int sum = 0;
        int[][] arr = new int[a][b];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print("Введите элемент arr[" + i + "][" + j + "]:");
                arr[i][j] = scan.nextInt();
                System.out.println(Arrays.deepToString(arr));


                sum += arr[i][j]; // Сумма всех элементов заданного массива


                System.out.printf("Сумма всех элементов равна: " + sum);
                System.out.printf(" Среднеарифметическое : " + (sum / 9));

            }
        }
    }
}







