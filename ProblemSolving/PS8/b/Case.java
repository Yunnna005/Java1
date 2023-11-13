package PS8.b;

public class Case {
    private String model;
    private String manufacturer;
    private int powerSupply;
    private Dimension dimensions;

    public Case(String model, String manufacture, int powerSupply, Dimension dimensions){
        setModel(model);
        setManufacturer(manufacture);
        setPowerSupply(powerSupply);
        setDimensions(dimensions);
    }

    public void setModel(String model) {
        this.model = model;
    }
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
    public void setPowerSupply(int powerSupply) {
        this.powerSupply = powerSupply;
    }
    public void setDimensions(Dimension dimensions) {
        this.dimensions = new Dimension(dimensions.getLenght(), dimensions.getWidth(), dimensions.getHeight());
    }

    public String getModel() {return model;}
    public String getManufacturer() {return manufacturer;}
    public int getPowerSupply() {return powerSupply;}
    public Dimension getDimensions() {return new Dimension(dimensions.getLenght(), dimensions.getWidth(), dimensions.getHeight());}

    public String toString() {
        return "Model: "+getModel()+" Manufacturer: "+getManufacturer()+" Power Supply: "+getPowerSupply()+ "V"+" Dimensions: "+getDimensions();
    }
}
