import Items.Accessories.Accessory;
import Items.Accessories.Case;
import Items.ISell;
import Items.Instruments.Instrument;
import Items.Item;


import java.util.ArrayList;
import java.util.HashMap;

public class Shop {

    private String name;
    private ArrayList<ISell> allStock;
    private ArrayList<ISell> soldStock;
    private double till;
    private double profit;
    private HashMap<String, ArrayList> stock;


    public Shop(String name, double till, double profit){
        this.name = name;
        this.allStock = new ArrayList<>();
        this.till = till;
        this.profit = profit;
        this.soldStock = new ArrayList<>();
        this.stock = new HashMap<>();
        stock.put("Instruments", new ArrayList<Instrument>());
        stock.put("Accessories", new ArrayList<Accessory>());
        stock.put("Cases", new ArrayList<Case>());
    }

    public String getName(){
        return this.name;
    }

    public void addItemToStock(ISell newItem){
        this.allStock.add(newItem);
    }

    public int countStock() {
        return this.allStock.size();
    }

    public ISell removeItem(ISell item){
        int index = this.allStock.indexOf(item);
        return this.allStock.remove(index);
    }

    public void moveItemWhenSold(ISell soldItem){
        this.soldStock.add(soldItem);
    }

    public double getTillMoney() {
        return this.till;
    }

    public double getProfit() {
        return this.profit;
    }

    private double calculateProfit() {
        double total = 0;
        for(ISell item : soldStock){
            double markup = item.calculateMarkUp();
            total += markup;
        }
        return total;
    }

    public void sellItem(ISell item){
        if(allStock.contains(item)){
            this.till += item.getSellPrice();
            this.moveItemWhenSold(this.removeItem(item));
            this.profit += this.calculateProfit();
            }
    }

    public void addItemToHasHMap (ISell newItem, String listName){
        ArrayList l = this.stock.get(listName);
        l.add(newItem);
    }

    public int countInstrumentsinHashMap(String listName){
        ArrayList l = this.stock.get(listName);
        return l.size();
    }

    public void removeInstrumentfromHashMap(ISell newItem, String listName){
        ArrayList l = stock.get(listName);
         l.remove(newItem);
    }

}
