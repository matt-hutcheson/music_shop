package instruments.instrument;

import instruments.Colour;
import instruments.InstrumentType;
import instruments.Material;
import instruments.groups.Wind;
import instruments.groups.WindType;

public class Trombone extends Wind {

    public Trombone(InstrumentType instrumentType, Material material, Colour colour, boolean requiresCase, double buyingPrice, double sellingPrice, WindType windType, int noOfValves){
        super(instrumentType, material, colour, requiresCase, buyingPrice, sellingPrice, windType, noOfValves);
    }

    public String play(){
        return "PPPPAARRROOOOOOOOOOFFFFF!";
    }

    public double calcMarkup(){
        return (this.getSellingPrice()/this.getBuyingPrice())*100;
    }
}
