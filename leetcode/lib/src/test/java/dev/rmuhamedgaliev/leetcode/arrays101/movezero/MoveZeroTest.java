package dev.rmuhamedgaliev.leetcode.arrays101.movezero;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoveZeroTest {

    @Test
    void moveZeroesTest() {
        int[] arr = new int[]{0, 1};

        MoveZero.moveZeroes(arr);
        int[] expected = new int[]{1, 0};


        assertArrayEquals(expected, arr);
    }

    @Test
    void moveZeroesSecond() {
        int[] arr = new int[]{0, 1, 0};

        MoveZero.moveZeroes(arr);
        int[] expected = new int[]{1, 0, 0};


        assertArrayEquals(expected, arr);
    }
}