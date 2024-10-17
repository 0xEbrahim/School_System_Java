import java.util.Objects;

public class Employee extends Person{
    private float salary;
    private String rank, job;
    private String employeeID;
    Employee(){
        super();
    }
    Employee(String name, String address, String nationality, int age, float salary, String rank, String job, String empID){
        super(name, address, nationality, age);
        this.salary = salary;
        this.rank = rank;
        this.job = job;
        this.employeeID = empID;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public Boolean equal(Employee emp){
        return Objects.equals(this.employeeID, emp.employeeID);
    }
}
