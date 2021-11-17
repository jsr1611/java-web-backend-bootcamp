package Nov7.Aircraft;

public class PropellerPlane extends Aircraft{
    private Integer propellers;

    public PropellerPlane(String color, Object engine, Integer propellers) {
        super(color, engine);
        this.propellers = propellers;
    }

    @Override
    public void start() {
        System.out.printf("Propeller plane started the engine %s with %d propellers. Plane color is %s.\n", engine, propellers, color);
    }

    @Override
    public void stop() {
        System.out.printf("Propeller plane stopped the engine %s with %d propellers. Plane color is %s.\n", engine, propellers, color);
    }

    @Override
    public void takeoff() {
        System.out.printf("Propeller plane has just taken off the land with %d propellers. Plane color is %s.\n", propellers, color);
    }

    @Override
    public void land() {
        System.out.printf("Propeller plane has just landed with %d propellers. Plane color is %s.\n", propellers, color);
    }
}
