public class Main {
    public static void main(String[] args) {
       int i = 0;
//       счетчик
       int count = 0;
//        System.out.println( "текущее значение счетчика:  "+ count + ", ");
//       count = count + 1;
//       System.out.println( "текущее значение счетчика:  "+ count + ", ");
//        count = count + 1;
//        System.out.println( "текущее значение счетчика:  "+ count + ", ");
//        count = count + 1;
//        System.out.println( "текущее значение счетчика:  "+ count + ", ");
//        count = count + 1;
//        System.out.println( "текущее значение счетчика:  "+ count + ", ");
//        while
//        while (i < 25) {
//            count = count + 1;
//            System.out.println( "текущее значение счетчика:  "+ count + ", ");
//            i = i + 1;
//
//
//        }
//        while do
//        do {
//            count = count + 1;
//            System.out.println( "текущее значение счетчика:  "+ count + ", ");
//            i = i + 1;
//        }
//        while (i < 20);
//         for
//        for (int x = 0; x < 25; x=x+1) {
//            count = count + 1;
//            System.out.println( "текущее значение счетчика:  "+ count + ", ");
//        }
        int [] numbers = new int[] {3, 2, 1, 0, -1};
        for (int number : numbers) {
            number = number + 10;
            if (i == 3) {
                System.out.println("Сейчас значение i = " +i);
            }
            i = i + 1;
            System.out.println(number);
        }
    }
}
