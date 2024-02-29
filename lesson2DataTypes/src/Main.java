import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int intValue = 10000;
        long longFromInt = intValue;

        double doubleVal = 3.14159;
        Double doubleObject = Double.valueOf(doubleVal);

        System.out.println(doubleObject);

        double doubleValue = (double) intValue;
        System.out.println(doubleValue);

        String doubleValButString = "3";
        double doubleFromString = Double.parseDouble(doubleValButString);
        int intFromString = Integer.parseInt(doubleValButString);
        System.out.println(doubleFromString);
        System.out.println(intFromString);

        Integer sum = new Integer(2) + new Integer(3);
        int sum = 2 + 3;
        System.out.println(sum);


            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите информацию:");
            String info = scanner.nextLine();
            System.out.println(info);


        StringBuilder sbAppend = new StringBuilder("Hello, ");
        sbAppend.append("world!");
         System.out.println(sbAppend);

        //reverse()-перевернуть строку
        //delete(х,у)- удалить символы между указанными индексами
        //deleteChar(х)-удаляет указанный символ
        // lenght()-возращает длину строки
        //toString()-преобразует StringBuilder в обычную строку


        }
    }
