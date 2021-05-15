import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int num1 = in.nextInt();
        System.out.print("Введите второе число: ");
        int num2 = in.nextInt();
        System.out.print("Введите третье число: ");
        int num3 = in.nextInt();

        // выводим среднее арифметическое, полученное как результат вызова getAvgNum
        System.out.print("Среднее арифметическое: ");
        int avg_number = getAvgNum(num1, num2, num3);
        System.out.println(avg_number);

        // делим среднее на 2 (округление в меньшую сторону происходит автоматом для целочисленных типов данных)
        avg_number /= 2;

        if (avg_number > 3) {
            System.out.println("Программа выполнена корректно");
        }
    }

    public static int getAvgNum(int a1, int a2, int a3) {
        return (a1 + a2 + a3) / 3;
    }
}