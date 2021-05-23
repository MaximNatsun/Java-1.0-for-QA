import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // объявляем переменные-константы x, y, z
        final int x, y, z;
        x = 1;
        y = 5;
        z = 7;

        // запрашиваем у пользователя ввести размерность массива
        System.out.print("Введите размер целочисленного массива: ");
        int size = in.nextInt();

        // объявляем массив заданной размерности и запрашиваем у пользователя данные для его заполнения
        int[] myArray = new int[size];
        for (int i = 0; i < myArray.length; i++) {
            System.out.printf("Введите %d элемент массива: ", i+1);
            myArray[i] = in.nextInt();
            // сравниваем каждый элемент массива с константами; если находим соответствие, выводим сообщение
            if (myArray[i] == x || myArray[i] == y || myArray[i] == z) {
                System.out.println("Данное значение имеется в константах");
            }
        }
    }
}