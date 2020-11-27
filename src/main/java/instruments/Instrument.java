package instruments;

public abstract class Instrument implements ISell {
    private InstrumentType instrumentType;
    private Material material;
    private Colour colour;
    private boolean requiresCase;
    private double buyingPrice;
    private double sellingPrice;

    public Instrument(InstrumentType instrumentType, Material material, Colour colour, boolean requiresCase, double buyingPrice, double sellingPrice){
        this.instrumentType = instrumentType;
        this.material = material;
        this.colour = colour;
        this.requiresCase = requiresCase;
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
    }

    public InstrumentType getInstrumentType() {
        return instrumentType;
    }

    public void setInstrumentType(InstrumentType type) {
        this.instrumentType = type;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public Colour getColour() {
        return colour;
    }

    public void setColour(Colour colour) {
        this.colour = colour;
    }

    public boolean getRequiresCase() {
        return requiresCase;
    }

    public void setRequiresCase(boolean requiresCase) {
        this.requiresCase = requiresCase;
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
