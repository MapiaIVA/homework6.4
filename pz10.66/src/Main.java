public class Main {
    public static void main(String[] args) {
        byte min = 0;// минимальное
        byte max = 0;// максимальное

        byte[][] array = new byte[3][3];
        for (
                byte y = 0;
                y < array.length; y++) {// проход по строкам
            for (byte x = 0; x < array.length; x++) {// проход по строкам ячейкам
                array[y][x] = (byte) (Math.random() * 21);

                System.out.print(array[y][x] + "\t");
            }
            System.out.print("\n");
        }


        // минимальный и максимальный элемент.
        // проход по строкам
        for (byte[] bytes : array) {
            for (byte x = 0; x < array.length; x++) {// проход по строкам ячейкам
                //
                if (bytes[x] < min) {
                    min = bytes[x];
                } else if (bytes[x] > max) {
                    max = bytes[x];
                }
            }
        }
        System.out.println(min);
        System.out.println(max);
    }
}


