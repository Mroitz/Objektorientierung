package at.bra.objektorientierung;

// Main method or test setup
public class Main {
    public static void main(String[] args) {
        Manufacturer canon = new Manufacturer("Canon", "Japan");
        Lens canonlens = new Lens(canon, 200);
        SdCard sdCard = new SdCard(64.0);

        Camera camera = new Camera(canon, "black", canonlens, sdCard);
    }
}
