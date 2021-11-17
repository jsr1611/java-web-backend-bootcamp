package Day4.Electronics;

public class MobilePhone extends Phones{
    public MobilePhone(String name, int year){
        super(name, year);
    }

    @Override
    void sound() {
        System.out.printf("I am a %s, I was made in %d. I make sound as well as I can sing a song\n", this.getName(), this.getYear());
    }
}
