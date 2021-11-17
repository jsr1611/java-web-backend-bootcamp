package Nov7.Practice;

public class Teacher extends Worker{
    protected String majorSubject;
    protected Integer numStudents;
    protected Integer level;

    public Teacher(Worker worker, String majorSubject, Integer numStudents, Integer level) {
        super(worker.person, worker.salary, worker.profession);
        this.majorSubject = majorSubject;
        this.numStudents = numStudents;
        this.level = level;
    }

    public String getMajorSubject() {
        return majorSubject;
    }

    public void setMajorSubject(String majorSubject) {
        this.majorSubject = majorSubject;
    }

    public Integer getNumStudents() {
        return numStudents;
    }

    public void setNumStudents(Integer numStudents) {
        this.numStudents = numStudents;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }
}
