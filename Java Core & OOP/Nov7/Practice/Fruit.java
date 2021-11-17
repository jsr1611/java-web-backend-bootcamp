package Nov7.Practice;

public class Fruit extends Product{
    protected String color;

    public Fruit(Product product, String color) {
        super(product.name, product.price, product.manufacturer);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println(" I am " + color + " fruit.");
    }
}
