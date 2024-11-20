package at.bra.objektorientierung;

import java.util.ArrayList;
import java.util.List;

public class SdCard {
    private int capacity;
    private List<Picture> pictures;

    public SdCard(int capacity) {
        this.capacity = capacity;
        this.pictures = new ArrayList<>();
    }

    public int getCapacity() {
        return capacity;
    }
}
