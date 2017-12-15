import Items.Accessories.Case;
import Items.Instruments.FamilyType;
import Items.Instruments.Violin;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class ViolinTest {

    private Violin violin;

    @Before
    public void before(){
        violin = new Violin(350.00, 600.00);
    }

    @Test
    public void canGetNumberOfString(){
        assertEquals(4, violin.getNumberOfStrings());
    }

    @Test
    public void canGetFamilyType(){
        assertEquals(FamilyType.STRING, violin.getFamilyType());
    }

    @Test
    public void canGetFamilyTypeName(){
        assertEquals("String", violin.getFamilyTypeName());
    }

    @Test
    public void canGetMaterial(){
        assertEquals("wood", violin.getMaterial());
    }

    @Test
    public void canGetMarkup(){
        assertEquals(250.00, violin.calculateMarkUp(), 0.01);
    }

    @Test
    public void canPlay(){
        assertEquals("aaaaaaa", violin.play());
    }


}
