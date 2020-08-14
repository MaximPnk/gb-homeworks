package Course2.homework5;

import java.util.Arrays;

public class Main {
    static final int SIZE = 10000000;
    static final int HALF = SIZE / 2;
    static float[] arr = new float[SIZE];

    public static void main(String[] args) {
        System.out.println("Время работы одного потока: " + timeByOneThread());
        System.out.println("Время работы двух потоков: " + timeByTwoThreads());
    }

    public static long timeByOneThread() {
        Arrays.fill(arr, 1);
        long start = System.currentTimeMillis();
        addValues(arr);
        return System.currentTimeMillis() - start;
    }

    public static long timeByTwoThreads() {
        Arrays.fill(arr, 1);
        float[] part1 = new float[HALF], part2 = new float[HALF];

        long start = System.currentTimeMillis();
        System.arraycopy(arr, 0, part1, 0, HALF);
        System.arraycopy(arr, HALF, part2, 0, HALF);

        Thread first = new Thread(() -> addValues(part1));
        Thread second = new Thread(() -> addValues(part2));
        first.start();
        second.start();

        while (first.isAlive() || second.isAlive()) {}
        System.arraycopy(part1, 0, arr, 0, HALF);
        System.arraycopy(part2, 0, arr, HALF, HALF);
        return System.currentTimeMillis() - start;
    }

    public static void addValues(float[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
    }
}
