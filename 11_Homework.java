import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        String str = in.next();
        System.out.print("Введите второе число: ");
        int num2 = in.nextInt();

        // приводим строковую переменную в целочисленную и сравниваем 2 числа друг с другом
        int num1 = Integer.parseInt(str);
        if (num1 > num2) {
            System.out.printf("Число %d оказалось больше.", num1);
            double x = num2;
            System.out.printf("\nЧисло %f оказалось меньше.", x);
        }
        else if (num1 < num2) {
            System.out.printf("Число %d оказалось больше.", num2);
            double x = num1;
            System.out.printf("\nЧисло %f оказалось меньше.", x);
        }
        else {
            System.out.print("Числа равны друг другу");
        }
    }
}