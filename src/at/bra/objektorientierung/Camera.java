package at.bra.objektorientierung;

public class Camera {
    private String color;
    private Manufacturer manufacturer;
    private Lens lens;
    private SdCard sdCard;

    public Camera(Manufacturer manufacturer, String color, Lens lens, SdCard sdCard) {
        this.manufacturer = manufacturer;
        this.color = color;
        this.lens = lens;
        this.sdCard = sdCard;
    }

    public String getColor() {
        return color;
    }

    public void takePicture(String name, int size) {

        Picture picture = new Picture(name, null, size);

    }
}
