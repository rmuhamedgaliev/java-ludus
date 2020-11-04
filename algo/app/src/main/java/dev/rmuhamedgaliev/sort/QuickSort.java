package dev.rmuhamedgaliev.sort;

import java.util.Random;

public class QuickSort {

    public static void sort(int[] arr, int leftIndex, int rightIndex) {
        if (rightIndex > leftIndex) {
            int index = part(arr, leftIndex, rightIndex);
            sort(arr, leftIndex, index - 1);
            sort(arr, index, rightIndex);
        }
    }

    private static int part(int[] arr, int leftIndex, int rightIndex) {
        int pivotIndex = new Random().nextInt(arr.length);
        int pivot = arr[pivotIndex];

        while (rightIndex >= leftIndex) {

            while (arr[rightIndex] > pivot) {
                rightIndex--;
            }

            while (arr[leftIndex] < pivot) {
                leftIndex++;
            }

            if (rightIndex >= leftIndex) {
                int temp = arr[leftIndex];
                arr[leftIndex] = arr[rightIndex];
                arr[rightIndex] = temp;

                rightIndex--;
                leftIndex++;
            }
        }

        return leftIndex;
    }
}
