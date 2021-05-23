import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите любое целое положительное число: ");
        int n = in.nextInt();

        // с помощью цикла посчитаем сумму нечетных чисел от 1 до n
        for (int i = 1, result = 0; i <= n; i++) {
            if (i % 2 == 1) {
                result += i;
            }
            if (i == n) {
                System.out.printf("Сумма всех нечетных чисел от 1 до %d: %d", n, result);
            }
        }
    }
}