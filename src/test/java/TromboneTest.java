import instruments.Colour;
import instruments.InstrumentType;
import instruments.Material;
import instruments.groups.WindType;
import instruments.instrument.Trombone;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TromboneTest {
    private Trombone trombone;
    @Before
    public void setUp(){
        trombone = new Trombone(InstrumentType.STRING, Material.WOOD, Colour.NATURAL, true, 100, 300, WindType.TROMBONE, 3);
    }
    @Test
    public void hasType(){
        assertEquals(InstrumentType.STRING, trombone.getInstrumentType());
    }
    @Test
    public void canSetType(){
        trombone.setInstrumentType(InstrumentType.STRING);
        assertEquals(InstrumentType.STRING, trombone.getInstrumentType());
    }
    @Test
    public void hasMaterial(){
        assertEquals(Material.WOOD, trombone.getMaterial());
    }
    @Test
    public void canSetMaterial(){
        trombone.setMaterial(Material.PLASTIC);
        assertEquals(Material.PLASTIC, trombone.getMaterial());
    }
    @Test
    public void hasColour(){
        assertEquals(Colour.NATURAL, trombone.getColour());
    }
    @Test
    public void canSetColour(){
        trombone.setColour(Colour.SILVER);
        assertEquals(Colour.SILVER, trombone.getColour());
    }
    @Test
    public void hasCase__True(){
        assertTrue(trombone.getRequiresCase());
    }
    @Test
    public void canSetRequiresCase(){
        trombone.setRequiresCase(false);
        assertFalse(trombone.getRequiresCase());
    }
    @Test
    public void hasWindType(){
        assertEquals(WindType.TROMBONE, trombone.getWindType());
    }
    @Test
    public void canSetWindType(){
        trombone.setWindType(WindType.TRUMPET);
        assertEquals(WindType.TRUMPET, trombone.getWindType());
    }
    @Test
    public void hasValves(){
        assertEquals(3, trombone.getNoOfValves());
    }
    @Test
    public void canSetValves(){
        trombone.setNoOfValves(5);
        assertEquals(5, trombone.getNoOfValves());
    }
    @Test
    public void hasBuyingPrice(){
        assertEquals(100, trombone.getBuyingPrice(), 0.01);
    }
    @Test
    public void canSetBuyingPrice(){
        trombone.setBuyingPrice(200);
        assertEquals(200, trombone.getBuyingPrice(), 0.01);
    }
    @Test
    public void hasSellingPrice(){
        assertEquals(300, trombone.getSellingPrice(), 0.01);
    }
    @Test
    public void canSetSellingPrice(){
        trombone.setSellingPrice(400);
        assertEquals(400, trombone.getSellingPrice(), 0.01);
    }
    @Test
    public void canPlay(){
        assertEquals("PPPPAARRROOOOOOOOOOFFFFF!", trombone.play());
    }
    @Test
    public void canCalcMarkup(){
        assertEquals(300, trombone.calcMarkup(), 0.01);
    }
}
