public class Employee {
    private String firstName;
    private String lastName;
    private String pesel;
    private String section;
    private int salary;

    public Employee() {
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", pesel='" + pesel + '\'' +
                ", section='" + section + '\'' +
                ", salary=" + salary +
                '}';
    }

    public Employee(String firstName, String lastName, String pesel, String section, int salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.pesel = pesel;
        this.section = section;
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }


}

