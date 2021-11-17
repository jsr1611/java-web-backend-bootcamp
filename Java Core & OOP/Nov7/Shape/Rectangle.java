package Nov7.Shape;

public class Rectangle extends Shape{
    private Double length;
    private Double width;

    public Rectangle(String color, Double length, Double width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    @Override
    public Double area() {
        return length * width;
    }
}
