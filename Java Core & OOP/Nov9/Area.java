package Nov9;

public class Area {
    protected String name;
    protected String capital;
    protected Double area;
    protected Integer population;

    public Area() {
    }

    public Area(String name, String capital, Double area, Integer population) {
        this.name = name;
        this.capital = capital;
        this.area = area;
        this.population = population;
    }

    public Area(Area area) {
        this.name = area.name;
        this.capital = area.capital;
        this.area = area.area;
        this.population = area.population;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }

    public Integer getPopulation() {
        return population;
    }

    public void setPopulation(Integer population) {
        this.population = population;
    }

    @Override
    public String toString() {
        return "Area: " + name +
                "\nCapital: " + capital +
                "\nArea: " + area +
                "\nPopulation: " + population;
    }
}
