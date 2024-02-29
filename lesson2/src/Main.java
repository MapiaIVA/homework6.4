import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //System.out.println("Fall seven times ");
        // System.out.println("and ");
        //System.out.println("stand up eight");
        //int num = 1234, reversed = 0;

        //while (num != 0) {

        //int digt = num % 10;
        // reversed = reversed * 10 + digt;

        // num /= 10;
        // }

        // System.out.println("Reversed Number: " + reversed);


        {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите Время: ");
            int time = scanner.nextInt();
            int hour = 3;
            {
                if (hour >= 6 && hour < 13) ;
                {
                    System.out.println("GOOD MORNING");
                    String info = scanner.nextLine();
                    System.out.println(info);
                }
                if (hour >= 13 && hour < 17) ;
                {
                    System.out.println("GOOD d");
                    String info = scanner.nextLine();
                    System.out.println(info);
                }
                if (hour >= 17 && hour < 24) ;
                {
                    System.out.println("GOOD e");
                    String info = scanner.nextLine();
                    System.out.println(info);
                }
                if (hour >= 0 && hour < 6) ;
                {
                    System.out.println("GOOD n");
                    String info = scanner.nextLine();
                    System.out.println(info);
                }
            }
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите шестизначное число: ");
        int sixSymbolsNumber = scanner.nextInt();
        StringBuilder builder = new StringBuilder(String.copyValueOf(sixSymbolsNumber));
    }
    while (builder.lenght() < 6) {
        System.out.println("введите шестизначное число! -> ");
        sixSymbolsNumber = scanner.nextInt();
        builder = new.StringBuilder(String.valueOf(sixSymbolsNumber));
        String info = scanner.nextLine();
        System.out.println(info);




    }
}
