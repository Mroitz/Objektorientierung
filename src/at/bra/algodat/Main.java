package at.bra.algodat;

import at.bra.algodat.sorter.BubbleSorter;
import at.bra.algodat.sorter.InserionSorter;
import at.bra.algodat.sorter.SelectionSorter;

public class Main {
    public static void main(String[] args) {

        Controller controller = new Controller();
        controller.addSorter(new BubbleSorter());
        controller.addSorter(new InserionSorter());
        controller.addSorter(new SelectionSorter());
        controller.run();
    }

}
