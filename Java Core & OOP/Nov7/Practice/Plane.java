package Nov7.Practice;

public class Plane extends Technics{
    protected String color;
    protected Integer numPassengers;

    public Plane(Product product, Technics technics, String color, Integer numPassengers) {
        super(product, technics.model, technics.inputVolts);
        this.color = color;
        this.numPassengers = numPassengers;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getNumPassengers() {
        return numPassengers;
    }

    public void setNumPassengers(Integer numPassengers) {
        this.numPassengers = numPassengers;
    }


    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println(" I am " + color + " and I can fly with " + numPassengers + " people into the air!");
    }
}
