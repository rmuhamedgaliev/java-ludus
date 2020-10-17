package dev.rmuhamedgaliev.leetcode.arrays101.maxconsecutiveones;

import org.junit.jupiter.api.Test;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.OutputTimeUnit;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;
import org.openjdk.jmh.runner.options.TimeValue;

import java.util.concurrent.TimeUnit;

import static dev.rmuhamedgaliev.leetcode.arrays101.maxconsecutiveones.MaxConsecutiveOnes.findMaxConsecutiveOnes;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaxConsecutiveOnesTest {

    @Test
    public void prepareJMH() throws RunnerException {
        Options options = new OptionsBuilder()
                .include(this.getClass().getName() + ".*")
                .mode(Mode.AverageTime)
                .warmupTime(TimeValue.seconds(1))
                .warmupIterations(2)
                .threads(20)
                .measurementIterations(2)
                .forks(1)
                .shouldFailOnError(true)
                .shouldDoGC(true)
                .build();

        new Runner(options).run();
    }

    @Benchmark
    @OutputTimeUnit(TimeUnit.MILLISECONDS)
    public void findMaxConsecutiveOnesFirst() {
        int[] nums = new int[]{1, 1, 0, 1, 1, 1};
        int expectedResult = 3;
        int result = findMaxConsecutiveOnes(nums);
        assertEquals(expectedResult, result);
    }

    @Benchmark
    @OutputTimeUnit(TimeUnit.MILLISECONDS)
    public void findMaxConsecutiveOnesSecond() {
        int[] nums = new int[]{1, 0, 1, 1, 0, 1};
        int expectedResult = 2;
        int result = findMaxConsecutiveOnes(nums);
        assertEquals(expectedResult, result);
    }

    @Benchmark
    @OutputTimeUnit(TimeUnit.MILLISECONDS)
    public void findMaxConsecutiveOnesThird() {
        try {
            TestCase testCase = new TestCase(100);
            int[] nums = testCase.getInput();
            int expectedResult = testCase.getOutput();
            int result = findMaxConsecutiveOnes(nums);
            assertEquals(expectedResult, result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}