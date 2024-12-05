package at.bra.algodat.baseAlgorithm;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import at.bra.algodat.datagenerator.DataGenerator;

public class BaseAlgorithmTest {
    @Test
    void testRevert() {
        int[] data = DataGenerator.generateDataArray(5);
        int[] reversedData = BaseAlgorithm.revert(data);

        Assertions.assertEquals(data.length, reversedData.length);

        for (int i = 0; i < data.length; i++) {
            Assertions.assertEquals(data[i], reversedData[data.length - 1 - i]);
        }
    }

    @Test
    void testMax() {
        int[] data = DataGenerator.generateDataArray(10, 1, 100);
        int maxValue = BaseAlgorithm.max(data);

        int expectedMax = Integer.MIN_VALUE;
        for (int value : data) {
            expectedMax = Math.max(expectedMax, value);
        }
        Assertions.assertEquals(maxValue, expectedMax);
    }

    @Test
    void testMin() {
        int[] data = DataGenerator.generateDataArray(10, 1, 100);
        int minValue = BaseAlgorithm.min(data);

        int expectedMin = Integer.MAX_VALUE;
        for (int value : data) {
            expectedMin = Math.min(expectedMin, value);
        }
        Assertions.assertEquals(minValue, expectedMin);
    }
}
