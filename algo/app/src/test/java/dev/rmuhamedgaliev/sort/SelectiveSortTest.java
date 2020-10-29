package dev.rmuhamedgaliev.sort;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SelectiveSortTest {

    @Test
    public void sortTest() {
        int[] arr = new int[]{5, 3, 6, 2, 10};
        int[] result = SelectiveSort.sort(arr);
        int[] expectedResult = new int[]{2, 3, 5, 6, 10};
        assertArrayEquals(expectedResult, result);
    }

    @Test
    public void manualSortTest() {
        int[] arr = new int[]{5, 3, 6, 2, 10};
        int[] result = ManualSelectiveSort.sort(arr);
        int[] expectedResult = new int[]{2, 3, 5, 6, 10};
        assertArrayEquals(expectedResult, result);
    }
}