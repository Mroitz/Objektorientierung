package at.bra.objektorientierung;

import java.util.ArrayList;
import java.util.List;

public class SdCard {
    private double capacity;
    private List<Picture> pictures;

    public SdCard(double capacity) {
        this.capacity = capacity;
        this.pictures = new ArrayList<>();
    }

    public double getCapacity() {
        return capacity;
    }
}
