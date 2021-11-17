package Day4.Electronics;

public class Stereo extends SoundSystem{
    public Stereo(String name, int year){
        super(name, year);
    }

    @Override
    void sound() {
        System.out.printf("I am %s, I was made in %d, so my sound is heard in a distance!\n", this.getName(), this.getYear());
    }
}
