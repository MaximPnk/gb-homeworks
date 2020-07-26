package homework8.task1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[99999];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random()*100-50);
        }
        Arrays.sort(arr);
        System.out.printf("Минимальное значение = %d\n", arr[0]);
        if (arr.length % 2 == 1) {
            System.out.printf("Среднее значение = %d\n", arr[arr.length/2+1]);
        } else {
            System.out.printf("Средние значения = %d и %d\n", arr[arr.length/2], arr[arr.length/2+1]);
        }
        System.out.printf("Максимальное значение = %d", arr[arr.length-1]);
    }
}
