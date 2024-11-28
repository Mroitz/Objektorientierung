package at.bra.datagenerator;

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
            System.out.print(value + " " + data);
        }
        System.out.println();
    }

    public static int[] revert(int[] data) {
        int[] reversedArray = new int[data.length];
        for (int i = 0; i < data.length; i++) {
            reversedArray[i] = data[data.length - 1 - i];
        }
        return reversedArray;
    }

    public static int max(int[] data) {
        int maxValue = data[0];
        for (int value : data) {
            if (value > maxValue) {
                maxValue = value;
            }
        }
        return maxValue;
    }

    public static int min(int[] data) {
        int minValue = data[0];
        for (int value : data) {
            if (value < minValue) {
                minValue = value;
            }
        }
        return minValue;
    }
}
