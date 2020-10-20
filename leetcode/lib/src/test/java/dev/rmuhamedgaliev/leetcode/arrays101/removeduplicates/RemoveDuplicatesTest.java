package dev.rmuhamedgaliev.leetcode.arrays101.removeduplicates;

import org.junit.jupiter.api.Test;

import static dev.rmuhamedgaliev.leetcode.arrays101.removeduplicates.RemoveDuplicates.removeDuplicates;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class RemoveDuplicatesTest {

    @Test
    void removeDuplicatesFirst() {
        int[] nums = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int output = removeDuplicates(nums);

        int[] expectedResult = new int[]{0, 1, 2, 3, 4};

        assertArrayEquals(expectedResult, nums);
        assertEquals(2, output);
    }
}