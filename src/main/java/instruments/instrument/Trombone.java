package instruments.instrument;

import instruments.Colour;
import instruments.InstrumentType;
import instruments.Material;
import instruments.groups.Wind;
import instruments.groups.WindType;

public class Trombone extends Wind {
    private double buyingPrice;
    private double sellingPrice;

    public Trombone(InstrumentType instrumentType, Material material, Colour colour, boolean requiresCase, WindType windType, int noOfValves, double buyingPrice, double sellingPrice){
        super(instrumentType, material, colour, requiresCase, windType, noOfValves);
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
    }

    public double getBuyingPrice() {
        return buyingPrice;
    }

    public void setBuyingPrice(double buyingPrice) {
        this.buyingPrice = buyingPrice;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }
}
