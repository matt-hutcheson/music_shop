package instruments;

public abstract class Instrument implements ISell, IPlay {
    private InstrumentType instrumentType;
    private Material material;
    private Colour colour;
    private boolean requiresCase;
    private double buyingPrice;
    private double sellingPrice;
    private String stockType;

    public Instrument(InstrumentType instrumentType, Material material, Colour colour, boolean requiresCase, double buyingPrice, double sellingPrice){
        this.instrumentType = instrumentType;
        this.material = material;
        this.colour = colour;
        this.requiresCase = requiresCase;
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
        this.stockType = "Instrument";
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

    public double calcMarkup(){
        return (sellingPrice/buyingPrice)*100;
    }
}
