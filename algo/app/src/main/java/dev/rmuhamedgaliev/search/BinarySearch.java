package dev.rmuhamedgaliev.search;

public class BinarySearch {

    public static int binarySearch(int[] arr, int requiredValue) {
        int foundedPosition = -1;
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int checkedNumber = arr[mid];
            if (checkedNumber == requiredValue) {
                foundedPosition = mid;
                break;
            }

            if (checkedNumber > requiredValue) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return foundedPosition;
    }

}
