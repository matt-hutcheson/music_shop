import accessories.SpareString;
import instruments.Colour;
import instruments.InstrumentType;
import instruments.Material;
import instruments.groups.KeyType;
import instruments.groups.StringType;
import instruments.instrument.Guitar;
import instruments.instrument.Piano;
import org.junit.Before;
import org.junit.Test;
import shop.Shop;

import static org.junit.Assert.assertEquals;

public class ShopTest {
    private Shop shop;
    private Piano piano;
    private SpareString spareString;
    private Guitar guitar;

    @Before
    public void setUp(){
        shop = new Shop();
        piano = new Piano(InstrumentType.KEY, Material.WOOD, Colour.BLACK, false, 1000, 3000, KeyType.PIANO, 88, false);
        spareString = new SpareString(2, 8);
        guitar = new Guitar(InstrumentType.STRING, Material.WOOD, Colour.NATURAL, true, 100, 300, StringType.GUITAR, 6, false);
    }
    @Test
    public void canAddStock(){
        shop.addStock(piano);
        shop.addStock(spareString);
        shop.addStock(guitar);
        assertEquals(3, shop.getStock().size());
    }
    @Test
    public void canCalcPotentialProfit(){
        shop.addStock(piano);
        shop.addStock(spareString);
        shop.addStock(guitar);
        shop.calcPotentialProfit();
        assertEquals(2206, shop.getPotentialProfit(), 0.01);
    }
}
