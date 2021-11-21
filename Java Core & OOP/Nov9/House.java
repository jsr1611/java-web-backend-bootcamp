package Nov9;

public class House {
    private String familyHead;
    private Integer numOfMembers;
    private Person[] members;

    public House(String familyHead, Integer numOfMembers, Person[] members) {
        this.familyHead = familyHead;
        this.numOfMembers = numOfMembers;
        this.members = members;
    }

    public String getFamilyHead() {
        return familyHead;
    }

    public void setFamilyHead(String familyHead) {
        this.familyHead = familyHead;
    }

    public Integer getNumOfMembers() {
        return numOfMembers;
    }

    public void setNumOfMembers(Integer numOfMembers) {
        this.numOfMembers = numOfMembers;
    }

    public Person[] getMembers() {
        return members;
    }

    public void setMembers(Person[] members) {
        this.members = members;
    }
}
