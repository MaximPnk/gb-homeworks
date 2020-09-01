package course3.homework1.task1and2;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        change();
        System.out.println();
        createList();
    }

    public static void change() {
        Integer[] a = new Integer[10];
        Arrays.fill(a, 10);
        a[3] = 5;
        System.out.println(Arrays.toString(a));
        a = new Changes().changePositions(a, 3, 9);
        System.out.println(Arrays.toString(a));

        String[] b = new String[5];
        Arrays.fill(b, "asd");
        b[0] = "dsa";
        System.out.println(Arrays.toString(b));
        b = new Changes().changePositions(b, 0, 2);
        System.out.println(Arrays.toString(b));
    }

    public static void createList() {
        Float[] f = new Float[10];
        Arrays.fill(f, 1.0f);
        ArrayList<Float> floats = new Changes().listFromArray(f);
        System.out.println(floats);
    }
}
