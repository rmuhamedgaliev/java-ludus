package dev.rmuhamedgaliev.leetcode.arrays101.replaceelementswithgreatestelementonrightside;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ReplaceElementswithGreatestElementonRightSideTest {

    @Test
    void replaceElementsTest() {
        int[] arr = new int[]{17, 18, 5, 4, 6, 1};
        int[] resultArray = new int[]{18, 6, 6, 6, 1, -1};
        arr = ReplaceElementswithGreatestElementonRightSide.replaceElements(arr);
        assertArrayEquals(resultArray, arr);
    }

    @Test
    void replaceElementsFirstTest() {
        int[] arr = new int[]{56903, 18666, 60499, 57517, 26961};
        int[] resultArray = new int[]{60499, 60499, 57517, 26961, -1};
        arr = ReplaceElementswithGreatestElementonRightSide.replaceElements(arr);
        assertArrayEquals(resultArray, arr);
    }
}