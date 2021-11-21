package Nov9;

import java.util.Arrays;

public class District extends Area{
    private KHOKIM khokim;
    private Mahalla[] mahallas;

    public District(Area area, KHOKIM khokim, Mahalla[] mahallas) {
        super(area);
        this.khokim = khokim;
        this.mahallas = mahallas;

    }

    public KHOKIM getKhokim() {
        return khokim;
    }

    public void setKhokim(KHOKIM khokim) {
        this.khokim = khokim;
    }

    public Mahalla[] getMahallas() {
        return mahallas;
    }

    public void setMahallas(Mahalla[] mahallas) {
        this.mahallas = mahallas;
    }

    @Override
    public String toString() {
        return "District: " + name +
                "\nCapital: " + capital +
                "\nArea: " + area +
                "\nPopulation: " + population;
    }
}
