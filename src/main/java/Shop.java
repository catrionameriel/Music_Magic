import Items.ISell;


import java.util.ArrayList;
import java.util.HashMap;

public class Shop {

    private Shop shop;

    private String name;
    private HashMap<String, ArrayList> stock;

    public Shop(String name){
        this.name = name;
        stock = new HashMap<>();
        stock.put("Instruments", new ArrayList<ISell>());
        stock.put("Accessories", new ArrayList<ISell>());
        stock.put("Cases", new ArrayList<ISell>());
    }

    public String getName(){
        return this.name;
    }

    public void addItem (ISell newInstrument, String listName){
        ArrayList<ISell> instruments = stock.get(listName);
        instruments.add(newInstrument);
    }

    public int countInstruments(){
        ArrayList<ISell> instruments = stock.get("Instruments");
        return instruments.size();
    }

    public void removeInstrument(ISell instrument){
        ArrayList<ISell> instruments = stock.get("Instruments");
        instruments.remove(instrument);
    }

}
