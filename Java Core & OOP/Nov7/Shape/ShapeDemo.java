package Nov7.Shape;

public class ShapeDemo {
    public static void main(String[] args) {
        Shape cirle =new Circle(2.5, "yellow");
        System.out.println("I am a " + cirle.getColor() + " circle.");
        System.out.printf("My area is: %.2f.\n",cirle.area());


        Rectangle rect = new Rectangle("green", 10.0, 5.0);
        System.out.println("I am a " + rect.getColor() + " rectangle.");
        System.out.printf("My area is: %.2f.\n",rect.area());

    }
}
