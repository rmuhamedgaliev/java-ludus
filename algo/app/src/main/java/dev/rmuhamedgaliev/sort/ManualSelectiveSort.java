package dev.rmuhamedgaliev.sort;

public class ManualSelectiveSort {

    public static int[] sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int minidex = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minidex]) {
                    minidex = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[minidex];
            arr[minidex] = temp;
        }
        return arr;
    }
}
