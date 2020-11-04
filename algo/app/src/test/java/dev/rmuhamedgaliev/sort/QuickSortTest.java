package dev.rmuhamedgaliev.sort;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuickSortTest {

    @Test
    void sortTest() {
        int[] arr = new int[]{5, 3, 6, 2, 10};
        QuickSort.sort(arr, 0, arr.length - 1);
        int[] expectedResult = new int[]{2, 3, 5, 6, 10};
        assertArrayEquals(expectedResult, arr);
    }
}