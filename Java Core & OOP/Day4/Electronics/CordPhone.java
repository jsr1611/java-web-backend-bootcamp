package Day4.Electronics;

public class CordPhone extends Phones{
    public CordPhone(String name, int year){
        super(name, year);
    }

    @Override
    void sound() {
        System.out.printf("I am %s, I was made in %d. I can sound just like my parents: ring..., ring..., ring...!\n", this.getName(), this.getYear());
    }
}
