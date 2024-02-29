import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[][] array = new int[3][3];
        for (int i = 0; i < array.length; i++) {// проход по строкам
            for (int j = 0; j < array.length; j++) {// проход по строкам ячейкам
                array[i][j] = (int) (Math.random() * 10);
                System.out.print(array[i][j]);

                for (i = 0; i < array.length; i++) {
                    int min = array[i][0];
                    int max = array[i][0];

                    for (j = 0; j < array[0].length; j++) {
                        if (min > array[i][j]) {
                            min = array[i][j];
                        }
                        if (max < array[i][j]) {
                            max = array[i][j];
                        }
                    }
                    System.out.println(Arrays.deepToString(array));
                    System.out.print(" Максимальный элемент " + max + " Минимальный элемент " + min);
                }
            }
        }
    }
}