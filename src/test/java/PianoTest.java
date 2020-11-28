import instruments.Colour;
import instruments.InstrumentType;
import instruments.Material;
import instruments.groups.KeyType;
import instruments.groups.StringType;
import instruments.instrument.Piano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PianoTest {
    private Piano piano;
    @Before
    public void setUp(){
        piano = new Piano(InstrumentType.KEY, Material.WOOD, Colour.BLACK, false, 1000, 3000, KeyType.PIANO, 88, false);
    }
    @Test
    public void hasType(){
        assertEquals(InstrumentType.KEY, piano.getInstrumentType());
    }
    @Test
    public void canSetType(){
        piano.setInstrumentType(InstrumentType.KEY);
        assertEquals(InstrumentType.KEY, piano.getInstrumentType());
    }
    @Test
    public void hasMaterial(){
        assertEquals(Material.WOOD, piano.getMaterial());
    }
    @Test
    public void canSetMaterial(){
        piano.setMaterial(Material.PLASTIC);
        assertEquals(Material.PLASTIC, piano.getMaterial());
    }
    @Test
    public void hasColour(){
        assertEquals(Colour.BLACK, piano.getColour());
    }
    @Test
    public void canSetColour(){
        piano.setColour(Colour.GOLD);
        assertEquals(Colour.GOLD, piano.getColour());
    }
    @Test
    public void hasCase__False(){
        assertFalse(piano.getRequiresCase());
    }
    @Test
    public void canSetRequiresCase(){
        piano.setRequiresCase(true);
        assertTrue(piano.getRequiresCase());
    }
    @Test
    public void hasKeyType(){
        assertEquals(KeyType.PIANO, piano.getKeysType());
    }
    @Test
    public void canSetKeyType(){
        piano.setKeysType(KeyType.KEYBOARD);
        assertEquals(KeyType.KEYBOARD, piano.getKeysType());
    }
    @Test
    public void hasKeys(){
        assertEquals(88, piano.getNoOfKeys());
    }
    @Test
    public void canSetKeys(){
        piano.setNoOfKeys(86);
        assertEquals(86, piano.getNoOfKeys());
    }
    @Test
    public void hasBuyingPrice(){
        assertEquals(1000, piano.getBuyingPrice(), 0.01);
    }
    @Test
    public void canSetBuyingPrice(){
        piano.setBuyingPrice(2000);
        assertEquals(2000, piano.getBuyingPrice(), 0.01);
    }
    @Test
    public void hasSellingPrice(){
        assertEquals(3000, piano.getSellingPrice(), 0.01);
    }
    @Test
    public void canSetSellingPrice(){
        piano.setSellingPrice(4000);
        assertEquals(4000, piano.getSellingPrice(), 0.01);
    }
    @Test
    public void canPlay(){
        assertEquals("Classical Plonking", piano.play());
    }
    @Test
    public void canCalcMarkup(){
        assertEquals(300, piano.calcMarkup(), 0.01);
    }
}
