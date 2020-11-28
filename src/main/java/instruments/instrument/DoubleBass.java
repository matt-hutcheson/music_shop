package instruments.instrument;

import instruments.Colour;
import instruments.InstrumentType;
import instruments.Material;
import instruments.groups.StringType;
import instruments.groups.Strings;

public class DoubleBass extends Strings {
    public DoubleBass(InstrumentType instrumentType, Material material, Colour colour, boolean requiresCase, double buyingPrice, double sellingPrice, StringType stringType, int noOfStrings, boolean usesBow){
        super(instrumentType, material, colour, requiresCase, buyingPrice, sellingPrice, stringType, noOfStrings, usesBow);
    }

    public String play(){
        return "Plink Plonk";
    }
}
