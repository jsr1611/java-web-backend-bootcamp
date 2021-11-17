package Day4.Inheritance;

public class Bird extends Animal{
    protected Integer lenFeather;  //in cm
    protected Boolean canFly;
    public Bird(String name, Integer numLegs, String color, Boolean breastfeed, Boolean canFly, Integer lenFeather) {
        super(name, numLegs, color, breastfeed);
        this.canFly = canFly;
        this.lenFeather = lenFeather;
    }

    @Override
    public void info() {
        super.info();
        if(canFly){
            System.out.printf("My feather is %d cm long and I can fly.", lenFeather);
        }
        else {
            System.out.printf("My feather is %d cm long but I cannot fly.", lenFeather);
        }
    }
}
