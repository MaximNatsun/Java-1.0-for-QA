import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Выберите, что переводить: 1 — масса, 2 — расстояние");
        int choice = in.nextInt();

        if (choice == 1) {
            calcWeight();
        }
        else if (choice == 2) {
            calcDistance();
        }
        else {
            System.out.println("Необходимо было ввести 1 или 2.");
        }
    }

    static void calcWeight() {
        Scanner in = new Scanner(System.in);
        System.out.println("Выберите единицу измерения: 1 — килограмм, 2 — фунт, 3 — унция, 4 — тонна");
        int choice = in.nextInt();
        double kilo, pound, ounce, ton;

        switch (choice) {
            case 1:
                System.out.print("Введите число выбранной единицы: ");
                kilo = in.nextDouble();
                pound = kilo * 2.2046226218;
                ounce = kilo * 35.27396194879968;
                ton = kilo * 0.0009999999999778647;
                getResultWeight(kilo, pound, ounce, ton);
                break;
            case 2:
                System.out.print("Введите число выбранной единицы: ");
                pound = in.nextDouble();
                kilo = pound * 0.4535923699899546;
                ounce = pound * 15.99999999964569;
                ton = pound * 0.00045359236998995464;
                getResultWeight(kilo, pound, ounce, ton);
                break;
            case 3:
                System.out.print("Введите число выбранной единицы: ");
                ounce = in.nextDouble();
                kilo = ounce * 0.02834952312437242;
                pound = ounce * 0.062499999998617106;
                ton = ounce * 0.00002834952312437242;
                getResultWeight(kilo, pound, ounce, ton);
                break;
            case 4:
                System.out.print("Введите число выбранной единицы: ");
                ton = in.nextDouble();
                kilo = ton * 999.9999999778647;
                pound = ton * 2204.6226218;
                ounce = ton * 35273.96194879968;
                getResultWeight(kilo, pound, ounce, ton);
                break;
        }
    }

    static void calcDistance() {
        Scanner in = new Scanner(System.in);
        System.out.println("Выберите единицу измерения: 1 — метр, 2 — миля, 3 — ярд, 4 — фут");
        int choice = in.nextInt();
        double meter, mile, yard, foot;

        switch (choice) {
            case 1:
                System.out.print("Введите число выбранной единицы: ");
                meter = in.nextDouble();
                mile = meter * 0.000621371192237334;
                yard = meter * 1.0936132983;
                foot = meter * 3.2808398950131;
                getResultDistance(meter, mile, yard, foot);
                break;
            case 2:
                System.out.print("Введите число выбранной единицы: ");
                mile = in.nextDouble();
                meter = mile * 1609.3439999999998;
                yard = mile * 1759.999999939315;
                foot = mile * 5279.999999999962;
                getResultDistance(meter, mile, yard, foot);
                break;
            case 3:
                System.out.print("Введите число выбранной единицы: ");
                yard = in.nextDouble();
                meter = yard * 0.9144000000315285;
                mile = yard * 0.0005681818182014091;
                foot = yard * 3.0000000001034186;
                getResultDistance(meter, mile, yard, foot);
                break;
            case 4:
                System.out.print("Введите число выбранной единицы: ");
                foot = in.nextDouble();
                meter = foot * 0.3048000000000022;
                mile = foot * 0.00018939393939394078;
                yard = foot * 0.3333333333218424;
                getResultDistance(meter, mile, yard, foot);
                break;
        }
    }

    static void getResultDistance(double meter, double mile, double yard, double foot) {
        System.out.println("Результат:");
        System.out.printf("Метры: %.0f\nМили: %.3f\nЯрды: %.2f\nФуты: %.2f", meter, mile, yard, foot);
    }

    static void getResultWeight(double kilo, double pound, double ounce, double ton) {
        System.out.println("Результат:");
        System.out.printf("Килограммы: %.0f\nФунты: %.2f\nУнции: %.2f\nТонны: %.2f", kilo, pound, ounce, ton);
    }

}