package homework3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class task2 {

    public static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {

        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        Random random = new Random();
        int ourWordNum = random.nextInt(words.length); //получили рандомный номер
        String guessedWord = words[0];
        for (int i = 0; i < words.length; i++) { //присвоили переменной строку массива с рандомным номером
            if (i == ourWordNum) {
                guessedWord = words[i];
            }
        }
        System.out.println("Попробуйте угадать слово из данного списка:");
        System.out.println(Arrays.toString(words));
        tryToGuessTheWord(guessedWord);

    }

    public static void tryToGuessTheWord(String guessedWord) {
        //для вывода ответа используем массив char
        char[] printedWord = {'#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#'};
        do {
            System.out.print("Угадайте слово - ");
            String typedWord = sc.next();
            if (typedWord.equals(guessedWord)) {
                System.out.println("Поздравляем, Вы угадали!");
                sc.close();
                return;
            } else if (typedWord.length() < guessedWord.length()) { //если введенное слово меньше загаданного
                for (int i = 0; i < typedWord.length(); i++) {
                    if (typedWord.charAt(i) == guessedWord.charAt(i)) {
                        printedWord[i] = guessedWord.charAt(i);
                    }
                }
            } else {
                for (int i = 0; i < guessedWord.length(); i++) { //если введенное слово больше загаданного
                    if (typedWord.charAt(i) == guessedWord.charAt(i)) {
                        printedWord[i] = guessedWord.charAt(i);
                    }
                }
            }
            for (int i = 0; i < printedWord.length - 1; i++) {
                System.out.print(printedWord[i]);
            }
            System.out.println("");
        } while (true);

    }
}
