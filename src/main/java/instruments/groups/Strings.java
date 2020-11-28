package instruments.groups;

import instruments.Colour;
import instruments.Instrument;
import instruments.InstrumentType;
import instruments.Material;

public abstract class Strings extends Instrument {
    private StringType stringType;
    private int noOfStrings;
    private boolean usesBow;

    public Strings(InstrumentType instrumentType, Material material, Colour colour, boolean requiresCase, double buyingPrice, double sellingPrice, StringType stringType, int noOfStrings, boolean usesBow){
        super(instrumentType, material, colour, requiresCase, buyingPrice, sellingPrice);
        this.stringType = stringType;
        this.noOfStrings = noOfStrings;
        this.usesBow = usesBow;
    }

    public StringType getStringType() {
        return stringType;
    }

    public void setStringType(StringType stringType) {
        this.stringType = stringType;
    }

    public int getNoOfStrings() {
        return noOfStrings;
    }

    public void setNoOfStrings(int noOfStrings) {
        this.noOfStrings = noOfStrings;
    }

    public boolean getUsesBow() {
        return usesBow;
    }

    public void setUsesBow(boolean usesBow) {
        this.usesBow = usesBow;
    }
}
