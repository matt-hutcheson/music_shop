import instruments.Colour;
import instruments.InstrumentType;
import instruments.Material;
import instruments.groups.StringType;
import instruments.instrument.Guitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GuitarTest {
    private Guitar guitar;
    @Before
    public void setUp(){
        guitar = new Guitar(InstrumentType.STRING, Material.WOOD, Colour.NATURAL, true, 100, 300, StringType.GUITAR, 6, false);
    }
    @Test
    public void hasType(){
        assertEquals(InstrumentType.STRING, guitar.getInstrumentType());
    }
    @Test
    public void canSetType(){
        guitar.setInstrumentType(InstrumentType.WIND);
        assertEquals(InstrumentType.WIND, guitar.getInstrumentType());
    }
    @Test
    public void hasMaterial(){
        assertEquals(Material.WOOD, guitar.getMaterial());
    }
    @Test
    public void canSetMaterial(){
        guitar.setMaterial(Material.PLASTIC);
        assertEquals(Material.PLASTIC, guitar.getMaterial());
    }
    @Test
    public void hasColour(){
        assertEquals(Colour.NATURAL, guitar.getColour());
    }
    @Test
    public void canSetColour(){
        guitar.setColour(Colour.BLACK);
        assertEquals(Colour.BLACK, guitar.getColour());
    }
    @Test
    public void hasCase__True(){
        assertTrue(guitar.getRequiresCase());
    }
    @Test
    public void canSetRequiresCase(){
        guitar.setRequiresCase(false);
        assertFalse(guitar.getRequiresCase());
    }
    @Test
    public void hasStringType(){
        assertEquals(StringType.GUITAR, guitar.getStringType());
    }
    @Test
    public void canSetWindType(){
        guitar.setStringType(StringType.VIOLIN);
        assertEquals(StringType.VIOLIN, guitar.getStringType());
    }
    @Test
    public void hasStrings(){
        assertEquals(6, guitar.getNoOfStrings());
    }
    @Test
    public void canSetStrings(){
        guitar.setNoOfStrings(5);
        assertEquals(5, guitar.getNoOfStrings());
    }
    @Test
    public void hasBuyingPrice(){
        assertEquals(100, guitar.getBuyingPrice(), 0.01);
    }
    @Test
    public void canSetBuyingPrice(){
        guitar.setBuyingPrice(200);
        assertEquals(200, guitar.getBuyingPrice(), 0.01);
    }
    @Test
    public void hasSellingPrice(){
        assertEquals(300, guitar.getSellingPrice(), 0.01);
    }
    @Test
    public void canSetSellingPrice(){
        guitar.setSellingPrice(400);
        assertEquals(400, guitar.getSellingPrice(), 0.01);
    }
    @Test
    public void canPlay(){
        assertEquals("Stairway to Heaven strumming", guitar.play());
    }
    @Test
    public void canCalcMarkup(){
        assertEquals(300, guitar.calcMarkup(), 0.01);
    }
}
