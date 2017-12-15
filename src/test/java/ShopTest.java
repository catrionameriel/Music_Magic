import Items.ISell;
import Items.Instruments.Trumpet;
import Items.Instruments.Violin;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    private Shop shop;
    private ISell violin;
    private ISell trumpet;

    @Before
    public void before(){
        shop = new Shop("Music Magic");
        violin = new Violin(300.00, 500.00);
        trumpet = new Trumpet(450.00, 500.00);
    }

    @Test
    public void canGetName(){
        assertEquals("Music Magic", shop.getName());
    }

    @Test
    public void canAddInstrument(){
        shop.addItem(violin, "instruments");
        assertEquals(1, shop.countInstruments());
    }

    @Test
    public void canRemoveInstrument(){
        shop.addInstrument(violin);
        shop.addInstrument(trumpet);
        shop.removeInstrument(violin);
        assertEquals(1, shop.countInstruments());
    }
}
