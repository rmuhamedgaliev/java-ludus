package dev.rmuhamedgaliev.leetcode.arrays101.mergesortedarray;

import org.junit.jupiter.api.Test;

import static dev.rmuhamedgaliev.leetcode.arrays101.mergesortedarray.MergeSortedArray.merge;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class MergeSortedArrayTest {

    @Test
    void mergeFirst() {
        int[] nums1 = new int[]{1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = new int[]{2, 5, 6};
        int n = 3;
        int[] expectedResult = new int[]{1, 2, 2, 3, 5, 6};
        merge(nums1, m, nums2, n);
        assertArrayEquals(expectedResult, nums1);
    }

    @Test
    void mergeSecond() {
        int[] nums1 = new int[]{0};
        int m = 0;
        int[] nums2 = new int[]{1};
        int n = 1;
        int[] expectedResult = new int[]{1};
        merge(nums1, m, nums2, n);
        assertArrayEquals(expectedResult, nums1);
    }

    @Test
    void mergeThird() {
        int[] nums1 = new int[]{4, 0, 0, 0, 0, 0};
        int m = 1;
        int[] nums2 = new int[]{1, 2, 3, 5, 6};
        int n = 5;
        int[] expectedResult = new int[]{1, 2, 3, 4, 5, 6};
        merge(nums1, m, nums2, n);
        assertArrayEquals(expectedResult, nums1);
    }
}