package Nov7.Practice;

public class Technics extends Electronics implements Controllable{
    public Technics(Product product, String model, Double inputVolts) {
        super(product, model, inputVolts);
    }

    @Override
    public void turnOn() {
        System.out.println("I can be turned on!");
    }

    @Override
    public void turnOff() {
        System.out.println("I can be turned off!");
    }

    @Override
    public void repair() {
        System.out.println("I can be repaired!");
    }

}
