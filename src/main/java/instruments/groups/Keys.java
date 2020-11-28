package instruments.groups;

import instruments.Colour;
import instruments.Instrument;
import instruments.InstrumentType;
import instruments.Material;

public abstract class Keys extends Instrument {
    private KeyType keysType;
    private int noOfKeys;
    private boolean electric;

    public Keys(InstrumentType instrumentType, Material material, Colour colour, boolean requiresCase, double buyingPrice, double sellingPrice, KeyType keysType, int noOfKeys, boolean electric){
        super(instrumentType, material, colour, requiresCase, buyingPrice, sellingPrice);
        this.keysType = keysType;
        this.noOfKeys = noOfKeys;
        this.electric = electric;
    }

    public KeyType getKeysType() {
        return keysType;
    }

    public void setKeysType(KeyType keysType) {
        this.keysType = keysType;
    }

    public int getNoOfKeys() {
        return noOfKeys;
    }

    public void setNoOfKeys(int noOfKeys) {
        this.noOfKeys = noOfKeys;
    }

    public boolean getElectric() {
        return electric;
    }

    public void setElectric(boolean electric) {
        this.electric = electric;
    }
}
