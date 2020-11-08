package dev.rmuhamedgaliev.leetcode.arrays101.heightchecker;

import dev.rmuhamedgaliev.leetcode.arrays101.thirdmax.ThirdMax;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HeightCheckerTest {

    @Test
    void heightCheckerTest() {

        int[] nums = new int[]{3, 2, 1};
        int result = ThirdMax.thirdMax(nums);

        int expectedResult = 1;

        assertEquals(expectedResult, result);
    }
}