import instruments.Colour;
import instruments.InstrumentType;
import instruments.Material;
import instruments.groups.StringType;
import instruments.groups.WindType;
import instruments.instrument.Violin;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ViolinTest {
    private Violin violin;
    @Before
    public void setUp(){
        violin = new Violin(InstrumentType.STRING, Material.WOOD, Colour.NATURAL, true, 100, 300, StringType.VIOLIN, 4, true);
    }
    @Test
    public void hasType(){
        assertEquals(InstrumentType.STRING, violin.getInstrumentType());
    }
    @Test
    public void canSetType(){
        violin.setInstrumentType(InstrumentType.WIND);
        assertEquals(InstrumentType.WIND, violin.getInstrumentType());
    }
    @Test
    public void hasMaterial(){
        assertEquals(Material.WOOD, violin.getMaterial());
    }
    @Test
    public void canSetMaterial(){
        violin.setMaterial(Material.PLASTIC);
        assertEquals(Material.PLASTIC, violin.getMaterial());
    }
    @Test
    public void hasColour(){
        assertEquals(Colour.NATURAL, violin.getColour());
    }
    @Test
    public void canSetColour(){
        violin.setColour(Colour.BLACK);
        assertEquals(Colour.BLACK, violin.getColour());
    }
    @Test
    public void hasCase__True(){
        assertTrue(violin.getRequiresCase());
    }
    @Test
    public void canSetRequiresCase(){
        violin.setRequiresCase(false);
        assertFalse(violin.getRequiresCase());
    }
    @Test
    public void hasStringType(){
        assertEquals(StringType.VIOLIN, violin.getStringType());
    }
    @Test
    public void canSetWindType(){
        violin.setStringType(StringType.GUITAR);
        assertEquals(StringType.GUITAR, violin.getStringType());
    }
    @Test
    public void hasStrings(){
        assertEquals(4, violin.getNoOfStrings());
    }
    @Test
    public void canSetStrings(){
        violin.setNoOfStrings(5);
        assertEquals(5, violin.getNoOfStrings());
    }
    @Test
    public void hasBuyingPrice(){
        assertEquals(100, violin.getBuyingPrice(), 0.01);
    }
    @Test
    public void canSetBuyingPrice(){
        violin.setBuyingPrice(200);
        assertEquals(200, violin.getBuyingPrice(), 0.01);
    }
    @Test
    public void hasSellingPrice(){
        assertEquals(300, violin.getSellingPrice(), 0.01);
    }
    @Test
    public void canSetSellingPrice(){
        violin.setSellingPrice(400);
        assertEquals(400, violin.getSellingPrice(), 0.01);
    }
    @Test
    public void canPlay(){
        assertEquals("Melodic screeching", violin.play());
    }
    @Test
    public void canCalcMarkup(){
        assertEquals(200, violin.calcMarkup(), 0.01);
    }
}
