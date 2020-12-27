package dev.rmuhamedgaliev.leetcode.problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseIntNumberTest {

    private final ReverseIntNumber reverseIntNumber = new ReverseIntNumber();

    @Test
    void reverseTest() {
//        chekReverse(123, 321);
//        chekReverse(-123, -321);
//        chekReverse(120, 21);
//        chekReverse(0, 0);
        chekReverse(1534236469, 0);
        chekReverse(-2147483648, 0);
    }

    private void chekReverse(int source, int expected) {
        int reversedNumber = reverseIntNumber.reverse(source);
        assertEquals(expected, reversedNumber);
    }
}
