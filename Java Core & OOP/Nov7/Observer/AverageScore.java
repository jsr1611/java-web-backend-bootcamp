package Nov7.Observer;

public class AverageScore implements Observer{
    protected Integer predictedScore;
    protected Float runRate;

    public AverageScore(Integer predictedScore, Float runRate) {
        this.predictedScore = predictedScore;
        this.runRate = runRate;
    }

    public Integer getPredictedScore() {
        return predictedScore;
    }

    public void setPredictedScore(Integer predictedScore) {
        this.predictedScore = predictedScore;
    }

    public Float getRunRate() {
        return runRate;
    }

    public void setRunRate(Float runRate) {
        this.runRate = runRate;
    }

    @Override
    public void update() {
        System.out.println("Average score was updated!");
    }
    public void display(){
        System.out.println("Predicted score: " + predictedScore);
        System.out.println("Run rate: " + runRate);
    }

}
