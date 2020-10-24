package dev.rmuhamedgaliev.search;

import java.util.Random;
import java.util.stream.IntStream;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {

    @Test
    void binarySearchTest() {
        int[] arr = IntStream.range(1, 100).toArray();

        int requiredValue = 4;

        assertEquals(requiredValue, ManualBinarySearch.binarySearch(arr, 5));
    }

    @Test
    void binarySearchUnsorted() {
        Random random = new Random();
        int[] arr = new int[100];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
        }

        int requiredValue = -1;

        assertEquals(requiredValue, ManualBinarySearch.binarySearch(arr, 5));
    }
}