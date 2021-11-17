package Nov7.Practice;

public class Auto extends Technics{
    protected String color;
    protected Integer numSeats;

    public Auto(Product product, String model, Double inputVolts, String color, Integer numSeats) {
        super(product, model, inputVolts);
        this.color = color;
        this.numSeats = numSeats;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getNumSeats() {
        return numSeats;
    }

    public void setNumSeats(Integer numSeats) {
        this.numSeats = numSeats;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println(" I am " + color + " and I can have " + numSeats + " people inside.");
    }
}
