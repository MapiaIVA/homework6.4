import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int n = 5; // Замените на нужное количество строк треугольника
        int[][] triangle = generateRandomTriangle(n);
        System.out.println("Исходный треугольник:");
        printTriangle(triangle);

        int maxSum = findMaxPathSum(triangle);
        System.out.println("Максимальная сумма чисел: " + maxSum);
    }

    public static int[][] generateRandomTriangle(int n) {
        Random random = new Random();
        int[][] triangle = new int[n][];
        for (int i = 0; i < n; i++) {
            triangle[i] = new int[i + 1];
            for (int j = 0; j <= i; j++) {
                triangle[i][j] = random.nextInt(100); // Генерация случайных чисел от 0 до 99
            }
        }
        return triangle;
    }

    public static void printTriangle(int[][] triangle) {
        for (int[] row : triangle) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    public static int findMaxPathSum(int[][] triangle) {
        int n = triangle.length;
        int[] maxSum = triangle[n - 1]; // Инициализация массива максимальных сумм
        for (int i = n - 2; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                maxSum[j] = triangle[i][j] + Math.max(maxSum[j], maxSum[j + 1]);
            }
        }
        return maxSum[0]; // Возвращаем максимальную сумму на вершине треугольника
    }
}