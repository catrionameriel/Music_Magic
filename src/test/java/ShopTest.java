import Items.ISell;
import Items.Instruments.Trumpet;
import Items.Instruments.Violin;
import Items.Item;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    private Shop shop;
    private ISell violin;
    private ISell trumpet;

    @Before
    public void before(){
        shop = new Shop("Music Magic", 200.00, 10.00);
        violin = new Violin(300.00, 500.00);
        trumpet = new Trumpet(450.00, 500.00);
    }

    @Test
    public void canGetName(){
        assertEquals("Music Magic", shop.getName());
    }

    @Test
    public void canAddToStock(){
        shop.addItemToStock(violin);
        assertEquals(1, shop.countStock());
    }

    @Test
    public void canRemoveFromStock(){
        shop.addItemToStock(violin);
        shop.addItemToStock(trumpet);
        shop.removeItem(violin);
        assertEquals(1, shop.countStock());
    }

    @Test
    public void canGetTillSize(){
        assertEquals(200.00, shop.getTillMoney(), 0.01);
    }

    @Test
    public void canGetProfitWithoutSelling(){
        assertEquals(10, shop.getProfit(), 0.01);
    }

    @Test
    public void canGetProfitAfterSelling(){
        shop.addItemToStock(trumpet);
        shop.sellItem(trumpet);
        assertEquals(60.00, shop.getProfit(), 0.01);
    }

    @Test
    public void canSellItem(){
        shop.addItemToStock(violin);
        shop.addItemToStock(trumpet);
        shop.sellItem(violin);
        assertEquals(700.00, shop.getTillMoney(), 0.01);
        assertEquals(210.00, shop.getProfit(), 0.01);
    }

    @Test
    public void canAddInstrument(){
        shop.addItemToHasHMap(violin, "Instruments");
        assertEquals(1, shop.countInstrumentsinHashMap("Instruments"));
    }

    @Test
    public void canRemoveInstrument(){
        shop.addItemToHasHMap(violin, "Instruments");
        shop.addItemToHasHMap(trumpet, "Instruments");
        shop.removeInstrumentfromHashMap(violin, "Instruments");
        assertEquals(1, shop.countInstrumentsinHashMap("Instruments"));
    }
}
