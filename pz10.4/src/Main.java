import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер элемента для поиска: ");
        String valueToFind = scanner.nextLine();
        int[] values = {1, 17, 2, 3, 4, 10, 7, 8, 9, 5};
        System.out.printf("Index = %d%n", binarySearch(values, Integer.parseInt(valueToFind), 0, values.length - 1));
    }
    private static int binarySearch(int[] sortedArray, int valueToFind, int low, int high) {
        int index = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (sortedArray[mid] < valueToFind) {
                low = mid + 1;
            } else if (sortedArray[mid] > valueToFind) {
                high = mid - 1;
            } else if (sortedArray[mid] == valueToFind) {
                index = mid;
                break;
            }
        }
        return index;
    }

}