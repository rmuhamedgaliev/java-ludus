package dev.rmuhamedgaliev.leetcode.arrays101.maxconsecutiveones;

// Given a binary array, find the maximum number of consecutive 1s in this array.

public class MaxConsecutiveOnes {

    public static int findMaxConsecutiveOnes(int[] nums) {

        int maxConsecutiveOnes = 0;

        int counter = 0;
        for (int num : nums) {
            if (num == 1) {
                counter++;
            } else {
                counter = 0;
            }

            if (counter > maxConsecutiveOnes) {
                maxConsecutiveOnes = counter;
            }
        }

        return maxConsecutiveOnes;
    }

}
