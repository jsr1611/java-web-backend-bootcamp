package Nov7.Practice;

public class Student extends Person{
    protected String nameOfUniversity;
    protected Double stipend;

    public Student(Person person, String nameOfUniversity, Double stipend) {
        super(person.firstName, person.lastName, person.citizenship);
        this.nameOfUniversity = nameOfUniversity;
        this.stipend = stipend;
    }

    public String getNameOfUniversity() {
        return nameOfUniversity;
    }

    public void setNameOfUniversity(String nameOfUniversity) {
        this.nameOfUniversity = nameOfUniversity;
    }

    public Double getStipend() {
        return stipend;
    }

    public void setStipend(Double stipend) {
        this.stipend = stipend;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("I attend " + nameOfUniversity + ". My stipend is " + stipend + " USD.");
    }
}
