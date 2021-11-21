package Nov9;

import java.util.Arrays;

public class Mahalla extends Area{
    private KHOKIM khokim;
    private House[] houses;

    public Mahalla(Area area, KHOKIM khokim, House[] houses) {
        super(area);
        this.khokim = khokim;
        this.houses = houses;
    }

    @Override
    public String toString() {
        return "Mahalla: " + name +
                "\nKhokim: " + khokim.getName() +
                "\nArea: " + area +
                "\nNumber of households: " + houses.length;
    }
}
