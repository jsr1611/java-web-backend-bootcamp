package Day4.Transport;

public class Intercity extends Train{
    public Intercity(String name, Integer year, String route) {
        super(name, year, route);
    }

    @Override
    void info() {
        super.info();
        System.out.printf("I move people and goods from %s to %s.\n", route.substring(0, route.indexOf("-")), route.substring(route.indexOf("-")+1));
    }
}
