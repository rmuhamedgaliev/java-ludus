package dev.rmuhamedgaliev.recursion;

public class SumArray {

    public static int sumArray(int[] arr, int result) {
        System.out.println(result);
        if (arr.length == 0) return 0;
        if (arr.length == 1) {
            result += arr[0];
            return result;
        } else {
            result += arr[0];
            int[] newArr = new int[arr.length - 1];
            System.arraycopy(arr, 1, newArr, 0, newArr.length);
            result = sumArray(newArr, result);
        }

        return result;
    }
}
