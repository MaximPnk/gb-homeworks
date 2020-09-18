package course3.homework6;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class TestsTest {

    @Test
    void afterFour() {
        int[] first = {5, 3};
        int[] second = new int[0];

        assertArrayEquals(first, Tests.afterFour(new int[]{4, 3, 2, 4, 5, 3}));
        assertArrayEquals(second, Tests.afterFour(new int[]{3, 5, 6, 7, 5, 3, 2, 1, 2, 0, 4}));
        assertThrows(RuntimeException.class, () -> Tests.afterFour(new int[]{3, 5, 7, 0}));
    }


    @Test
    void containsOneAndFour() {
        int[] first = {}; //false
        int[] second = {1, 3, 5, 7, 9}; //false
        int[] third = {9, 3, 0, -3, 4}; //false
        int[] forth = {0, 0, 0, 4, 1}; //true
        int[] fifth = {1, 1, 1, 1, 1, 4, 4, 4}; //true

        assertNotEquals(true, Tests.containsOneAndFour(first));
        assertNotEquals(true, Tests.containsOneAndFour(second));
        assertEquals(false, Tests.containsOneAndFour(third));
        assertEquals(true, Tests.containsOneAndFour(forth));
        assertEquals(true, Tests.containsOneAndFour(fifth));
    }
}