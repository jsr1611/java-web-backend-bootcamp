package Nov7.Observer;

public class CurrentScore implements Observer{
    protected Integer runs;
    protected Integer wickets;
    protected Float overs;

    public CurrentScore(Integer runs, Integer wickets, Float overs) {
        this.runs = runs;
        this.wickets = wickets;
        this.overs = overs;
    }

    public Integer getRuns() {
        return runs;
    }

    public void setRuns(Integer runs) {
        this.runs = runs;
    }

    public Integer getWickets() {
        return wickets;
    }

    public void setWickets(Integer wickets) {
        this.wickets = wickets;
    }

    public Float getOvers() {
        return overs;
    }

    public void setOvers(Float overs) {
        this.overs = overs;
    }

    @Override
    public void update() {
        System.out.println("Current score was updated.");
    }

    public void display(){
        System.out.println("Runs: " + runs);
        System.out.println("Wickets: " + wickets);
        System.out.println("Overs: " + overs);
    }
}
