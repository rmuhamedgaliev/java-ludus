package dev.rmuhamedgaliev.leetcode.problems;

/**
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 * <p>
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * <p>
 * You can return the answer in any order.
 */

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        int complement;
        for (int x = 0; x < nums.length; x++) {
            complement = target - nums[x];
            for (int y = 0; y < nums.length; y++) {
                if (x == y) {
                    continue;
                }
                if (nums[y] == complement) {
                    return new int[]{x, y};
                }
            }
        }
        return new int[]{0, 0};
    }
}
