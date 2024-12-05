package at.bra.algodat;

import at.bra.algodat.datagenerator.DataGenerator;

public class Main {
    public static void main(String[] args) {
        DataGenerator generator = new DataGenerator();

        System.out.println("Original Array:");
        int[] numbers = generator.generateDataArray(9, 1, 100);
        generator.printArray(numbers);

        // TEst
    }
}
