package Nov7.Practice;
public class Doctor extends Worker {
    protected String major;
    protected String colorOfDress;

    public Doctor(Worker worker, String major, String colorOfDress) {
        super(worker.person, worker.salary, worker.profession);
        this.major = major;
        this.colorOfDress = colorOfDress;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getColorOfDress() {
        return colorOfDress;
    }

    public void setColorOfDress(String colorOfDress) {
        this.colorOfDress = colorOfDress;
    }
}
