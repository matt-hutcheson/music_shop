package instruments.instrument;

import instruments.Colour;
import instruments.InstrumentType;
import instruments.Material;
import instruments.groups.KeyType;
import instruments.groups.Keys;

public class Piano extends Keys {
    public Piano(InstrumentType instrumentType, Material material, Colour colour, boolean requiresCase, double buyingPrice, double sellingPrice, KeyType keysType, int noOfKeys, boolean electric){
        super(instrumentType,material,colour,requiresCase,buyingPrice,sellingPrice,keysType,noOfKeys,electric);
    }

    public String play(){
        return "Classical Plonking";
    }
}
