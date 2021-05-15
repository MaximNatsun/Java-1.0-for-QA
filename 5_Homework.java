import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int num1 = in.nextInt();
        System.out.print("Введите второе число: ");
        int num2 = in.nextInt();
        System.out.print("Введите оператор: ");
        String operator = in.next();

        // в зависимости от того, какой оператор ввел пользователь, осуществляем соответствующую операцию с двумя числами
        switch (operator) {
            case "*": System.out.printf("Результат произведения двух чисел: %d", getMultiply(num1, num2));
                break;
            case "/": System.out.printf("Результат частного двух чисел: %d", getDivided(num1, num2));
                break;
            case "+": System.out.printf("Результат суммы двух чисел: %d", getSum(num1, num2));
                break;
            case "-": System.out.printf("Результат разности двух чисел: %d", getDifference(num1, num2));
                break;
            default: System.out.print("Неизвестный оператор. Требуется ввести один из: * / + -");
        }
    }

    static int getMultiply(int a1, int a2) {
        return (a1 * a2);
    }

    static int getDivided(int a1, int a2) {
        return (a1 / a2);
    }

    static int getSum(int a1, int a2) {
        return (a1 + a2);
    }

    static int getDifference(int a1, int a2) {
        return (a1 - a2);
    }

}