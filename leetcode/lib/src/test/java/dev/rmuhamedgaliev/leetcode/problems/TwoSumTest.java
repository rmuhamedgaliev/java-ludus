package dev.rmuhamedgaliev.leetcode.problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class TwoSumTest {

    private final TwoSum twoSum = new TwoSum();

    @Test
    void firstTest() {
        int[] numbers = new int[]{2, 7, 11, 15};
        int target = 9;

        int[] result = twoSum.twoSum(numbers, target);

        assertArrayEquals(new int[]{0, 1}, result);
    }

    @Test
    void secondTest() {
        int[] numbers = new int[]{3, 2, 4};
        int target = 6;

        int[] result = twoSum.twoSum(numbers, target);

        assertArrayEquals(new int[]{1, 2}, result);
    }

    @Test
    void thirdTest() {
        int[] numbers = new int[]{3, 3};
        int target = 6;

        int[] result = twoSum.twoSum(numbers, target);

        assertArrayEquals(new int[]{0, 1}, result);
    }
}