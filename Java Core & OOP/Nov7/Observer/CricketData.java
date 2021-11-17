package Nov7.Observer;

public class CricketData implements Subject{
    protected Integer runs;
    protected Integer wickets;
    protected Float overs;
    protected Observer[] observers;

    public CricketData(Integer runs, Integer wickets, Float overs, Observer[] observers) {
        this.runs = runs;
        this.wickets = wickets;
        this.overs = overs;
        this.observers = observers;
    }

    @Override
    public void registerObserver(Observer o) {

    }

    @Override
    public void unregisterObserver(Observer o) {

    }

    @Override
    public void notifyObserver() {

    }

    public Integer getLatestRuns(){
        return runs;
    }

    public Integer getLatestWickets(){
        return wickets;
    }

    public Integer getLatestOvers(){
        return Math.round(overs);
    }
}
