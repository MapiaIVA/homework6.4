package org.example;

import java.lang.module.FindException;
import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Integer.min;
import static java.lang.Integer.sum;
import static java.lang.Math.max;
import java.lang.reflect.Array;
import java.util.*;
import java.util.zip.CheckedOutputStream;

public class Main {
    static boolean continueExecution = true;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        while (continueExecution) {
            //Task roster
            int numberOfTask = taskRoaster();
            switch (numberOfTask) {
                case 1: {
                    //Task1
                    task1();
                    break;
                }
                case 2: {
                    //Task2
                    task2();
                    break;
                }
                case 3: {
                    //Task3
                    task3();
                    break;
                }
                case 4: {
                    //Task4
                    task4();
                    break;
                }
                case 5: {
                    //Task5
                    task5();
                    break;
                }
                case 6: {
                    //Task6
                    task6();
                    break;
                }
                case 7: {
                    //Task7
                    task7();
                    break;
                }
                case 8: {
                    //Task8
                    task8();
                    break;
                }
                case 9: {
                    //Task9
                    task9();
                    break;
                }

                case 10: {
                    //Task10
                    task10();
                    break;
                }
                case 11: {
                    //Task11
                    task11();
                    break;
                }
                case 12: {
                    //Task12
                    task12();
                    break;
                }
                case 13: {
                    //Task13
                    task13();
                    break;
                }
                case 14: {
                    //Task14
                    task14();
                    break;
                }
                case 15: {
                    //Task15
                    task15();
                    break;
                }
                case 16: {
                    //Task16
                    task16();
                    break;
                }
                case 17: {
                    //Task17
                    task17();
                    break;
                }
                case 18: {
                    //Task18
                    task18();
                    break;
                }
                case 19: {
                    //Task19
                    task19();
                    break;
                }
                case 20: {
                    //Task20
                    task20();
                    break;
                }
                case 21: {
                    //Task21
                    task21();
                    break;
                }
                case 22: {
                    //Task22
                    task22();
                    break;
                }
                case 23: {
                    //Task23
                    task23();
                    break;
                }
                case 24: {
                    //Task24
                    task24();
                    break;
                }
                case 25: {
                    //Task25
                    task25();
                    break;
                }
                case 26: {
                    //Task26
                    task26();
                    break;
                }
                case 27: {
                    //Task27
                    task27();
                    break;
                }
                case 28: {
                    //Task28
                    task28();
                    break;
                }
                case 29: {
                    //Task29
                    task29();
                    break;
                }
                case 30: {
                    //Task30
                    task30();
                    break;
                }
                case 31: {
                    //Task31
                    task31();
                    break;
                }
                case 32: {
                    //Task32
                    task32();
                    break;
                }
                case 33: {
                    //Task33
                    task33();
                    break;
                }
                default:
                    System.out.println("Выберите задание!");
                    break;
            }
            nextTaskQuestion();
        }


    }

    public static int taskRoaster() {
        System.out.print("Выберите задание для проверки: ");
        return scanner.nextInt();
    }

    public static void nextTaskQuestion() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Хотите проверить другую задачу?  Да/Нет: ");
        String choice = scanner.nextLine();
        if (choice.equalsIgnoreCase("да")) {
            continueExecution = true;
        } else if (choice.equalsIgnoreCase("нет")) {
            scanner.close();
            continueExecution = false;
        }
    }

    public static void task1() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первую цифру: ");
        int char1 = scanner.nextInt();
        System.out.print("Введите вторую цифру: ");
        int char2 = scanner.nextInt();
        System.out.print("Введите третью цифру: ");
        int char3 = scanner.nextInt();
        System.out.println("Результат: " + char1 + char2 + char3);
    }

    public static void task2() {
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
        System.out.println("Результат: " + sum);
    }

    public static void task3() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество метров : ");
        double char1 = scanner.nextDouble();
        double aaa = char1 * 100;
        System.out.println("Результат в см: " + aaa);
        double bbb = char1 * 10;
        System.out.println("Результат в дм: " + bbb);
        double lll = char1 * 1000;
        System.out.println("Результат в мм: " + lll);
        double hhh = char1 / 1609.34;
        System.out.println("Результат в милях: " + hhh);

    }

    public static void task4() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите основание: ");
        double char1 = scanner.nextInt();
        System.out.print("Введите высоту: ");
        double char2 = scanner.nextInt();
        double S = 0.5 * char1 * char2;
        System.out.println("Результат: " + S);
    }

    public static void task5() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int uuu = scanner.nextInt();
        StringBuilder gggg = new StringBuilder(String.valueOf(uuu));
        gggg.reverse();
        System.out.println("Число наоборот: " + gggg);
    }

    public static void task6() {
        boolean trueOrFalse = true;
        int number = 199999;
        if (number < 15) {
            System.out.println("условие выполняется ");
            for (int i = 0; i < number; i++) {
                number--;
                System.out.println(" ЧИСЛО НАМБЕР УМЕНБШИЛДОСЬ. ЕГО ЗНАЧЕНИЕ " + number);
            }
        } else {
            System.out.println("условие не выолняется");

        }
    }

    public static void task7() {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if (num % 2 == 0) {
            System.out.print("Even number ");
        } else if (num % 2 != 0) {
            System.out.print("Odd number ");
        }
    }

    public static void task8() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первую цифру: ");
        int char1 = scanner.nextInt();
        System.out.print("Введите вторую цифру: ");
        int char2 = scanner.nextInt();
        System.out.print("Введите третью цифру: ");
        int char3 = scanner.nextInt();
        System.out.print("1- умножение, 0- сложение ");
        int uuu = scanner.nextInt();
        if (uuu == 1) {
            int result;
            result = char1 * char2 * char3;
            System.out.println("Результат: " + result);
        } else if (uuu == 0) ;
        {
            int result;

            result = char1 + char2 + char3;
            System.out.println("Результат: " + result);
        }
    }

    public static void task9() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первую цифру: ");
        int char1 = scanner.nextInt();
        System.out.print("Введите вторую цифру: ");
        int char2 = scanner.nextInt();
        System.out.print("Введите третью цифру: ");
        int char3 = scanner.nextInt();
        System.out.print("1- минимум, 0- максимум, 2-средннеарфм ");
        int uuu = scanner.nextInt();
        {
            if (uuu == 1) {
                int result;
                result = min(char1, char2);
                result = min(char2, char3);
                result = min(char1, char3);
                System.out.println("Результат: " + result);
            } else if (uuu == 0) {
                int result;
                result = max(char1, char2);
                result = max(char2, char3);
                result = max(char1, char3);
                System.out.println("Результат: " + result);
            } else if (uuu == 2) {
                int result;
                result = (char1 + char2 + char3) / 3;
                System.out.println("Результат: " + result);
            }


        }
    }

    public static void task10() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите метры: ");
        double char1 = scanner.nextDouble();
        System.out.print("1- мили, 0- дюймы, 2-ярды ");
        double uuu = scanner.nextDouble();
        {
            if (uuu == 1) {
                double result;
                result = char1 * 0.006;
                System.out.println("Результат: " + result);
            } else if (uuu == 0) {
                double result;
                result = char1 * 39.3701;
                System.out.println("Результат: " + result);
            } else if (uuu == 2) {
                double result;
                result = char1 * 1.09361;
                System.out.println("Результат: " + result);
            }

        }
    }

    public static void task11() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите часы: ");
        double char1 = scanner.nextDouble();
        System.out.print("1- гн, 0-гм , 2-гд  ");
        double uuu = scanner.nextDouble();
        int hour = 1;
        {
            if (uuu == 1) {
                boolean result;
                result = hour >= 6 && hour < 13;
                System.out.println("Результат: " + result);
            } else if (uuu == 0) {
                double result;
                result = char1 * 39.3701;
                System.out.println("Результат: " + result);
            } else if (uuu == 2) {
                double result;
                result = char1 * 1.09361;
                System.out.println("Результат: " + result);
            }
        }
    }

    public static void task12() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите Время: ");
        int time = scanner.nextInt();
        int hour = 0;

        if (time > 6 && time < 13) {
            System.out.println("GOOD MORNING");
            String info = scanner.nextLine();
            System.out.println(info);
        }
        if (time > 13 && time < 17) {
            System.out.println("GOOD d");
            String info = scanner.nextLine();
            System.out.println(info);
        }
        if (time > 17 && time < 24) {
            System.out.println("GOOD e");
            String info = scanner.nextLine();
            System.out.println(info);
        }
        if (time > 0 && time < 6) {
            System.out.println("GOOD n");
            String info = scanner.nextLine();
            System.out.println(info);
        }
    }

    // показать числа в заданном диапазоне 21.11
    public static void task13() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Введите второе число: ");
        int secondNumber = scanner.nextInt();
        for (int i = firstNumber; i <= secondNumber; i++) {
            System.out.println(i);
        }
    }

    public static void task14() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Введите второе число: ");
        int secondNumber = scanner.nextInt();
        for (int i = firstNumber; i <= secondNumber; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    public static void task15() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Введите второе число: ");
        int secondNumber = scanner.nextInt();
        if (secondNumber < firstNumber) {
            int temp = firstNumber;
            firstNumber = secondNumber;
            secondNumber = temp;
        }
        for (int i = firstNumber; i < secondNumber; i++) {
            if (i % 2 != 0)
                System.out.println(i);
        }
    }


    public static void task16() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Введите второе число: ");
        int secondNumber = scanner.nextInt();
        int result = firstNumber;
        for (int i = firstNumber; i <= secondNumber; i++) {
            result = result + i;
        }
        int mdAripm = result / (secondNumber - firstNumber);
        System.out.println("Сумма чисел в диапазоне от " + firstNumber + " до " + secondNumber + " равна: ");
        System.out.println("Средне арифметическое равно: " + mdAripm);
    }

    public static void task17() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int a = scanner.nextInt();
        int result = 1;
        for (int i = 2; i <= a; i++) {
            result = result * i;
        }
        System.out.println("Факториал числа  равен " + result);
    }

    public static void task18() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int lenght = scanner.nextInt();
        // проверка корректности данных

        for (int i = 0; i < lenght; i++) {
            System.out.println("*");
        }
    }

    public static void task19() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int lenght = scanner.nextInt();
        // ввод символа для заполнения строки
        System.out.println("Введите символ строки: ");
        String sym = scanner.next();
        // вывод символов в строке
        for (int i = 0; i < lenght; i++) {
            System.out.println(sym);
        }
    }

    public static void task20() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Введите второе число: ");
        int secondNumber = scanner.nextInt();
        // анализ чисел в диапазоне
        for (int i = firstNumber; i < secondNumber; i++) {
            if ((firstNumber + i) % 3 == 0 && (firstNumber + i) % 5 == 0) {
                System.out.println((firstNumber + i) + "Fizz Buzz");
            } else if ((firstNumber + i) % 3 == 0) {
                System.out.println((firstNumber + i) + "Buzz");
            } else if ((firstNumber + i) % 5 == 0) {
                System.out.println((firstNumber + i) + "Fizz");
            } else {
                System.out.println(firstNumber + i);
            }
        }
    }

    public static void task21() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int c = scanner.nextInt();
        // проверка корректности данных
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void task22() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int c = scanner.nextInt();
        // проверка корректности данных
        for (int i = 1; i <= c; i++) {
            for (int j = 1; j <= c; j++) {
                if (i == 1 || i == c || j == 1 || j == c) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }


    public static void task23() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int a = scanner.nextInt();
        System.out.println("Введите второе число: ");
        int b = scanner.nextInt();
        // проверка корректности данных
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= b; j++) {
                if (i == 1 || i == a || j == 1 || j == b) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }

    public static void task24() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Введите второе число: ");
        int secondNumber = scanner.nextInt();
        boolean b = true;
        // анализ чисел в диапазоне
        for (int i = 2; i <= secondNumber; i++) {
            for (int j = 2; j < firstNumber; j++) {
                if (i % j == 0) {
                    b = false;
                    break;

                }
            }
            if (b) System.out.println(i + "простое");
            else b = true;


        }
    }

    public static void task25() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите начало диапазона:");
        int first = scanner.nextInt();
        System.out.println("Введите конец диапазона:");
        int second = scanner.nextInt();
        System.out.println("Таблица умножения в диапазоне от " + first + " до " + second);
        for (int i = first; i <= second; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " * " + j + " = " + (i * j));
            }
        }
    }

    public static void task26() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String str = scanner.nextLine();
        char[] charArray = str.toCharArray();
        char[] reversedString = new char[charArray.length];
        for (int i = 0; i < charArray.length; i++) {
            reversedString[i] = charArray[charArray.length - i - 1];
//            System.out.println(reversedString[i]);
        }
        String stroka = new String(reversedString);
        System.out.println(stroka);
    }

    public static void task27() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String str = scanner.nextLine();
        System.out.println("Введите слово для поиска: ");
        String word = scanner.nextLine();
        System.out.println("Введите слово для замены: ");
        String word1 = scanner.nextLine();
        StringTokenizer st = new StringTokenizer(str);
        String str2 = str.replaceAll(word, word1);
        System.out.println(str2);
    }

    public static void task28() {
        int[] a = new int[]{4, 3, 2, 1};
        int[] b = new int[]{5, 3, 6, 1};
        int[] c = new int[a.length + b.length];
        int count = 0;

        for (int i = 0; i < a.length; i++) {
            c[i] = a[i];
            count++;
        }
        for (int j = 0; j < b.length; j++) {
            c[count++] = b[j];
        }
        for (int i = 0; i < c.length; i++) System.out.print(c[i] + " ");
        System.out.println("");
    }

    public static void task29() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String str = scanner.nextLine();
        if (str.equals((new StringBuffer(str)).reverse().toString()))
            System.out.println("pal");
        else
            System.out.println("not");
    }

    public static void task30() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите элементы массива(построчно): ");
        int[] array = new int[5];
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            array[i] = scanner.nextInt();
        }
        for (int num : array) {
            sum = sum + num;
        }
        System.out.println("Сумма элементов массива равна: " + sum);
    }

    public static void task31() {
        int[] number1 = {2, 3, 4, 3, 6, 7, 6, 8, 2, 9};
        int[] number2 = {2, 3, 6, 8, 5, 1};

        Arrays.stream(number1)
                .filter(i -> Arrays.stream(number2)
                        .filter(n -> n == i).findAny().isPresent())
                .distinct()
                .forEach(System.out::println);
// 1.3 задание
    }

    public static void task32() {
        String[] a = {"1", "2", "3"};
        String[] b = {"3", "4"};
        String[] c = new String[a.length + b.length];
        System.arraycopy(a, 0, c, 0, a.length);
        System.arraycopy(b, 0, c, a.length, b.length);
        System.out.println(Arrays.toString(c));
        // 1.1
    }

    public static void task33() {

    }
    }













