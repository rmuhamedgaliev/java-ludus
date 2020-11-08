package dev.rmuhamedgaliev.leetcode.arrays101.sortarraybyparity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SortArrayByParityTest {

    @Test
    void sortArrayByParityTest() {
        int[] nums = new int[]{3, 1, 2, 4};
        int[] output = SortArrayByParity.sortArrayByParity(nums);

        int[] expectedResult = new int[]{2, 4, 3, 1};

        assertArrayEquals(expectedResult, output);
    }
}