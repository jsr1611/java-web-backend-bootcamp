package Day4.Inheritance;

public class Cat extends Pet{
    public Cat(String petName, String color) {
        super("cat", petName, 4, color, true);
    }

    @Override
    public void sound() {
        System.out.println("I sound like meow!");
    }
}
