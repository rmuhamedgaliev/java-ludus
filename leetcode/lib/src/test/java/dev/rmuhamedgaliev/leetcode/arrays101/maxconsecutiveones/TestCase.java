package dev.rmuhamedgaliev.leetcode.arrays101.maxconsecutiveones;

import java.util.Arrays;
import java.util.Random;

public class TestCase {

    private final int[] input;
    private final int output;

    public TestCase(int capacity) {
        this.input = generateRandomNums(capacity);


        this.output = MaxConsecutiveOnes.findMaxConsecutiveOnes(this.input);
    }

    private static int[] generateRandomNums(int capacity) {
        int[] nums = new int[capacity];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = new Random().nextInt(2);
        }

        return nums;
    }

    public int[] getInput() {
        return input;
    }

    public int getOutput() {
        return output;
    }

    public void printQuestion() {
        String question = "Input: " + Arrays.toString(input) + "\nOutput: " + output;
        System.out.println(question);
    }
}
