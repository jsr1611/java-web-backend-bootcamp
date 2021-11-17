package Day4.Electronics;

public class Phones extends ElectronicItem {

    public Phones(String name, int year) {
        super(name, year);
    }

    @Override
    void sound() {
        System.out.printf("I am %s, I was made in %d, I can make sound like ring..., ring..., ring...!", getName(), getYear());
    }
}
