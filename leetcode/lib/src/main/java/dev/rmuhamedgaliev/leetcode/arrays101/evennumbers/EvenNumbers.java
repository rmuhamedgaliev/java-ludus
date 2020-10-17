package dev.rmuhamedgaliev.leetcode.arrays101.evennumbers;

public class EvenNumbers {

    public static int findNumbers(int[] nums) {

        int counter = 0;

        for (int num : nums) {
            if (String.valueOf(num).length() % 2 == 0) {
                counter++;
            }
        }

        return counter;
    }
}
