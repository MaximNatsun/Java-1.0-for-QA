import java.util.Scanner;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US);

        System.out.print("Курс доллара: ");
        double rate = in.nextDouble();

        System.out.print("Количество рублей: ");
        int quantity = in.nextInt();

        double result = quantity / rate;
        System.out.printf("Итого: %.2f долларов", result);
    }
}