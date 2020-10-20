package dev.rmuhamedgaliev.leetcode.arrays101.duplicatezeros;

import org.junit.jupiter.api.Test;

import static dev.rmuhamedgaliev.leetcode.arrays101.duplicatezeros.DuplicateZeros.duplicateZeros;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class DuplicateZerosTest {

    @Test
    void duplicateZerosFirst() {
        int[] nums = new int[]{1, 0, 2, 3, 0, 4, 5, 0};
        int[] expectedResult = new int[]{1, 0, 0, 2, 3, 0, 0, 4};
        duplicateZeros(nums);
        assertArrayEquals(expectedResult, nums);
    }

    @Test
    void duplicateZerosSecond() {
        int[] nums = new int[]{1, 2, 3};
        int[] expectedResult = new int[]{1, 2, 3};
        duplicateZeros(nums);
        assertArrayEquals(expectedResult, nums);
    }
}