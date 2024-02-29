import java.util.Scanner;


    public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите первую цифру: ");
            int char1 = scanner.nextInt();
            System.out.print("Введите вторую цифру: ");
            int char2 = scanner.nextInt();
            System.out.print("Введите третью цифру: ");
            int char3 = scanner.nextInt();
            System.out.print("Умножить числа или сложить? : умножить/сложить ");
            String uuu = scanner.nextLine();
            {
                if (uuu.equals("умножить")) {
                    System.out.println("Результат: " + char1 * char2 * char3);
                } else if (uuu.equals("сложить")) {
                    System.out.print("Результат: " + char1 * char2 * char3);
                }

            }
        }
    }

