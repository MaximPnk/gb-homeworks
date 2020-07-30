package Course1.homework8.task6;

public class BaseConverter {

    public static void converter(double cel) {
        double f = 32 + 9 * 1.0 / 5 * cel;
        double k = cel + 273.15;
        System.out.printf("%.2f градусов по Цельсию = %.2f градусам по Фаренгейту\n", cel, f);
        System.out.printf("%.2f градусов по Цельсию = %.2f Кельвинам", cel, k);
    }
}
