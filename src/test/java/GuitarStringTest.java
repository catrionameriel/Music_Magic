import Items.Accessories.GuitarString;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarStringTest {

    private GuitarString guitarString;


    @Before
    public void before(){
        guitarString = new GuitarString(1.50, 4.00,"Guitar", "nylon");
    }

    @Test
    public void canGetMaterial(){
        assertEquals("nylon", guitarString.getMaterial());
    }

    @Test
    public void canGetMarkup(){
        assertEquals(2.50, guitarString.calculateMarkUp(), 0.01);
    }



}
