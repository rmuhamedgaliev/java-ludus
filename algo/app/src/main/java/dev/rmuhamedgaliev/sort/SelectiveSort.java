package dev.rmuhamedgaliev.sort;

public class SelectiveSort {

    public static int[] sort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            int minItemIndex = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    minItemIndex = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[minItemIndex];
            arr[minItemIndex] = temp;
        }

        return arr;
    }

}
