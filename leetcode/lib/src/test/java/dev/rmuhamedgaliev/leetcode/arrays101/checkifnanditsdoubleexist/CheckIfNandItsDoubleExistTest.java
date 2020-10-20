package dev.rmuhamedgaliev.leetcode.arrays101.checkifnanditsdoubleexist;

import org.junit.jupiter.api.Test;

import static dev.rmuhamedgaliev.leetcode.arrays101.checkifnanditsdoubleexist.CheckIfNandItsDoubleExist.checkIfExist;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class CheckIfNandItsDoubleExistTest {

    @Test
    void checkIfExistFirst() {
        int[] nums = new int[]{10, 2, 5, 3};
        boolean result = checkIfExist(nums);
        assertTrue(result);
    }

    @Test
    void checkIfExistSecond() {
        int[] nums = new int[]{7, 1, 14, 11};
        boolean result = checkIfExist(nums);
        assertTrue(result);
    }

    @Test
    void checkIfExistThird() {
        int[] nums = new int[]{3, 1, 7, 11};
        boolean result = checkIfExist(nums);
        assertFalse(result);
    }
}