import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US);
        // запрашиваем у пользователя ввести размерность массива
        System.out.print("Введите размер массива с типом double: ");
        int size = in.nextInt();

        double avg_sum = 0;
        double sum = 0;

        // объявляем массив заданной размерности и запрашиваем у пользователя данные для его заполнения
        double[] myArray = new double[size];
        for (int i = 0; i < myArray.length; i++) {
            System.out.printf("Введите %d элемент массива: ", i + 1);
            myArray[i] = in.nextDouble();
            sum += myArray[i];
        }

        // рассчитываем среднее арифметическое элементов массива
        avg_sum = sum / myArray.length;
        System.out.printf("Среднее арифметическое элементов массива: %f", avg_sum);

        System.out.println("\nВыводим элементы массива, умноженные на среднее арифметическое:");
        // умножаем каждый элемент массива на среднее арифметическое и выводим в консоль
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] *= avg_sum;
            System.out.printf("\n%d элемент массива: %f", i+1, myArray[i]);
        }
    }
}