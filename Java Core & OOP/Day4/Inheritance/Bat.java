package Day4.Inheritance;

public class Bat extends Bird{
    public Bat(String name, String color, Integer lenFeather) {
        super(name, 4, color, true, true, lenFeather);
    }

    @Override
    public void info() {
        super.info();
        System.out.println("I hunt during the night! So, you almost don't see me during the day.");
    }
}
