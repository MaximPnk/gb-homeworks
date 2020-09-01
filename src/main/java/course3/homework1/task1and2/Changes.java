package course3.homework1.task1and2;

import java.util.ArrayList;
import java.util.Arrays;

public class Changes {

    public <T> void changePositions (T[] array, int from, int to) {
        T tmp = array[from];
        array[from] = array[to];
        array[to] = tmp;
    }

    public <T> ArrayList<T> listFromArray (T[] array) {
        ArrayList<T> list = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            list.add(array[i]);
        }
        return list;
    }
}
