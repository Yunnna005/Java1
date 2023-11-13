package PS8.b;

public class Computer {
    private Case computerCase;
    private String monitor;
    private String motherboard;

    Computer(Case computerCase, String monitor, String motherboard){
        setComputerCase(computerCase);
        setMonitor(monitor);
        setMotherboard(motherboard);
    }

    public void setComputerCase(Case computerCase) {
        this.computerCase = new Case(computerCase.getModel(), computerCase.getManufacturer(), computerCase.getPowerSupply(), computerCase.getDimensions());
    }
    public void setMonitor(String monitor) {
        this.monitor = monitor;
    }
    public void setMotherboard(String motherboard) {
        this.motherboard = motherboard;
    }

    public Case getComputerCase() {return new Case(computerCase.getModel(), computerCase.getManufacturer(), computerCase.getPowerSupply(), computerCase.getDimensions());}
    public String getMonitor() {return monitor;}
    public String getMotherboard() {return motherboard;}

    public String toString() {
        return "Case Details: "+getComputerCase()+"\nMonitor: "+getMonitor()+"\nMotherboard: "+getMotherboard();
    }
}
