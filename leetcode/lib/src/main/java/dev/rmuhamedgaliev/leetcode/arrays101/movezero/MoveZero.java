package dev.rmuhamedgaliev.leetcode.arrays101.movezero;

public class MoveZero {
    public static void moveZeroes(int[] nums) {

        int zeroIndex = 0;

        for (int num : nums) {
            if (num == 0) {
                zeroIndex++;
            }
        }

        if (zeroIndex > 0) {
            int nonZeroIndex = 0;

            for (int i = 0; i < nums.length; i++) {
                if (nums[i] != 0) {
                    nonZeroIndex++;
                    nums[nonZeroIndex - 1] = nums[i];
                }
            }

            while (zeroIndex != 0) {
                nums[nums.length - zeroIndex] = 0;
                zeroIndex--;
            }
        }


    }
}
