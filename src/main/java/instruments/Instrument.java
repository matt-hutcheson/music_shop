package instruments;

public abstract class Instrument {
    private InstrumentType instrumentType;
    private Material material;
    private Colour colour;
    private boolean requiresCase;

    public Instrument(InstrumentType instrumentType, Material material, Colour colour, boolean requiresCase){
        this.instrumentType = instrumentType;
        this.material = material;
        this.colour = colour;
        this.requiresCase = requiresCase;
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
}
