package Nov7.Shape;

public class Circle extends Shape{
    private Double radius;

    public Circle(Double radius, String color){
        super(color);
        this.radius = radius;
    }

    @Override
    public Double area() {
        return Math.PI * radius * radius;
    }
}
