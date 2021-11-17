package Nov7.Practice;

public class Electronics extends Product {
    protected String model;
    protected Double inputVolts;

    public Electronics(Product product, String model, Double inputVolts) {
        super(product.name, product.price, product.manufacturer);
        this.model = model;
        this.inputVolts = inputVolts;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Double getInputVolts() {
        return inputVolts;
    }

    public void setInputVolts(Double inputVolts) {
        this.inputVolts = inputVolts;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.print(" I am of " + model + " model, and my input voltage is " + inputVolts + ".");
    }
}
