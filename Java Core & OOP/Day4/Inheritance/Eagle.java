package Day4.Inheritance;

public class Eagle extends Bird{
    public Eagle(String name, String color, Integer lenFeather) {
        super(name, 2, color, false, true, lenFeather);
    }

    @Override
    public void info() {
        super.info();
        System.out.println("We are kings in the sky!");
    }
}
