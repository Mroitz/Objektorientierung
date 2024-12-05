package at.bra.algodat.baseAlgorithm;

public class BaseAlgorithm {
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
