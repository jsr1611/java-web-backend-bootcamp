package Day4.Transport;

public class Truck extends Vehicle{
    public Truck(String name, Integer year, Integer numTires) {
        super(name, year, numTires);
    }

    @Override
    void info() {
        super.info();
        System.out.println("I transfer your goods from one place to another!");
    }
}
