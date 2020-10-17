package dev.rmuhamedgaliev.leetcode.arrays101.squaresofasortedarray;

import org.junit.jupiter.api.Test;

import static dev.rmuhamedgaliev.leetcode.arrays101.squaresofasortedarray.SquaresofaSortedArray.sortedSquares;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SquaresofaSortedArrayTest {

    @Test
    void sortedSquaresFirst() {
        int[] nums = new int[]{-4, -1, 0, 3, 10};
        int[] expectedResult = new int[]{0, 1, 9, 16, 100};
        int[] result = sortedSquares(nums);
        assertArrayEquals(expectedResult, result);
    }

    @Test
    void sortedSquaresSecond() {
        int[] nums = new int[]{-7, -3, 2, 3, 11};
        int[] expectedResult = new int[]{4, 9, 9, 49, 121};
        int[] result = sortedSquares(nums);
        assertArrayEquals(expectedResult, result);
    }
}