import java.util.Scanner;

import static java.lang.Integer.reverse;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первую цифру: ");
        int char1 = scanner.nextInt();
        System.out.print("Введите вторую цифру: ");
        int char2 = scanner.nextInt();
        System.out.print("Введите третью цифру: ");
        int char3 = scanner.nextInt();
        System.out.println("Результат: " + char1 + char2 + char3);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         System.out.print("Введите первую цифру: ");
        int char1 = scanner.nextInt();
        System.out.print("Введите вторую цифру: ");
        int char2 = scanner.nextInt();
        System.out.print("Введите третью цифру: ");
        int char3 = scanner.nextInt();
        System.out.print("Введите четвертую цифру: ");
        int char4 = scanner.nextInt();
        int sum = char1 * char2 * char3 * char4;
       System.out.println("Результат: " + sum );
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество метров : ");
        double char1 = scanner.nextInt();
        double aaa = char1 * 100 ;
        System.out.println("Результат в см: " + aaa );
        double bbb = char1 * 10 ;
        System.out.println("Результат в дм: " + bbb);
        double lll  = char1 * 1000 ;
        System.out.println("Результат в мм: " + lll);
        double hhh = char1 / 1609.34 ;
        System.out.println("Результат в милях: " + hhh);
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите основание: ");
        double char1 = scanner.nextInt();
        System.out.print("Введите высоту: ");
        double char2 = scanner.nextInt();
        double S = 0.5 * char1 * char2 ;
        System.out.println("Результат: " + S );
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int uuu = scanner.nextInt();
        StringBuilder gggg = new StringBuilder(String.valueOf(uuu));
        gggg.reverse();
        System.out.println("Число наоборот: " + gggg);
    }
}


