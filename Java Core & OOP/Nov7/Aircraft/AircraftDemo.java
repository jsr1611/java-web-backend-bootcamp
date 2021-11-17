package Nov7.Aircraft;

public class AircraftDemo {
    public static void main(String[] args) {
        Aircraft plane = new PassengerPlane("white", "Airbus", 500);
        plane.start();
        plane.takeoff();
        plane.land();
        plane.stop();

        Aircraft propeller = new PropellerPlane("black", "Falcon", 100);
        propeller.start();
        propeller.takeoff();
        propeller.land();
        propeller.stop();

        Aircraft fighter = new FighterPlane("blue", "K9");
        fighter.start();
        fighter.takeoff();
        fighter.land();
        fighter.stop();

    }
}
