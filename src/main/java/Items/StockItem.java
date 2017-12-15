package Items;

import java.util.ArrayList;

public class StockItem <T> {

    private ArrayList<T> stockList;

    public StockItem(){
        stockList = new ArrayList<>();
    }

    public ArrayList<T> getArrayList(){
        return this.stockList;
    }

}
