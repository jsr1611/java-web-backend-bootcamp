package Nov7.Practice;

public class Dog extends Animal{
    public Dog(Integer numEyes) {
        super(numEyes);
    }

    @Override
    public void sound() {
        System.out.println("I sound like woof!");
    }
}
