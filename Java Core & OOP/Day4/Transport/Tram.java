package Day4.Transport;

public class Tram extends Train{
    public Tram(String name, Integer year, String route) {
        super(name, year, route);
    }

    @Override
    void info() {
        super.info();
        System.out.println("I move people inside " + route + ".");
    }
}
