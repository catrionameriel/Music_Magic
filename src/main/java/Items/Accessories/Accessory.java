package Items.Accessories;

import Items.Item;

public abstract class Accessory extends Item {

    private String name;

    public Accessory(double boughtPrice, double sellPrice, String name) {
        super(boughtPrice, sellPrice);
        this.name = name;

    }

    public String getName(){
        return this.name;
    }

}
