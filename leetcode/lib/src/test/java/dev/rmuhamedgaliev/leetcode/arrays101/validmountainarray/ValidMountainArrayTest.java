package dev.rmuhamedgaliev.leetcode.arrays101.validmountainarray;

import org.junit.jupiter.api.Test;

import static dev.rmuhamedgaliev.leetcode.arrays101.validmountainarray.ValidMountainArray.validMountainArray;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ValidMountainArrayTest {

    @Test
    void validMountainArrayFirst() {
        int[] nums = new int[]{2, 1};
        boolean result = validMountainArray(nums);
        assertFalse(result);
    }

    @Test
    void validMountainArraySecond() {
        int[] nums = new int[]{3, 5, 5};
        boolean result = validMountainArray(nums);
        assertFalse(result);
    }

    @Test
    void validMountainArrayThird() {
        int[] nums = new int[]{0, 3, 2, 1};
        boolean result = validMountainArray(nums);
        assertTrue(result);
    }

    @Test
    void validMountainArrayFour() {
        int[] nums = new int[]{1, 3, 2};
        boolean result = validMountainArray(nums);
        assertTrue(result);
    }

    @Test
    void validMountainArrayFive() {
        int[] nums = new int[]{2, 0, 2};
        boolean result = validMountainArray(nums);
        assertFalse(result);
    }

    @Test
    void validMountainArraySix() {
        int[] nums = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        boolean result = validMountainArray(nums);
        assertFalse(result);
    }

    @Test
    void validMountainArraySeven() {
        int[] nums = new int[]{0, 1, 2, 1, 2};
        boolean result = validMountainArray(nums);
        assertFalse(result);
    }
}