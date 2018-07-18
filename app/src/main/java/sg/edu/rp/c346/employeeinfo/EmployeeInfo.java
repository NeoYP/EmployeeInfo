package sg.edu.rp.c346.employeeinfo;

public class EmployeeInfo {

    private String name;
    private String title;
    private double salary;

    public EmployeeInfo(String name, String title, double salary) {
        this.name = name;
        this.title = title;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "EmployeeInfo{" + "name='" + name + '\'' + ", title='" + title + '\'' + ", salary='" + salary + '\'' + '}';
    }
}