package Nov7.Practice;

public class Bird extends Animal implements CanFly{
    protected String name;

    public Bird(Integer numEyes, String name) {
        super(numEyes);
        this.name = name;
    }

    @Override
    public void takeoff() {
        System.out.println("I fly with the help of my feathers");
    }

    @Override
    public void land() {
        System.out.println("I can land anywhere except water or mud!");
    }

    @Override
    public void printInfo() {
        System.out.println("I am " + name + ". I have " + numEyes + " eyes.");
    }
}
