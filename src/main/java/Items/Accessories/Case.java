package Items.Accessories;

public class Case extends Accessory {

    private String type;

    public Case(double boughtPrice, double sellPrice, String name, String type) {
        super(boughtPrice, sellPrice, name);
        this.type = type;
    }

    public String getCaseType() {
        return this.type;
    }
}
