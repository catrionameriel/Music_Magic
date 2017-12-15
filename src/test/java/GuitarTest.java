import Items.Instruments.Guitar;
import Items.Instruments.GuitarType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    private Guitar guitar;

    @Before
    public void before() {
        guitar = new Guitar(300.00, 600.00, GuitarType.ACOUSTIC, 6);
    }

    @Test
    public void canGetNumberOfStrings(){
        assertEquals(6, guitar.getNumberOfStrings());
    }

    @Test
    public void canPlay(){
        assertEquals("struuum", guitar.play());
    }

    @Test
    public void canGetGuitarType(){
        assertEquals(GuitarType.ACOUSTIC, guitar.getGuitarType());
    }

    @Test
    public void canGetGuitarTypeName(){
        assertEquals("Acoustic", guitar.getGuitarTypeName());
    }
}
