package Day4.Inheritance;

public class Pet extends Animal{
    protected String petName;
    public Pet(String name, String petName, Integer numLegs, String color, Boolean breastfeed) {
        super(name, numLegs, color, breastfeed);
        this.petName = petName;
    }

    @Override
    public void info() {
        super.info();
        System.out.println("My petname is " + petName + ".");
        // 12 27 방문 예비 소집
    }
    public void sound(){
        System.out.println("I make some sound.");
    }
}
