package homework2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //task 1 version 1
        int[] arrayForChange = { 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 };
        for (int i = 0; i < arrayForChange.length; i++) {
            if (arrayForChange[i] == 1) {
                arrayForChange[i] = 0;
            } else {
                arrayForChange[i] = 1;
            }
        }

        //task 1 version 2
        int[] arrayForChange2 = { 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 };
        for (int i = 0; i < arrayForChange2.length; i++) {
            arrayForChange2[i] = arrayForChange2[i] == 1 ? 0 : 1;
        }

        //task 2
        int[] arrayOfMultiple3Numbers = new int[8];
        for (int i = 0, j = 0; j < arrayOfMultiple3Numbers.length; i++) {
            if (i % 3 == 0) {
                arrayOfMultiple3Numbers[j] = i;
                j++;
            }
        }

        //task 3
        int[] arrayForMultiply = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        for (int i = 0; i < arrayForMultiply.length; i++) {
            if (arrayForMultiply[i] < 6) {
                arrayForMultiply[i] *= 2;
            }
        }

        //task 4
        int[][] doubleArray = new int[9][9];
        for (int i = 0; i < doubleArray.length; i++) {
            for (int j = 0; j < doubleArray[i].length; j++) {
                if (i == j || i + j == doubleArray.length - 1) {
                    doubleArray[i][j] = 1;
                }
            }

        }

        //task 5
        int[] arrayMinMax = { 1, 2, 3, -3, -4, 0, 5 };
        int minNum = Integer.MAX_VALUE;
        int maxNum = Integer.MIN_VALUE;
        for (int i = 0; i < arrayMinMax.length; i++) {
            if (minNum > arrayMinMax[i]) {
                minNum = arrayMinMax[i];
            }
            if (maxNum < arrayMinMax[i]) {
                maxNum = arrayMinMax[i];
            }
        }

        //task 6
        int[] arrayBalance = { 1, 2, 6, 4, -2, 3, 0, 3, 5, 9, 2, 29 };
        boolean isArrayBalanced = checkBalance(arrayBalance);

        //task 7
        int[] arrayForDisplace = { 1, 3, 5, 7, 9, -1, -3, -5, -7, -9 };
        int n = 5;
        arrayForDisplace = displaceArray(arrayForDisplace, n);
    }

    //method for task 6
    public static boolean checkBalance(int[] someArray) {
        int left = 0, right = 0;
        for (int j = 0; j < someArray.length; j++) {
            right += someArray[j];
        }
        for (int i = 0; i < someArray.length; i++) {
            left += someArray[i];
            right -= someArray[i];
            if (left == right) {
                return true;
            }
        }
        return false;
    }

    //method for task 7
    public static int[] displaceArray(int[] someArray, int n) {
        if (n < 0) {
            n = -n;
            for (int i = 0; i < n; i++) {
                int someArrayFirst = someArray[0];
                for (int j = 0; j < someArray.length; j++) {
                    if (j == someArray.length - 1) {
                        someArray[j] = someArrayFirst;
                    } else {
                        someArray[j] = someArray[j + 1];
                    }
                }
            }
        } else if (n > 0) {
            for (int i = 0; i < n; i++) {
                int someArrayLast = someArray[someArray.length - 1];
                for (int j = someArray.length - 1; j >= 0; j--) {
                    if (j == 0) {
                        someArray[j] = someArrayLast;
                    } else {
                        someArray[j] = someArray[j - 1];
                    }
                }

            }
        }
        return someArray;
    }
}
