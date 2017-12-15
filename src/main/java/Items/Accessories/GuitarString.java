package Items.Accessories;

public class GuitarString extends Accessory {

    private String material;

    public GuitarString(double boughtPrice, double sellPrice, String name, String material) {
        super(boughtPrice, sellPrice, name);
        this.material = material;
    }

    public String getMaterial() {
        return this.material;
    }
}
