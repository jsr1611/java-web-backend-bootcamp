package Nov9;

public class KHOKIM extends Person {
    private String openDoors;

    public KHOKIM(String name, Integer age, Role roleInFamily, Role currentStatus, String openDoors) {
        super(name, age, roleInFamily, currentStatus);
        this.openDoors = openDoors;
    }

    @Override
    public String toString() {
        return "KHOKIM: " + getName() +
                "\nOpen to public: '" + openDoors + '\'';
    }
}
