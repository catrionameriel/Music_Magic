package Items.Instruments;

import Items.Accessories.Case;

public class Trumpet extends Instrument {

    private int numberOfValves;

    public Trumpet(double boughtPrice, double sellPrice) {
        super(boughtPrice, sellPrice, FamilyType.BRASS, "Brass");
        this.numberOfValves = 3;
    }

    public String play() {
        return "TZAAK";
    }

    public int getNumberOfValves(){
        return this.numberOfValves;
    }
}
