package Course2.homework3;

import java.util.*;

public class Task1 {

    public static void main(String[] args) {
        String[] arrayOfWords = createArrayOfWords();
        Set<String> setOfWords = convertArrayToSet(arrayOfWords);
        setOfWordsToConsole(setOfWords);
        System.out.println();
        checkWordsRepeating(arrayOfWords);
    }

    public static String[] createArrayOfWords() {
        String[] array = new String[25];
        int number = 1;
        for (int i = 0; i < array.length; i++) {
            array[i] = "Word #" + number++;
            if (number % 11 == 0) {
                number = 1;
            }
        }
        return array;
    }

    public static Set<String> convertArrayToSet(String[] array) {
        return new HashSet<>(Arrays.asList(array));
    }

    public static void setOfWordsToConsole(Set<String> set) {
        for (String word: set) {
            System.out.println(word);
        }
    }

    public static void checkWordsRepeating(String[] array) {
        Set<String> set = convertArrayToSet(array);
        for (String word : set) {
            int count = 0;
            for (String s : array) {
                if (word.equals(s)) {
                    count++;
                }
            }
            System.out.printf("%-10s%d\n", word, count);
        }
    }


}
