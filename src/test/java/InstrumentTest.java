import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class InstrumentTest {
    private Instrument instrument;
    @Before
    public void setUp(){
        instrument = new Instrument(InstrumentType.VIOLIN, Material.WOOD, Colour.NATURAL, true);
    }
    @Test
    public void hasType(){
        assertEquals(InstrumentType.VIOLIN, instrument.getType());
    }
    @Test
    public void hasMaterial(){
        assertEquals(Material.WOOD, instrument.getMaterial());
    }
    @Test
    public void hasColour(){
        assertEquals(Colour.NATURAL, instrument.getColour());
    }
    @Test
    public void hasCase__True(){
        assertTrue(instrument.isRequiresCase());
    }
}
