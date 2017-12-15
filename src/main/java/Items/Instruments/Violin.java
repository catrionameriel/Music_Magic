package Items.Instruments;

public class Violin extends Instrument {
    
    private int numberOfStrings;
    
    public Violin(double boughtPrice, double sellPrice) {
        super(boughtPrice, sellPrice, FamilyType.STRING, "wood");
        this.numberOfStrings = 4;
    }


    public int getNumberOfStrings() {
        return numberOfStrings;
    }


    public String play() {
        return "aaaaaaa";
    }
}
