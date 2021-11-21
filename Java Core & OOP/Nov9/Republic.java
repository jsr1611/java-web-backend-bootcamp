package Nov9;

import java.util.Arrays;

public class Republic extends Area{
    private Region[] regions;
    private President president;
    private String language;

    public Republic(Area area, Region[] regions, President president, String language) {
        super(area);
        this.regions = regions;
        this.president = president;
        this.language = language;
    }

    public Region[] getRegions() {
        return regions;
    }

    public void setRegions(Region[] regions) {
        this.regions = regions;
    }

    public President getPresident() {
        return president;
    }

    public void setPresident(President president) {
        this.president = president;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    public String toString() {
        return "Republic: " + name +
                "\nCapital: " + capital +
                "\nPresident: " + president.getName() +
                "\nArea: " + area +
                "\nPopulation: " + population +
                "\nLanguage: " + language;
    }
}
