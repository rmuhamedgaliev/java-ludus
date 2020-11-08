package dev.rmuhamedgaliev.leetcode.arrays101.sortarraybyparity;

public class SortArrayByParity {

    public static int[] sortArrayByParity(int[] A) {

        int replacedIndex = 0;

        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 == 0) {
                int temp = A[replacedIndex];
                A[replacedIndex] = A[i];
                A[i] = temp;
                replacedIndex++;
            }
        }

        return A;
    }
}
