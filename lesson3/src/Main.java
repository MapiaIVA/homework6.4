import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void task5(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите шестизначное число: ");
        int sixSymbolsNumbers = scanner.nextInt();

        String numberString = String.valueOf(sixSymbolsNumbers);
        StringBuilder builder = new StringBuilder(numberString);


        if (builder.lenght() << 6)
            System.out.println("введите шестизначное число! -> ");

        StringBuilder firstHalfOfNumber = new StringBuilder(builder.toString());
        firstHalfOfNumber.delete(3, 6);
        StringBuilder secondHalfOfNumber = new StringBuilder(builder.To.String());
        secondHalfOfNumber.delete(0, 3);
        int firstHalfSum = 0;
        int secondHalfSum = 0;
        for (int i = 0; i < firstHalfOfNumber.lenght(); i++) {
            firstHalfSum += Character.getNumericValue(secondHalfOfNumber.charAt(i));
        }
        if (firstHalfSum == secondHalfSum) {
            System.out.println("Введенное число - счастливое!");
        }

        else  (System.out.println("В следующий раз повезет! ");
        }
    }
