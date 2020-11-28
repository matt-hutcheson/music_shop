import instruments.Colour;
import instruments.InstrumentType;
import instruments.Material;
import instruments.groups.WindType;
import instruments.instrument.Trombone;
import instruments.instrument.Trumpet;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TrumpetTest {
    private Trumpet trumpet;
    @Before
    public void setUp(){
        trumpet = new Trumpet(InstrumentType.WIND, Material.BRASS, Colour.GOLD, true, 100, 300, WindType.TRUMPET, 3);
    }
    @Test
    public void hasType(){
        assertEquals(InstrumentType.WIND, trumpet.getInstrumentType());
    }
    @Test
    public void canSetType(){
        trumpet.setInstrumentType(InstrumentType.STRING);
        assertEquals(InstrumentType.STRING, trumpet.getInstrumentType());
    }
    @Test
    public void hasMaterial(){
        assertEquals(Material.BRASS, trumpet.getMaterial());
    }
    @Test
    public void canSetMaterial(){
        trumpet.setMaterial(Material.PLASTIC);
        assertEquals(Material.PLASTIC, trumpet.getMaterial());
    }
    @Test
    public void hasColour(){
        assertEquals(Colour.GOLD, trumpet.getColour());
    }
    @Test
    public void canSetColour(){
        trumpet.setColour(Colour.SILVER);
        assertEquals(Colour.SILVER, trumpet.getColour());
    }
    @Test
    public void hasCase__True(){
        assertTrue(trumpet.getRequiresCase());
    }
    @Test
    public void canSetRequiresCase(){
        trumpet.setRequiresCase(false);
        assertFalse(trumpet.getRequiresCase());
    }
    @Test
    public void hasWindType(){
        assertEquals(WindType.TRUMPET, trumpet.getWindType());
    }
    @Test
    public void canSetWindType(){
        trumpet.setWindType(WindType.TROMBONE);
        assertEquals(WindType.TROMBONE, trumpet.getWindType());
    }
    @Test
    public void hasValves(){
        assertEquals(3, trumpet.getNoOfValves());
    }
    @Test
    public void canSetValves(){
        trumpet.setNoOfValves(5);
        assertEquals(5, trumpet.getNoOfValves());
    }
    @Test
    public void hasBuyingPrice(){
        assertEquals(100, trumpet.getBuyingPrice(), 0.01);
    }
    @Test
    public void canSetBuyingPrice(){
        trumpet.setBuyingPrice(200);
        assertEquals(200, trumpet.getBuyingPrice(), 0.01);
    }
    @Test
    public void hasSellingPrice(){
        assertEquals(300, trumpet.getSellingPrice(), 0.01);
    }
    @Test
    public void canSetSellingPrice(){
        trumpet.setSellingPrice(400);
        assertEquals(400, trumpet.getSellingPrice(), 0.01);
    }
    @Test
    public void canPlay(){
        assertEquals("Toot Toot!", trumpet.play());
    }
    @Test
    public void canCalcMarkup(){
        assertEquals(200, trumpet.calcMarkup(), 0.01);
    }
}
