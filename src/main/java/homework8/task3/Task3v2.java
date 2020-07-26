package homework8.task3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Task3v2 {
    public static void main(String[] args) {

        //через список

        int[] numArray = new int[1000];
        ArrayList<Integer> numList = new ArrayList<>();
        int value = 5;
        System.out.println("Array's length at start " + numArray.length);

        for (int i = 0; i < numArray.length; i++) {
            numArray[i] = (int) (Math.random() * 10);
            numList.add(numArray[i]);
        }

        for (int i = 0; i < numList.size(); i++) {
            if (numList.get(i).equals(value)) {
                numList.remove(i);
                i--;
            }
        }

        numArray = new int[numList.size()];
        for (int i = 0; i < numArray.length; i++) {
            numArray[i] = numList.get(i);
        }
        System.out.println("Array's length at finish " + numArray.length);
    }
}
