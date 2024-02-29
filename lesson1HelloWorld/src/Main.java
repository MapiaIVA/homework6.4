public class Main {
    public static void main(String[] args) {
        //переменная для хранения валюты: рубли
        int walletRU = 2000;

        //переменная для хранения валюты: доллары
        int walletDollar = 94;

        String str = " рублей, в долларах это -  доллар";
        //переменная хранящая результат преобразования
        int result = walletRU / walletDollar;
        //Выводим в консоль полученный результат
        System.out.println(walletRU + str + result);

        /* Арифметические операции:
         * сложение: +
         * вычитание: -
         * умножение: *
         * деление: /
         * остаток от деления: %
         * */
        sum(100, 25);
        mum(100, 25);
        com(100, 25);
        pop(100, 25);

    }

    public static void sum(int num1, int num2) {
        int result = num1 + num2;
        System.out.println("Результат сложения двух чисел - " + result);
    }
        public static void mum(int num1, int num2){
            int result = num1 - num2;
            System.out.println("Результат вычитания двух чисел - " + result);
        }
        public static void com(int num1, int num2) {
            int result = num1 * num2;
            System.out.println("Результат умножения двух чисел - " + result);
        }
            public static void pop(int num1, int num2) {
                int result = num1 / num2;
                System.out.println("Результат деления двух чисел - " + result);
            }

        }
