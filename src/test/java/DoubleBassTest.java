import instruments.Colour;
import instruments.InstrumentType;
import instruments.Material;
import instruments.groups.StringType;
import instruments.instrument.DoubleBass;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DoubleBassTest {
    private DoubleBass doubleBass;
    @Before
    public void setUp(){
        doubleBass = new DoubleBass(InstrumentType.STRING, Material.WOOD, Colour.NATURAL, true, 100, 300, StringType.DOUBLEBASS, 4, false);
    }
    @Test
    public void hasType(){
        assertEquals(InstrumentType.STRING, doubleBass.getInstrumentType());
    }
    @Test
    public void canSetType(){
        doubleBass.setInstrumentType(InstrumentType.WIND);
        assertEquals(InstrumentType.WIND, doubleBass.getInstrumentType());
    }
    @Test
    public void hasMaterial(){
        assertEquals(Material.WOOD, doubleBass.getMaterial());
    }
    @Test
    public void canSetMaterial(){
        doubleBass.setMaterial(Material.PLASTIC);
        assertEquals(Material.PLASTIC, doubleBass.getMaterial());
    }
    @Test
    public void hasColour(){
        assertEquals(Colour.NATURAL, doubleBass.getColour());
    }
    @Test
    public void canSetColour(){
        doubleBass.setColour(Colour.BLACK);
        assertEquals(Colour.BLACK, doubleBass.getColour());
    }
    @Test
    public void hasCase__True(){
        assertTrue(doubleBass.getRequiresCase());
    }
    @Test
    public void canSetRequiresCase(){
        doubleBass.setRequiresCase(false);
        assertFalse(doubleBass.getRequiresCase());
    }
    @Test
    public void hasStringType(){
        assertEquals(StringType.DOUBLEBASS, doubleBass.getStringType());
    }
    @Test
    public void canSetWindType(){
        doubleBass.setStringType(StringType.VIOLIN);
        assertEquals(StringType.VIOLIN, doubleBass.getStringType());
    }
    @Test
    public void hasStrings(){
        assertEquals(4, doubleBass.getNoOfStrings());
    }
    @Test
    public void canSetStrings(){
        doubleBass.setNoOfStrings(5);
        assertEquals(5, doubleBass.getNoOfStrings());
    }
    @Test
    public void hasBuyingPrice(){
        assertEquals(100, doubleBass.getBuyingPrice(), 0.01);
    }
    @Test
    public void canSetBuyingPrice(){
        doubleBass.setBuyingPrice(200);
        assertEquals(200, doubleBass.getBuyingPrice(), 0.01);
    }
    @Test
    public void hasSellingPrice(){
        assertEquals(300, doubleBass.getSellingPrice(), 0.01);
    }
    @Test
    public void canSetSellingPrice(){
        doubleBass.setSellingPrice(400);
        assertEquals(400, doubleBass.getSellingPrice(), 0.01);
    }
    @Test
    public void canPlay(){
        assertEquals("Plink Plonk", doubleBass.play());
    }
    @Test
    public void canCalcMarkup(){
        assertEquals(300, doubleBass.calcMarkup(), 0.01);
    }
}
