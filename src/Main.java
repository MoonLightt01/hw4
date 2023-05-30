import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Конвертер руб в Доллар и Евро");
        System.out.println("Введите кол-во рублей которые хотите перевести:");
        double rub = new Scanner(System.in).nextDouble();

        System.out.println("Введите актуальный курс доллара:");
        double dollarCourse = new Scanner(System.in).nextDouble();
        System.out.println("Введите актуальный курс евро:");
        double euroCourse = new Scanner(System.in).nextDouble();

        System.out.println("Руб= " + rub);
        System.out.println("Доллар= " + (rub * (1/dollarCourse)));
        System.out.println("Евро= " + (rub * (1/euroCourse)));
        System.out.println("Автор программы \"Moon_Light01\"");
    }
}
