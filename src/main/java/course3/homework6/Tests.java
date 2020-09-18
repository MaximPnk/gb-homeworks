package course3.homework6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Tests {

    public static void main(String[] args) {
        int[] array = { 1, 2, 4, 4, 2, 3, 4, 1, 7 };
        int[] res = afterFour(array);
        System.out.println(Arrays.toString(res));
    }

    public static int[] afterFour(int[] array) {
        int index = -1;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 4) {
                index = i;
            }
        }
        if (index == -1) {
            throw new RuntimeException();
        }
        int[] result = new int[array.length - index - 1];
        for (int i = index+1, j = 0; i < array.length; i++, j++) {
            result[j] = array[i];
        }
        return result;

    }

    public static boolean containsOneAndFour(int[] array) {
        int indexOne = -1;
        int indexFour = -1;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                indexOne = i;
            } else if (array[i] == 4) {
                indexFour = i;
            }
        }

        return indexOne > 0 && indexFour > 0;
    }
}
