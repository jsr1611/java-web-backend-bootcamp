package Day4.Transport;

public class Car extends Vehicle{
    public Car(String name, Integer year, Integer numTires) {
        super(name, year, numTires);
    }

    @Override
    void info() {
        super.info();
        System.out.println("I am compact and very good for moving people.");
    }
}
