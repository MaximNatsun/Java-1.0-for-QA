import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите количество строк: ");
        int n = in.nextInt();
        // bestResult хранит длину строки, состоящей из уникальных символов; bestInput хранит саму строку
        int bestResult = 0;
        String bestInput = "";

        for (int m = 1; m <= n; m++) {
            System.out.print("Строка " + m + ": ");
            String input = in.next();
            char chars[] = input.toCharArray();
            String result = "";
            // проводим анализ, встречается ли i-ый элемент массива во всем массиве строки, начиная с
            // i + 1 элемента (т.е. начиная с j-го); если встречается, то затираем j-ый элемент массива input, т.о. оставляем только уникальные символы в строке input
            for (int i = 0; i < input.length(); i++) {
                for (int j = i + 1; j < input.length(); j++) {
                    if (chars[j] == chars[i]) {
                        chars[j] = ' ';
                    }
                }
                result = result + chars[i];
                result = result.replaceAll("\\s","");
            }
            // анализируем кол-во уникальных символов (длина строки result) с лучшим результатом
            if (result.length() > bestResult) {
                bestResult = result.length();
                bestInput = result;
            }
            if (m == n) {
                System.out.printf("Ответ: %s", bestInput);
            }
        }
    }
}