package Day4.Inheritance;

public class Dog extends Pet{
    public Dog(String petName, String color) {
        super("dog", petName, 4, color, true);
    }

    @Override
    public void sound() {
        System.out.println("I sound like woof!");
    }
}
