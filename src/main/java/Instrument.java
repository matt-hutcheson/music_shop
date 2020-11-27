public class Instrument {
    private InstrumentType type;
    private Material material;
    private Colour colour;
    private boolean requiresCase;

    public Instrument(InstrumentType type, Material material, Colour colour, boolean requiresCase){
        this.type = type;
        this.material = material;
        this.colour = colour;
        this.requiresCase = requiresCase;
    }

    public InstrumentType getType() {
        return type;
    }

    public void setType(InstrumentType type) {
        this.type = type;
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

    public boolean isRequiresCase() {
        return requiresCase;
    }

    public void setRequiresCase(boolean requiresCase) {
        this.requiresCase = requiresCase;
    }
}
