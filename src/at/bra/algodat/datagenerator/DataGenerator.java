package at.bra.algodat.datagenerator;

import java.util.Random;

public class DataGenerator {
    public static int[] generateDataArray(int size) {
        Random random = new Random();
        int[] dataArray = new int[size];
        for (int i = 0; i < size; i++) {
            dataArray[i] = random.nextInt();
        }
        return dataArray;
    }

    public static int[] generateDataArray(int size, int min, int max) {
        Random random = new Random();
        int[] dataArray = new int[size];
        for (int i = 0; i < size; i++) {
            dataArray[i] = random.nextInt((max - min) + 1) + min;
        }
        return dataArray;
    }

    public static void printArray(int[] data) {
        for (int value : data) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

}
