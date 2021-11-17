package Day4.Electronics;

public class ElectronicItem {
    private String name;
    private int year;


    public ElectronicItem(String name, int year) {
        this.name = name;
        this.year = year;
    }

    void sound(){
        System.out.printf("I am %s, I was made in %d, I make some sound.\n", name, year);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
