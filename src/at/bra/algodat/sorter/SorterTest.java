package at.bra.algodat.sorter;

import java.util.Random;

public class SorterTest {

    public static void main(String[] args) {
        int numberOfElements = 100000;

        int[] randomNumbers = generateRandomNumbers(numberOfElements);

        Sorter sorter = new SelectionSorter();

        long startTime = System.nanoTime();

        sorter.sort(randomNumbers);

        long endTime = System.nanoTime();

        long duration = (endTime - startTime) / 1000000;

        System.out.println("Zeit zum Sortieren von " + numberOfElements + " Zahlen: " + duration + " Millisekunden");
    }

    public static int[] generateRandomNumbers(int size) {
        int[] array = new int[size];
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(1000);
        }

        return array;
    }
}
