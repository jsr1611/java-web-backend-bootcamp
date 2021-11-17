package Day4.Inheritance;

public class Straus extends Bird{
    public Straus(String name, String color, Integer lenFeather) {
        super(name, 2, color, false, false, lenFeather);
    }

    @Override
    public void info() {
        super.info();
        System.out.println("My eggs are the biggest among birds.");
    }
}
