package at.bra.objektorientierung;

public class Lens {
    private Manufacturer manufacturer;
    private double focalLength;

    public Lens(Manufacturer manufacturer, double focalLength) {
        this.manufacturer = manufacturer;
        this.focalLength = focalLength;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public double getFocalLength() {
        return focalLength;
    }
}
