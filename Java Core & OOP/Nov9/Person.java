package Nov9;

public class Person {
    private String name;
    private Integer age;
    private Role roleInFamily;
    private Role currentStatus;

    public Person(String name, Integer age, Role roleInFamily, Role currentStatus) {
        this.name = name;
        this.age = age;
        this.roleInFamily = roleInFamily;
        this.currentStatus = currentStatus;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Role getRoleInFamily() {
        return roleInFamily;
    }

    public void setRoleInFamily(Role roleInFamily) {
        this.roleInFamily = roleInFamily;
    }

    public Role getCurrentStatus() {
        return currentStatus;
    }

    public void setCurrentStatus(Role currentStatus) {
        this.currentStatus = currentStatus;
    }

    @Override
    public String toString() {
        return "Person: " + name  +
                "\nAge: " + age +
                "\nRoleInFamily: " + roleInFamily +
                "\nCurrentStatus=" + currentStatus;
    }
}
