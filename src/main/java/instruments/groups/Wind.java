package instruments.groups;

import instruments.Colour;
import instruments.InstrumentType;
import instruments.Material;

import instruments.Instrument;

public abstract class Wind extends Instrument {
    private WindType windType;
    private int noOfValves;

    public Wind(InstrumentType instrumentType, Material material, Colour colour, boolean requiresCase, double buyingPrice, double sellingPrice, WindType windType, int noOfValves){
        super(instrumentType, material, colour, requiresCase, buyingPrice, sellingPrice);
        this.windType = windType;
        this.noOfValves = noOfValves;
    }

    public WindType getWindType() {
        return windType;
    }

    public void setWindType(WindType type) {
        this.windType = type;
    }

    public int getNoOfValves() {
        return noOfValves;
    }

    public void setNoOfValves(int noOfValves) {
        this.noOfValves = noOfValves;
    }
}
