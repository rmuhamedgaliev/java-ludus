package dev.rmuhamedgaliev.leetcode.arrays101.replaceelementswithgreatestelementonrightside;

// Given an array arr, replace every element in that array with the greatest element among the elements to its right, and replace the last element with -1.

public class ReplaceElementswithGreatestElementonRightSide {

    public static int[] replaceElements(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            int[] tempArr = new int[arr.length - i];
            System.arraycopy(arr, i + 1, tempArr, 0, tempArr.length - 1);
            int nextMax = tempArr[0];

            for (int j = 1; j < tempArr.length; j++) {
                if (nextMax < tempArr[j]) {
                    nextMax = tempArr[j];
                }
            }

            arr[i] = nextMax;
        }

        arr[arr.length - 1] = -1;

        return arr;
    }
}
