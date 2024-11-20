package at.bra.objektorientierung;

import java.time.LocalDate;

public class Camera {
    private String color;
    private Manufacturer manufacturer;
    private Lens lens;
    private SdCard sdCard;
    private int totalUsedSpace;

    public Camera(Manufacturer manufacturer, String color, Lens lens, SdCard sdCard) {
        this.manufacturer = manufacturer;
        this.color = color;
        this.lens = lens;
        this.sdCard = sdCard;
        this.totalUsedSpace = 0;
    }

    public String getColor() {
        return color;
    }

    public int getTotalUsedSpace() {
        return totalUsedSpace;
    }

    public int getFreeSpace() {
        return sdCard.getCapacity() - totalUsedSpace;
    }

    public void takePicture(String name, String sizeOption) {
        int size = 0;
        switch (sizeOption.toLowerCase()) {
            case "klein":
                size = 5;
                break;
            case "mittel":
                size = 15;
                break;
            case "groß":
                size = 30;
                break;
            default:
                System.out.println("Ungültig. Wähle klein, mittel, groß");
                return;
        }

        if (getFreeSpace() >= size) {
            totalUsedSpace += size;
            System.out.println("Bild aufgenommen: " + name + ", Größe: " + size + "MB");
        } else {
            System.out.println("Nicht genügend Speicherplatz auf der SD-Karte!");
        }

        LocalDate date = LocalDate.now();

        Picture picture = new Picture(name, date, size);

    }
}
