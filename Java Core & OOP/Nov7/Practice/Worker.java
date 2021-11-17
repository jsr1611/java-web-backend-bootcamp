package Nov7.Practice;

public class Worker extends Person implements LivingBeing{
    protected Double salary;
    protected String profession;
    protected Person person;

    public Worker(Person person, Double salary, String profession) {
        super(person.firstName, person.lastName, person.citizenship);
        this.person = person;
        this.salary = salary;
        this.profession = profession;
    }

    public void work(){
        System.out.printf("I work as %s.", profession);
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

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.print(" I am "+profession + " and I make " + salary + " USD.");
    }
}
