import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();

        double[] myArray = new double[15];
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = Math.random() * 40 - 20;
        }

        // определение максимального и минимального значения среди элементов массива
        double max = -20.0;
        double min = 20.0;
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] > max) {
                max = myArray[i];
            }
            if (myArray[i] < min) {
                min = myArray[i];
            }
        }
        System.out.printf("Максимальное значение среди элементов массива: %.2f", max);
        System.out.printf("\nМинимальное значение среди элементов массива: %.2f", min);

        // возводим по модулю max и min
        double maxAbs = Math.abs(max);
        double minAbs = Math.abs(min);

        // выводим в консоль наибольшее значение среди maxAbs и minAbs
        if (maxAbs > minAbs) {
            System.out.printf("\nНаибольшее значение по модулю: %.2f", maxAbs);
        } else if (maxAbs < minAbs) {
            System.out.printf("\nНаибольшее значение по модулю: %.2f", minAbs);
        } else {
            System.out.println("\nЗначения равны друг другу");
        }
    }
}