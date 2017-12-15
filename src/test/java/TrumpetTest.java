import Items.Accessories.Case;
import Items.Instruments.Trumpet;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrumpetTest {

    private Trumpet trumpet;

    @Before
    public void before(){
        trumpet = new Trumpet(250.00, 500.00);
    }

    @Test
    public void canGetNumberOfValves(){
        assertEquals(3, trumpet.getNumberOfValves());
    }


}
