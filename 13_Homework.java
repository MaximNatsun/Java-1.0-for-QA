import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите свою строку: ");
        String str = in.nextLine();

        String strLatin = str.replaceAll("[^a-zA-Z ]", "");

        // убираем лишние пробелы
        String clearStr = strLatin.replaceAll("( +)", " ").trim();
        System.out.println("Слова, состоящие только из латиницы: " + clearStr);

        // подсчитываем количество слов
        String[] words = clearStr.split(" ");
        int count = 0;
        for (String word : words) {
            count += 1;
        }
        System.out.println("Количество слов: " + count);
    }
}