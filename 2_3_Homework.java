public class Main {

    public static void main(String[] args) {
        // переменная а имеет тип с плавающей точкой с наибольшим диапазоном чисел
        double a = 100.35;
        // переменная b имеет целочисленный тип с наименьшим диапазоном числе. 127 - наибольшее возможное значение для этого типа
        byte b = 127;
        System.out.println(a);
        System.out.println(b);

        // объявляем массив и заполняем его 5 целыми числами
        int[] myArray = {3, 6, 9, 11, 13};

        // объявляем переменную, через которую поменяем значения первого и последнего элемента в массиве myArray
        int temp = myArray[myArray.length - 1];
        myArray[myArray.length - 1] = myArray[0];
        myArray[0] = temp;
        // суммируем первый и средний элемент массива
        int sum_num = myArray[0] + myArray[(myArray.length - 1) / 2];

        System.out.println(sum_num);
    }
}
