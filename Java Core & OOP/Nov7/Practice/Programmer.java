package Nov7.Practice;

import java.lang.reflect.WildcardType;

public class Programmer extends Worker {
    protected String language;
    protected String laptopModel;

    public Programmer(Worker worker, String language, String laptopModel) {
        super(worker.person, worker.salary, worker.profession);
        this.language = language;
        this.laptopModel = laptopModel;
    }

    @Override
    public void sleep() {
        System.out.println("Should I sleep, I don't know, but I sleep more than 8 hours per day!");
    }

    @Override
    public void eat() {
        System.out.println("I eat while coding...");
    }

    @Override
    public void walk() {
        System.out.println("I know I must walk away from sitting in one place at least once a while but I don't do it.");
    }

    @Override
    public void work() {
        System.out.println("I work as a java software engineer");
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getLaptopModel() {
        return laptopModel;
    }

    public void setLaptopModel(String laptopModel) {
        this.laptopModel = laptopModel;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println(" I code in " + language + ". My laptop is " + laptopModel + ".");
    }
}
