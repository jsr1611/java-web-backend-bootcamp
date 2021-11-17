package Nov7.Practice;

public class Product implements Printable{
    protected String name;
    protected Double price;
    protected String manufacturer;

    public Product(String name, Double price, String manufacturer) {
        this.name = name;
        this.price = price;
        this.manufacturer = manufacturer;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void printInfo() {
        System.out.print("It is " + name + " manufactured by " + manufacturer + ". Price is " + price + " USD.");
    }

}
