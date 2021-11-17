package Nov7.Practice;

public class TV extends Technics implements RemoteControllable{
    protected Integer numChannels;

    public TV(Product product, String model, Double inputVolts, Integer numChannels) {
        super(product, model, inputVolts);
        this.numChannels = numChannels;
    }

    @Override
    public void switchChannel(Integer newChannelNumber) {
        System.out.printf("Channel was changed to %d!\n", newChannelNumber);
    }

    @Override
    public void changeVolume(Integer newVolumeLevel) {
        if(newVolumeLevel < 0){
            System.out.printf("Volume was decreased for %d", Math.abs(newVolumeLevel));
        }
        else {
            System.out.printf("Volume was increased for %d", newVolumeLevel);
        }
    }

    @Override
    public void changeSettings() {
        System.out.println("Changed TV Settings...");
    }

    public Integer getNumChannels() {
        return numChannels;
    }

    public void setNumChannels(Integer numChannels) {
        this.numChannels = numChannels;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println(" I have " + numChannels + " channels!");
    }
}
