package dev.rmuhamedgaliev.leetcode.arrays101.squaresofasortedarray;

// Given an array of integers A sorted in non-decreasing order, return an array of the squares of each number, also in sorted non-decreasing order.

import java.util.Arrays;

public class SquaresofaSortedArray {

    public static int[] sortedSquares(int[] A) {

        int[] result = new int[A.length];

        for (int i = 0; i < A.length; i++) {
            int number = A[i];
            result[i] = number * number;
        }

        Arrays.sort(result);

        return result;
    }
}
