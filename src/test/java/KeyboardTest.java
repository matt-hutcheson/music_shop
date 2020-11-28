import instruments.Colour;
import instruments.InstrumentType;
import instruments.Material;
import instruments.groups.KeyType;
import instruments.instrument.Keyboard;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class KeyboardTest {
    private Keyboard keyboard;
    @Before
    public void setUp(){
        keyboard = new Keyboard(InstrumentType.KEY, Material.PLASTIC, Colour.BLACK, false, 100, 300, KeyType.KEYBOARD, 101, true);
    }
    @Test
    public void hasType(){
        assertEquals(InstrumentType.KEY, keyboard.getInstrumentType());
    }
    @Test
    public void canSetType(){
        keyboard.setInstrumentType(InstrumentType.KEY);
        assertEquals(InstrumentType.KEY, keyboard.getInstrumentType());
    }
    @Test
    public void hasMaterial(){
        assertEquals(Material.PLASTIC, keyboard.getMaterial());
    }
    @Test
    public void canSetMaterial(){
        keyboard.setMaterial(Material.BRASS);
        assertEquals(Material.BRASS, keyboard.getMaterial());
    }
    @Test
    public void hasColour(){
        assertEquals(Colour.BLACK, keyboard.getColour());
    }
    @Test
    public void canSetColour(){
        keyboard.setColour(Colour.GOLD);
        assertEquals(Colour.GOLD, keyboard.getColour());
    }
    @Test
    public void hasCase__False(){
        assertFalse(keyboard.getRequiresCase());
    }
    @Test
    public void canSetRequiresCase(){
        keyboard.setRequiresCase(true);
        assertTrue(keyboard.getRequiresCase());
    }
    @Test
    public void hasKeyType(){
        assertEquals(KeyType.KEYBOARD, keyboard.getKeysType());
    }
    @Test
    public void canSetKeyType(){
        keyboard.setKeysType(KeyType.PIANO);
        assertEquals(KeyType.PIANO, keyboard.getKeysType());
    }
    @Test
    public void hasKeys(){
        assertEquals(101, keyboard.getNoOfKeys());
    }
    @Test
    public void canSetKeys(){
        keyboard.setNoOfKeys(86);
        assertEquals(86, keyboard.getNoOfKeys());
    }
    @Test
    public void hasBuyingPrice(){
        assertEquals(100, keyboard.getBuyingPrice(), 0.01);
    }
    @Test
    public void canSetBuyingPrice(){
        keyboard.setBuyingPrice(200);
        assertEquals(200, keyboard.getBuyingPrice(), 0.01);
    }
    @Test
    public void hasSellingPrice(){
        assertEquals(300, keyboard.getSellingPrice(), 0.01);
    }
    @Test
    public void canSetSellingPrice(){
        keyboard.setSellingPrice(400);
        assertEquals(400, keyboard.getSellingPrice(), 0.01);
    }
    @Test
    public void canPlay(){
        assertEquals("Electronic plonking", keyboard.play());
    }
    @Test
    public void canCalcMarkup(){
        assertEquals(200, keyboard.calcMarkup(), 0.01);
    }
}
