package dev.rmuhamedgaliev.leetcode.arrays101.heightchecker;

import java.util.Random;

public class HeightChecker {

    public static int heightChecker(int[] heights) {

        int countOfSort = 0;

        int[] sortedHiegt = new int[heights.length];
        System.arraycopy(heights, 0, sortedHiegt, 0, heights.length);

        quickSort(sortedHiegt, 0, sortedHiegt.length - 1);

        for (int i = 0; i <heights.length; i++) {
            if (heights[i] != sortedHiegt[i]) {
                countOfSort++;
            }
        }

        return countOfSort;
    }

    private static void quickSort(int[] arr, int low, int height) {
        if (height > low) {
            int index = part(arr, low, height);
            quickSort(arr, low, index - 1);
            quickSort(arr, index, height);
        }
    }

    private static int part(int[] arr, int low, int hight) {
        int pivotIndex = new Random().nextInt(arr.length - 1);
        int pivot = arr[pivotIndex];

        while (hight >= low) {

            while (arr[low] < pivot) {
                low++;
            }

            while (arr[hight] > pivot) {
                hight--;
            }

            if (hight >= low) {
                int temp = arr[low];
                arr[low] = arr[hight];
                arr[hight] = temp;

                low++;
                hight--;
            }

        }

        return low;
    }
}
