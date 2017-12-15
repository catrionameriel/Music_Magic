package Items.Instruments;

import Items.Item;

public abstract class Instrument extends Item implements IPlay {

    private FamilyType family;
    private String material;

    public Instrument(double boughtPrice, double sellPrice, FamilyType family, String material) {
        super(boughtPrice, sellPrice);
        this.family = family;
        this.material = material;
    }

    public FamilyType getFamilyType() {
        return this.family;
    }

    public String getFamilyTypeName() {
        return this.family.getName();
    }

    public String getMaterial() {
        return this.material;
    }

}
