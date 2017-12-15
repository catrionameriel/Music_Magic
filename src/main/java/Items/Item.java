package Items;

public abstract class Item implements ISell {

    private double boughtPrice;
    private double sellPrice;


    public Item(double boughtPrice, double sellPrice){
        this.boughtPrice = boughtPrice;
        this.sellPrice = sellPrice;
    }

    public double calculateMarkUp(){
        return sellPrice - boughtPrice;
    }

    public double getBoughtPrice(){
        return this.boughtPrice;
    }

    public void setBoughtPrice(double newBoughtPrice){
        this.boughtPrice = newBoughtPrice;
    }

    public double getSellPrice(){
        return this.sellPrice;
    }

    public void setSellPrice(double newSellPrice){
        this.sellPrice = newSellPrice;
    }
}
