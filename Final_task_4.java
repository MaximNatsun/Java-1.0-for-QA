import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

	    int attempts = 3;
	    String rightAnswer = "заархивированный вирус";
	    System.out.println("Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает");

	    while (attempts > 0) {
            System.out.print("Ответ: ");
            String answer = in.nextLine();

            if (answer.equalsIgnoreCase(rightAnswer)) {
                System.out.print("Правильно!");
                break;
            } else if (answer.equalsIgnoreCase("Подсказка") && attempts == 3) {
                attempts = 1;
                System.out.println("Подсказка: это не лук!");
                continue;
            } else if (answer.equalsIgnoreCase("Подсказка") && attempts != 3) {
                System.out.println("Подсказка уже недоступна.");
                continue;
            }
            attempts--;
            if (attempts > 0 ) {
                System.out.println("Подумай еще!");
            } else {
                System.out.println("Обидно, приходи в другой раз.");
            }
        }
    }
}