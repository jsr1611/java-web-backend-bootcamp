package Day4.Electronics;

public class SoundSystem extends ElectronicItem {
    public SoundSystem(String name, int year ){
        super(name, year);
    }

    @Override
    void sound() {
        System.out.printf("I am a %s, I was made in %d and I am to make a sound!", this.getName(), this.getYear());
    }
}
