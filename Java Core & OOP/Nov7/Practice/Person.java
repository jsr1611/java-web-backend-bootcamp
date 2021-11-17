package Nov7.Practice;

public class Person implements LivingBeing{
    protected String firstName;
    protected String lastName;
    protected String citizenship;

    public Person(String firstName, String lastName, String citizenship) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.citizenship = citizenship;
    }

    @Override
    public void sleep() {
        System.out.println("I can sleep for less than 5 hours per day");
    }

    @Override
    public void eat() {
        System.out.println("I eat only halal food.");
    }

    @Override
    public void walk() {
        System.out.println("I like walking after the lunch for about 30 minutes to help digest my food.");
    }

    @Override
    public void printInfo() {
        System.out.print("I am " + firstName + " " + lastName + " from " + citizenship + ".");
    }
}
