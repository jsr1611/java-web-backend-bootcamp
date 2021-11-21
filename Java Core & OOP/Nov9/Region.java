package Nov9;

import java.util.Arrays;

public class Region extends Area{
    private KHOKIM khokim;
    private District[] districts;

    public Region(Area area, KHOKIM khokim, District[] districts) {
        super(area);
        this.khokim = khokim;
        this.districts = districts;
    }

    public KHOKIM getKhokim() {
        return khokim;
    }

    public void setKhokim(KHOKIM khokim) {
        this.khokim = khokim;
    }

    public District[] getDistricts() {
        return districts;
    }

    public void setDistricts(District[] districts) {
        this.districts = districts;
    }

    @Override
    public String toString() {
        return "Region: " + name +
                "\nCapital: " + capital +
                "\nArea: " + area +
                "\nPopulation: " + population;
    }
}
