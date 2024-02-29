import java.lang.reflect.Array;
import java.util.*;
import java.util.zip.CheckedOutputStream;

public class Main {
    public static void main(String[] args) {
        int[] mas; // объявление переменной типа массив с именем мас

        // cразу после создания массива, его элементы инициализируются значениями по умолчанию
        // в данном случае 0

        int[] ints = new int[5];
        // обращение к элементам массива
        System.out.println(ints[4]);
        // создание массива, с его одновременной инициализацией
        int[] mas2 = new int[] {3, 2, 1};
        // альтернативный вариант
        int[] mas3 ={4, 5, 6,};
        System.out.println(mas3.length);
        mas = new int[]{1, 2, 3};
        // создание двумерного массива
        int[][] mas4 = new int[5][5];
        int[][][] mas5 = new int[5][5][5];
        //трехмерный массив
        mas4[2][1] = 3;
        int[][] mas6 = new int[3][];
        mas6[0] = new int[4];


        //пример вывода значений массива
        int[] numbers = new int[] {4,3,2,1,3};
        //вывод каждого значения в консоль
        for (int number : numbers) {
            System.out.println(number);
        }
        //вывод содержимого массива в консоль
        System.out.println(Arrays.toString(numbers));

        //System.arraycopy(scr, scrPos, dest, destPos, length)
        // src - откуда копировать
        // dest - куда копироватьl
        //length - кол-во копируемых элементов
        //srcPos - индекс, с которого начинать копирование
        //destPos - индекс, в который начать копирование
        int[] src = new int[] {1,2,3,4,5};
        int[] dest = new int[] {5,4,3,2,1};
        int length = 3;
        int srcIndex = 1;
        int destIndex = 2;
        System.arraycopy(src, srcIndex, dest, destIndex, length);

        System.out.println(Arrays.toString(dest));
        //пример вывода в консоль содержимого многомерного массива
        String[][] objects = new String[3][3];
        String content = Arrays.deepToString(objects);
        System.out.println(content);
        //заполнение массива одинаковыми значениями
        boolean[] test1 = new boolean[3];
        Arrays.fill(test1, true);
        int[] mas7 = new int[10];
        int startIndex = 1;
        int endIndex = 4;
        Arrays.fill(mas7, startIndex, endIndex, 2);
        // сортировка массива
        int[] mas8 = new int[] {3,1,4,5,2};
        Arrays.sort(mas8);
        System.out.println(Arrays.toString(mas8));
        //
        Integer[] mas9 = new Integer[] {3,1,4,6,2};
        Arrays.sort(mas9, Collections.reverseOrder());
        System.out.println(Arrays.toString(mas9));

        //поэлементное сравнение масивов
        int[] mas10 = {1,2,3};
        int[] mas11 = {1,2,3};
        boolean isEqual = Arrays.equals(mas10, mas11);
        System.out.println(isEqual);
        //поиск значения по массиву
        int index = Arrays.binarySearch(mas11, 3);
        System.out.println(index);

        //-----------------------
        //строки
        // создание строки
        String name = "Вася";
        System.out.println(name);
        name = "";

        String name1 = new String("Вася");
        name1 = new String();
        // преобразование числа в строку
        int num = 10;
        String value = String.valueOf(num);
        value = String.valueOf(0.5);
        value = String.valueOf(true);

        //%a - шестнадцатиричное значение с плавающей точкой
        //%b - булево значение
        //%c - символьное представление

        String result = String.format("жили у бабуси %d веселых гуся", 2);
        System.out.println(result);

        //поиск символа в строке
        String name2 = "Oleg";
        System.out.println(name2.charAt(3));

        // поиск совпадений в строке
        String testString = "testing";
        boolean test = testString.contains("test");
        System.out.println(test);

        String str1 = "     Star wars      ";
        boolean test2 = str1.startsWith("Star");
        System.out.println(test2);

        test2 = str1.endsWith("ars");
        System.out.println(test2);

        // обрезание пробелов строки
        String trimmedString = str1.trim();
        System.out.println(trimmedString);

        String text = "обороноспособность";
        int index1 = text.indexOf("б", index + 1);
        System.out.println(index1);

        //вывод части исходной строки
        // вырезает строку c 6го символа и до конца строки
        String world = "Hello World".substring(1, 4);
        System.out.println(world);

        //добавление строки в объект класса StringBuffer и возврат ссылки на тот же объект
        StringBuffer sb = new StringBuffer("test");
        sb.append("-").append("test");
        sb.append(true);
        sb.append(1);
        System.out.println(sb);

        // подстановка строки в строку
        StringBuffer sb1 = new StringBuffer("i  Java!");
        sb1.insert(2,"love ");
        //2 - индексы символа, после которого будет выставлена строка
        System.out.println(sb1);

        //поменять порядок символов на обратный
        StringBuffer sb2 = new StringBuffer("PALINDROME");
        sb2.reverse();
        System.out.println(sb2);

        //удалить часть строки
        StringBuffer phrases = new StringBuffer("I do not like Java!");
        phrases.delete(2, 8);
        System.out.println(phrases);

        //пример разбиения строки на слова
        String s = "Best Java programming language.";
        StringTokenizer st = new StringTokenizer(s);
        while (st.hasMoreElements()) {
            System.out.println(st.nextToken());
        }
        //пример разбиения строки на слова, используя запятую, в качестве разделителя
        String s1 = "Best, Java, programming, language";
        StringTokenizer st1 = new StringTokenizer(s1,",");
        while (st1.hasMoreElements()) {
            System.out.println(st1.nextToken());
        }
// cравнение объектов тоже самое что ==
        StringBuffer sb3 = new StringBuffer("abc");
        StringBuffer sb4 = new StringBuffer("abc");
        System.out.println(sb3.equals(sb4));


//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите строку:");
//        int testString4 = scanner.nextInt();
//        System.out.println("Введите слово для поиска:");
//        int test9 = scanner.nextInt();
//        int test10 = testString4.contains(test9);
//        System.out.println(test10);
//
//

    }
}