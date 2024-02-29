import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scanner.nextInt();
        System.out.println(number);

        //Условие if()

//        if (number < 10) {
//            System.out.println("Ваше число меньше 10и");
//        } else if (number > 10) {
//            System.out.println("Ваше число больше 10и");
//        } else if (number == 10) {
//            System.out.println("Ваше число равно 10и");
//        } else {
//            System.out.println("Какая-то ошибка");
//        }

        //Условие switch()
        while(number > 0) {
            switch (number) {
                case 10: {
                    System.out.println("Ваше число равно 1");
                    number--;
                    break;
                }
                case 2: {
                    System.out.println("Ваше число равно 2");
                    break;
                }
                default: {
                    System.out.println("Какая-то ошибка");
                }
            }
        }

    }
}