package dev.rmuhamedgaliev.recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumArrayTest {

    @Test
    void sumArrayTest() {
        int[] arr = new int[]{1, 2, 3};
        int expectedResult = 6;
        int result = SumArray.sumArray(arr, 0);
        assertEquals(expectedResult, result);
    }
}