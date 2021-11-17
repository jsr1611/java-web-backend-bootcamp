package Day4.Transport;

public class Train extends Transport{
    protected String route;
    public Train(String name, Integer year, String route) {
        super(name, year);
        this.route = route;
    }

    @Override
    void info() {
        super.info();
        System.out.println("I run on railways and my route is limited to " + route + ".");
    }
}
