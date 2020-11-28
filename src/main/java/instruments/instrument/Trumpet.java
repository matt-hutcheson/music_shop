package instruments.instrument;

import instruments.Colour;
import instruments.InstrumentType;
import instruments.Material;
import instruments.groups.Wind;
import instruments.groups.WindType;

public class Trumpet extends Wind {
    public Trumpet(InstrumentType instrumentType, Material material, Colour colour, boolean requiresCase, double buyingPrice, double sellingPrice, WindType windType, int noOfValves){
        super(instrumentType, material, colour, requiresCase, buyingPrice, sellingPrice, windType, noOfValves);
    }

    public String play(){
        return "Toot Toot!";
    }
}
