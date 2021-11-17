package Nov7.Practice;

public class Cat extends Animal{
    protected String petName;

    public Cat(Integer numEyes, String petName) {
        super(numEyes);
        this.petName = petName;
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    @Override
    public void sound() {
        System.out.println("I sound like meow!");
    }

    @Override
    public void printInfo() {
        System.out.println("I am a cat named " + petName  + " and I have " + numEyes + ".");
    }
}
