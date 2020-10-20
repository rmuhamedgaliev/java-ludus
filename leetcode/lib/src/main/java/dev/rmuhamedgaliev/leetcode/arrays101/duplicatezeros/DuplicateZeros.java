package dev.rmuhamedgaliev.leetcode.arrays101.duplicatezeros;

public class DuplicateZeros {

    public static void duplicateZeros(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                System.arraycopy(arr, i, arr, i + 1, arr.length - (i + 1));
                i = i + 1;
            }
        }
    }
}
