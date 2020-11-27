package dev.rmuhamedgaliev.sort;

import java.util.Arrays;
import java.util.Random;

public class Play {

    public static void main(String[] args) {
        int[] arr = new int[]{3, 2, 1, 0};

        sort(arr, 0, arr.length - 1);

        System.out.println(
            Arrays.toString(arr)
        );

        int requiredPosition = binarySearch(arr, 2);
        System.out.println(requiredPosition);

    }

    public static void sort(int[] arr, int low, int hight) {
        if (hight > low) {
            int index = part(arr, low, hight);
            sort(arr, low, index - 1);
            sort(arr, index, hight);
        }
    }

    public static int part(int[] arr, int low, int hight) {
        int pivotIndex = new Random().nextInt(hight);
        int pivot = arr[pivotIndex];

        while (hight >= low) {

            while (arr[low] < pivot) {
                low++;
            }

            while (arr[hight] > pivot) {
                hight--;
            }

            if (hight >= low) {
                int temp = arr[hight];
                arr[hight] = arr[low];
                arr[low] = temp;

                low++;
                hight--;
            }
        }

        return low;
    }

    public static int binarySearch(int[] arr, int requiredValue) {
        int foundedPosition = -1;
        int low = 0;
        int hight = arr.length - 1;
        while (low <= hight) {
            int mid = (low + hight) / 2;

            int checkedNumber = arr[mid];

            if (checkedNumber == requiredValue) {
                foundedPosition = mid;
                break;
            }

            if (checkedNumber > requiredValue) {
                hight = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return foundedPosition;
    }
}
