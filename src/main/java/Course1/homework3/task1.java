package Course1.homework3;

import java.util.Random;
import java.util.Scanner;

public class task1 {
    public static Scanner sc = new Scanner(System.in);
    public static Random random = new Random();

    public static void main(String[] args) {
        int num = random.nextInt(10);
        tryToGuess(num);

    }

    public static void tryToGuess(int num) {
        System.out.println("Итак, у вас есть 3 попытки угадать число от 0 до 9");
        for (int i = 0; i < 3; i++) {
            System.out.print("Введите число - ");
            int tryNum = sc.nextInt();
            if (tryNum == num) {
                System.out.println("Поздравляем, вы выиграли!");
                System.out.println("Хотите сыграть еще раз?");
                num = random.nextInt(10);
                playAgain(num);
                return;
            } else if (tryNum > num) {
                System.out.println("Загаданное число меньше");
            } else {
                System.out.println("Загаданное число больше");
            }
        }
        System.out.println("Очень жаль, но вы не угадали");
        System.out.println("Хотите сыграть еще раз?");
        num = random.nextInt(10);
        playAgain(num);
    }

    public static void playAgain(int num) {
        int answer;
        do {
            System.out.println("1 - да // 0 - нет");
            answer = sc.nextInt();
            if (answer == 1) {
                tryToGuess(num);
            } else if (answer == 0) {
                System.out.println("До новых встреч :)");
                sc.close();
                return;
            }
        } while (answer != 1 && answer != 0);
    }
}
