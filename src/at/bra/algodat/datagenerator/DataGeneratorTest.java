package at.bra.algodat.datagenerator;

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

}
