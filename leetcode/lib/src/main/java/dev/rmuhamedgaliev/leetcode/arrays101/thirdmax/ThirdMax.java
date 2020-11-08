package dev.rmuhamedgaliev.leetcode.arrays101.thirdmax;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ThirdMax {

    public static int thirdMax(int[] nums) {
        int index = 0;
        long[] result = {Long.MIN_VALUE, Long.MIN_VALUE, Long.MIN_VALUE};

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > result[0]) {
                result[2] = result[1];
                result[1] = result[0];
                result[0] = nums[i];
                index++;
            } else if (nums[i] > result[1] && nums[i] < result[0]) {
                result[2] = result[1];
                result[1] = nums[i];
                index++;
            } else if (nums[i] > result[2] && nums[i] < result[1]) {
                result[2] = nums[i];
                index++;
            }
        }
        return index > 2 ? (int) result[2] : (int) result[0];
    }
}
