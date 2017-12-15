package Items.Instruments;

public class Guitar extends Instrument {

    private GuitarType type;
    private int numberOfStrings;

    public Guitar(double boughtPrice, double sellPrice, GuitarType type, int numberOfStrings) {
        
        super(boughtPrice, sellPrice, FamilyType.STRING, "wood");
        this.type = type;
        this.numberOfStrings = numberOfStrings;
    }

    public String play() {
        return "struuum";
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public GuitarType getGuitarType() {
        return this.type;
    }

    public String getGuitarTypeName() {
        return this.type.getGuitarTypeName();
    }
}
