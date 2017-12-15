import Items.Accessories.Case;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CaseTest {

    Case newCase;


    @Before
    public void before(){
        newCase = new Case(5.00, 10.00, "Guitar case","Soft");
    }

    @Test
    public void canGetCaseType(){
        assertEquals("Soft", newCase.getCaseType());
    }

    @Test
    public void canGetBoughtPrice(){
        assertEquals(5.00, newCase.getBoughtPrice(), 0.01);
    }

    @Test
    public void canSetBoughtPrice(){
        newCase.setBoughtPrice(6.00);
        assertEquals(6.00, newCase.getBoughtPrice(), 0.01);
    }

    @Test
    public void canGetSellPrice(){
        assertEquals(10.00, newCase.getSellPrice(), 0.01);
    }

    @Test
    public void canSetSellPrice(){
        newCase.setSellPrice(11.00);
        assertEquals(11.00, newCase.getSellPrice(), 0.01);
    }

    @Test
    public void canGetName(){
        assertEquals("Guitar case", newCase.getName());
    }

    @Test
    public void canGetMarkUp(){
        assertEquals(5.00, newCase.calculateMarkUp(), 0.01);
    }

}
