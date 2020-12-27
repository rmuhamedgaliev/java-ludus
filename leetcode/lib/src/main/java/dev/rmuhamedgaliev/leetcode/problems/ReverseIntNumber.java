package dev.rmuhamedgaliev.leetcode.problems;

//Given a 32-bit signed integer, reverse digits of an integer.
//
//    Note:
//    Assume we are dealing with an environment that could only store integers within the 32-bit signed integer range: [−231,  231 − 1]. For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.

public class ReverseIntNumber {
    public int reverse(int x) {
        if (x == 0 || x >= Math.pow(2, 31) - 1 || x <= -Math.pow(2, 31)) return 0;

        long reversed = 0;

        while (x != 0) {

            int digit = x % 10;

            reversed = reversed * 10 + digit;

            x /= 10;
        }

        if (reversed >= Math.pow(2, 31) - 1 || reversed <= -Math.pow(2, 31)) return 0;

        return Math.toIntExact(reversed);
    }
}
