package Nov7.Aircraft;

public class FighterPlane extends Aircraft{
    private Object engine;

    public FighterPlane(String color, Object engine) {
        super(color, engine);
        this.engine = engine;
    }

    @Override
    public void start() {
        System.out.printf("Fighter plane started the engine %s. Plane color is %s.\n", engine, color);
    }

    @Override
    public void stop() {
        System.out.printf("Fighter plane stopped the engine %s. Plane color is %s.\n", engine, color);
    }

    @Override
    public void takeoff() {
        System.out.printf("Fighter plane has just taken off the land with the engine %s. Plane color is %s.\n", engine, color);
    }

    @Override
    public void land() {
        System.out.printf("Fighter plane has just landed with the engine %s. Plane color is %s.\n", engine, color);
    }
}
