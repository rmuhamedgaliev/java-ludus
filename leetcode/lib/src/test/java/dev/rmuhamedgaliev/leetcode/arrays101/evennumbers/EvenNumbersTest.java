package dev.rmuhamedgaliev.leetcode.arrays101.evennumbers;

import org.junit.jupiter.api.Test;

import static dev.rmuhamedgaliev.leetcode.arrays101.evennumbers.EvenNumbers.findNumbers;
import static org.junit.jupiter.api.Assertions.assertEquals;

class EvenNumbersTest {

    @Test
    void findNumbersFirst() {
        int[] nums = new int[]{12, 345, 2, 6, 7896};
        int expectedResult = 2;
        int result = findNumbers(nums);
        assertEquals(expectedResult, result);
    }

    @Test
    void findNumbersSecond() {
        int[] nums = new int[]{555, 901, 482, 1771};
        int expectedResult = 1;
        int result = findNumbers(nums);
        assertEquals(expectedResult, result);
    }
}