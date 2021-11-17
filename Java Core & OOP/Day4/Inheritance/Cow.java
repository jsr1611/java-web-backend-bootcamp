package Day4.Inheritance;

public class Cow extends Pet{
    public Cow( String petName, String color) {
        super("cow", petName, 4, color, true);
    }

    @Override
    public void sound() {
        System.out.println("I sound like moo!");
    }
}
