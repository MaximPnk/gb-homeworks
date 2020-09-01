package course3.homework1.task1and2;

import java.util.ArrayList;
import java.util.Arrays;

public class Changes {

    public <T> T[] changePositions (T[] array, int from, int to) {
        T tmp = array[from];
        array[from] = array[to];
        array[to] = tmp;
        return array;
    }

    public <T> ArrayList<T> listFromArray (T[] array) {
        return new ArrayList<>(Arrays.asList(array));
    }
}
