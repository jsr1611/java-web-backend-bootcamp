package Nov7.Practice;

public class Animal implements LivingBeing{
    Integer numEyes = 2;

    public Animal(Integer numEyes) {
        this.numEyes = numEyes;
    }

    public void sound(){
        System.out.println("I make some sound.");
    }

    @Override
    public void sleep() {
        System.out.println("I sleep.");
    }

    @Override
    public void eat() {
        System.out.println("I eat.");
    }

    @Override
    public void walk() {
        System.out.println("I walk.");
    }

    @Override
    public void printInfo() {
        System.out.println("I am an animal with " + numEyes + " eyes.");
    }
}
