import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US);
        System.out.print("Задайте количество строк в массиве: ");
        int rows = in.nextInt();
        System.out.print("Задайте количество столбцов в массиве: ");
        int column = in.nextInt();

	    double[][] userArray = new double[rows][column];

	    for (int i = 0; i < userArray.length; i++) {
	        for (int j = 0; j < userArray[i].length; j++) {
                System.out.println("Введите значение элемента массива по " + i + " строке и " + j + " столбцу: ");
                userArray[i][j] = in.nextDouble();
            }
        }
	    // Выводим умноженные на 3 значения элементов первой строки матрицы в консоль
        for (int i = 0; i < userArray[0].length; i++) {
            userArray[0][i] *= 3;
            System.out.printf("\nЗначение %d элемента первой строки массива: %f", i, userArray[0][i]);
        }
    }
}