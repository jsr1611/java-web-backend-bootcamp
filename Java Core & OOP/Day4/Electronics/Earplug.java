package Day4.Electronics;

import java.util.ArrayList;

public class Earplug extends SoundSystem{
    public Earplug(String name, int year){
        super(name, year);
    }

    @Override
    void sound() {
        System.out.printf("I am %s, I was made in %d,  so you can hear me only by plugging me into your ears.\n", this.getName(), this.getYear());
    }
}
