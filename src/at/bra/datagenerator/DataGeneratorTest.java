package at.bra.datagenerator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DataGeneratorTest {

    @Test
    void testGenerateDataArray() {
        int[] randomArray = DataGenerator.generateDataArray(10);
        Assertions.assertEquals(randomArray.length, 10);
    }

    @Test
    void testGenerateDataArray2() {
        int[] randomArray = DataGenerator.generateDataArray(10, 10, 20);
        Assertions.assertEquals(randomArray.length, 10);
        for (int value : randomArray) {
            Assertions.assertTrue(value >= 10 && value <= 20);
        }
    }

    @Test
    void testPrintArray() {
        int[] randomArray = DataGenerator.generateDataArray(5, 1, 10);
        Assertions.assertDoesNotThrow(() -> DataGenerator.printArray(randomArray));
    }

    @Test
    void testRevert() {
        int[] data = DataGenerator.generateDataArray(5);
        int[] reversedData = DataGenerator.revert(data);

        Assertions.assertEquals(data.length, reversedData.length);

        for (int i = 0; i < data.length; i++) {
            Assertions.assertEquals(data[i], reversedData[data.length - 1 - i]);
        }
    }

    @Test
    void testMax() {
        int[] data = DataGenerator.generateDataArray(10, 1, 100);
        int maxValue = DataGenerator.max(data);

        int expectedMax = Integer.MIN_VALUE;
        for (int value : data) {
            expectedMax = Math.max(expectedMax, value);
        }
        Assertions.assertEquals(maxValue, expectedMax);
    }

    @Test
    void testMin() {
        int[] data = DataGenerator.generateDataArray(10, 1, 100);
        int minValue = DataGenerator.min(data);

        int expectedMin = Integer.MAX_VALUE;
        for (int value : data) {
            expectedMin = Math.min(expectedMin, value);
        }
        Assertions.assertEquals(minValue, expectedMin);
    }

}
