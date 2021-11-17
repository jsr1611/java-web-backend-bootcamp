package Nov7.Practice;

public class Phone extends Technics{
    protected Integer internalMemory;

    public Phone(Product product, Technics technics, Integer internalMemory) {
        super(product, technics.model, technics.inputVolts);
        this.internalMemory = internalMemory;
    }

    public Integer getInternalMemory() {
        return internalMemory;
    }

    public void setInternalMemory(Integer internalMemory) {
        this.internalMemory = internalMemory;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println(" My internal memory is " + internalMemory + " GB.");
    }
}

