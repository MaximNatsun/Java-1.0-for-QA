import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите уравнение в формате 'a+b=x', где x может быть в одной из трех позиций. Для выхода из цикла введите: 0");
        // объявляем строковую переменную input, в которую пользователь вводит формулу; index содержит индекс позиции x в формуле; a и b - переменные , содержащие цифры; operator содержит + или -
        String input;
        char operator;
        int index, a, b;

        while (true) {
            System.out.print("Ввод: ");
            input = in.nextLine();
            if (input.equals("0")) {
                break;
            }
            operator = input.charAt(1);
            // производим поиск индекса в строке, по которому находится искомая Х переменная
            index = input.indexOf("x");

            // x может находиться в одной из трех позиций: 0-й (x+b=a), 2-й (a+x=b) и 4-й (a+b=x). В зависимости от этого, вызываем соответствующую функцию подсчета искомой x
            if (index == 0) {
                a = Character.getNumericValue(input.charAt(4));
                b = Character.getNumericValue(input.charAt(2));
                getResultIndexZero(a, b, operator);
            } else if (index == 2) {
                a = Character.getNumericValue(input.charAt(0));
                b = Character.getNumericValue(input.charAt(4));
                getResultIndexTwo(a, b, operator);
            } else if (index == 4) {
                a = Character.getNumericValue(input.charAt(0));
                b = Character.getNumericValue(input.charAt(2));
                getResultIndexFour(a, b, operator);
            } else {
                System.out.println("Нужно было ввести уравнение в формате 'a+b=x'.");
            }
        }
    }

    public static void getResultIndexZero(int a, int b, char operator) {
        int x;
        switch (operator) {
            case '+':
                x = a - b;
                System.out.println("х равен: " + x);
                break;
            case '-':
                x = a + b;
                System.out.println("х равен: " + x);
                break;
        }
    }

    public static void getResultIndexTwo(int a, int b, char operator) {
        int x;
        switch (operator) {
            case '+':
                x = b - a;
                System.out.println("х равен: " + x);
                break;
            case '-':
                x = a - b;
                System.out.println("х равен: " + x);
                break;
        }
    }

    public static void getResultIndexFour(int a, int b, char operator) {
        int x;
        switch (operator) {
            case '+':
                x = a + b;
                System.out.println("х равен: " + x);
                break;
            case '-':
                x = a - b;
                System.out.println("х равен: " + x);
                break;
        }
    }
}