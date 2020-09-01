package course1.homework8.task1;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[10000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random()*100-50);
        }
        int min = arr[0];
        int max = arr[0];
        double mid = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
            mid += arr[i];
        }
        mid /= 1.0*arr.length;
        System.out.println("Minimum = " + min);
        System.out.printf("Average = %.2f\n", mid);
        System.out.println("Maximum = " + max);
    }
}
