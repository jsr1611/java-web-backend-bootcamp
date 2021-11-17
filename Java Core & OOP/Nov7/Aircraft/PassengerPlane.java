package Nov7.Aircraft;

public class PassengerPlane extends Aircraft{
    private Integer passengers;

    public PassengerPlane(String color, Object engine, Integer passengers) {
        super(color, engine);
        this.passengers = passengers;
    }

    @Override
    public void start() {
        System.out.printf("Passenger plane started the engine %s with %d passengers. Plane color is %s.\n", engine, passengers, color);
    }

    @Override
    public void stop() {
        System.out.printf("Passenger plane stopped the engine %s with %d passengers. Plane color is %s.\n", engine, passengers, color);
    }

    @Override
    public void takeoff() {
        System.out.printf("Passenger plane has taken off the land with %d passengers. Plane color is %s.\n", passengers, color);
    }

    @Override
    public void land() {
        System.out.printf("Passenger plane has just landed with %d passengers. Plane color is %s.\n", passengers, color);
    }
}
