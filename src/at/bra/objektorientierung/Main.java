package at.bra.objektorientierung;

// Main method or test setup
public class Main {
    public static void main(String[] args) {
        Manufacturer canon = new Manufacturer("Canon", "Japan");
        Lens canonlens = new Lens(canon, 200);
        SdCard sdCard64 = new SdCard(64);

        Camera camera = new Camera(canon, "black", canonlens, sdCard64);

        camera.takePicture("Urlaub", "mittel");
        camera.takePicture("Urlaub", "mittel");
        camera.takePicture("Urlaub", "groß");
        camera.takePicture("Urlaub", "mittel");

        System.out.println("Freier Speicher: " + camera.getFreeSpace() + "MB");
    }
}
