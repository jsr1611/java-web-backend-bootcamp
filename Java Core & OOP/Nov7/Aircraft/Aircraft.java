package Nov7.Aircraft;

import java.util.Objects;

public abstract class Aircraft {
    protected String color;
    protected Object engine;

    public Aircraft(String color, Object engine) {
        this.color = color;
        this.engine = engine;
    }

    public abstract void start();
    public abstract void stop();
    public abstract void takeoff();
    public abstract void land();
}
