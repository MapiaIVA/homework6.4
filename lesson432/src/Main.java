// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");
        Student student = new Student("Иванов Константин Евгеньевич", 22);
        System.out.println(student.toString());

        Aspirant aspirant = new Aspirant("Исследование объектно-реляционных бд", "Сидоров Константин Сергеевич", 28);
        System.out.println(aspirant);

        Student student1 = new Student("Петров Сергей Сергеевич", 22);
        System.out.println(student1);

        Student aspirant1 = new Aspirant("Исследование объектно-реляционных бд","Сидоров Константин Сергеевич", 28);
        System.out.println(aspirant1);
        Ball redBall = new Ball("red");
        Ball blackball = new Ball("black");
        System.out.println(redBall.getCountInstance());
        System.out.println(blackball.getCountInstance());

    }
}