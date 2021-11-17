package Day4.Transport;

public class Transport {
    protected String name;
    protected Integer year;

    public Transport(String name, Integer year) {
        this.name = name;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    void info(){
        System.out.printf("I am %s, as a means of transport I was manufactured in %d.\n", name, year);
    }

}
