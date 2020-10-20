package dev.rmuhamedgaliev.leetcode.arrays101.removeelement;

import org.junit.jupiter.api.Test;

import static dev.rmuhamedgaliev.leetcode.arrays101.removeelement.RemoveElement.removeElement;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class RemoveElementTest {

    @Test
    void removeElementFirst() {
        int[] nums = new int[]{3, 2, 2, 3};
        int value = 3;
        int output = removeElement(nums, value);

        int[] expectedResult = new int[]{2, 2};

        assertArrayEquals(expectedResult, nums);
        assertEquals(2, output);
    }
}