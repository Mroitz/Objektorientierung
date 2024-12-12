package at.bra.algodat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import at.bra.algodat.sorter.BubbleSorter;
import at.bra.algodat.sorter.Sorter;

public class Controller {
    private Scanner scanner = new Scanner(System.in);
    private List<Sorter> sorter = new ArrayList<Sorter>();
    private int[] dataArray = new int[10];

    public void addSorter(Sorter sorter) {
        this.sorter.add(sorter);
    }

    public void generateDataArray() {
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            dataArray[i] = random.nextInt(20) + 1;
        }
        System.out.println(Arrays.toString(dataArray));
    }

    public void run() {
        while (true) {
            System.out.println("press 1 to create Array");
            System.out.println("press 2 to sort Array");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    generateDataArray();
                    break;
                case 2:
                    System.out.println("choose algo");
                    int chosen = scanner.nextInt();
                    switch (chosen) {
                        case 1:
                            BubbleSorter.sort(dataArray);
                            break;

                        default:
                            break;
                    }
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }

}
