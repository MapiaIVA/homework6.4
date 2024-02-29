import java.util.Random;

public class Main {
    public static void main(String[] args) {
        A.hello("Someone's sitting in the shade today", "because someone planted a tree a long time ago.", "Warren Buffet");
        int[] array = createRandomArray(1, 10);
        // System.out.println("Сумма элементов массива равна: " + arraySum(array));
        V.hello();
        int number = C.MethodThatReturnSumOfNumbers(1, 3, 5, 8);
        int[] array1 = new int[]{createRandom(1, 10)};
    }

    class A {
        static void hello(String name, String name1, String name2) {
            System.out.println(name);
            System.out.println(name1);
            System.out.println(name2);
        }

    }

    static int[] createRandomArray(int count, int max) {
        int[] array = new int[count];
        Random rand = new Random();
        int i;
        for (i = 0; i < count; i++) {
            array[i] = rand.nextInt(max);
        }
        for (i = count; i <= max; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        return array;
    }
    class V {
        static void hello() {

        for (int i = 1; i <=9; i++){
            System.out.print ("*");
        }
            System.out.println();
        }

    }
    class C {
        static int MethodThatReturnSumOfNumbers(int x, int y, int z, int q) {
            if (x > y & x > z & x > q) {
                System.out.println(x);
            } else if (y > x & y > z & y > q) {
                System.out.println(y);
            } else if (z > x & z > y & z > q) {
                System.out.println(z);
            } else if (q > x & q > y & q > z) {
                System.out.println(q);
            } else if (x == y | x == z | x == q) {
                System.out.println(x);
            } else if (y == z | y == q) {
                System.out.println(y);
            } else if (z == q) {
                System.out.println(z);
            }
            return x;
        }
    }
    static int createRandom (int count, int max) {
        int[] array1 = new int[count];
        Random rand = new Random();
        for (int i = 0; i < count; i++) {
            array1[i] = rand.nextInt(max);
        }
        return count + max;
    }

}


 // "because someone planted a tree a long time ago.", "Warren Buffet");