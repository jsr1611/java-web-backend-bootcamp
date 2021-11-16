package Day4.Electronics;

public class Phones extends ElectronicItems{
    private boolean canCall;

    public Phones(String name, int year, boolean hasSound, boolean canCall) {
        super(name, year, hasSound);
        this.canCall = canCall;
    }
}
