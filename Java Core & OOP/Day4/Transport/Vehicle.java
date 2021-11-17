package Day4.Transport;

public class Vehicle extends Transport{
    protected Integer numTires;
    public Vehicle(String name, Integer year, Integer numTires){
        super(name, year);
        this.numTires = numTires;
    }

    public Integer getNumTires() {
        return numTires;
    }

    public void setNumTires(Integer numTires) {
        this.numTires = numTires;
    }

    @Override
    void info() {
        super.info();
        System.out.printf("I have %d tires.", numTires);
    }
}
