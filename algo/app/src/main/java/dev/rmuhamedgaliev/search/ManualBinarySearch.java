package dev.rmuhamedgaliev.search;

public class ManualBinarySearch {

    public static int binarySearch(int[] arr, int item) {
        int low = 0;
        int high = arr.length - 1;

        int position = -1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == item) {
                position = mid;
                break;
            }

            if (arr[mid] < item) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return position;
    }
}
