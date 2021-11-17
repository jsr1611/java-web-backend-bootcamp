package Day4.Inheritance;

public class Animal {
    protected String name;
    protected Integer numLegs;
    protected String color;
    protected Boolean breastfeed;

    public Animal(String name, Integer numLegs, String color, Boolean breastfeed) {
        this.name = name;
        this.numLegs = numLegs;
        this.color = color;
        this.breastfeed = breastfeed;
    }

    public void info(){
        System.out.printf("I am %s, a kind of animal. I am %s and have %d legs.", name, color, numLegs);
        if(breastfeed){
            System.out.println("I breastfeed.");
        }
        else {
            System.out.println();
        }
    }
}
