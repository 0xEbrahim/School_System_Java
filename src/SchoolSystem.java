import javax.lang.model.type.NullType;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class SchoolSystem extends Building implements ISchoolSystem{
    private List<HourlyEmployee>HEmployees;
    private List<SalariedEmployee>SEmployees;
    private List<Student>Students;
    private int number_of_classes;
    SchoolSystem(){
        number_of_classes = 0;
        HEmployees = new ArrayList<HourlyEmployee>();
        SEmployees = new ArrayList<SalariedEmployee>();
        Students = new ArrayList<Student>();
    }
    SchoolSystem(String name, String address, int floors, Person owner, List<HourlyEmployee>HEmployees, List<SalariedEmployee>SEmployees, List<Student>Students, int number_of_classes){
        super(name, address, floors, owner);
        this.HEmployees = HEmployees;
        this.Students = Students;
        this.SEmployees = SEmployees;
        this.number_of_classes = number_of_classes;
    }
    SchoolSystem(String name, String address, int floors, Person owner, int number_of_classes){
        super(name, address, floors, owner);
        HEmployees = new ArrayList<HourlyEmployee>();
        SEmployees = new ArrayList<SalariedEmployee>();
        Students = new ArrayList<Student>();
        this.number_of_classes = number_of_classes;
    }
    public List<HourlyEmployee> getHEmployees() {
        return HEmployees;
    }

    public List<SalariedEmployee> getSEmployees() {
        return SEmployees;
    }

    public void setHEmployees(List<HourlyEmployee> HEmployees) {
        this.HEmployees = HEmployees;
    }

    public void setSEmployees(List<SalariedEmployee> SEmployees) {
        this.SEmployees = SEmployees;
    }

    public void setStudents(List<Student> students) {
        Students = students;
    }

    public void setNumber_of_classes(int number_of_classes) {
        this.number_of_classes = number_of_classes;
    }

    public int getNumber_of_classes() {
        return number_of_classes;
    }


    @Override
    public void addStudent(Student std) {
        this.Students.add(std);
    }

    @Override
    public void addSalariedEmployee(SalariedEmployee emp) {
        this.SEmployees.add(emp);
    }

    @Override
    public void addHourlyEmployee(HourlyEmployee emp) {
        this.HEmployees.add(emp);
    }

    @Override
    public void removeStudent(Student std) {
        for(int i = 0 ; i < this.Students.size() ; i++){
            if(this.Students.get(i).equals(std)){
                Students.remove(i);
                break;
            }
        }
    }

    @Override
    public void removeSalariedEmployee(SalariedEmployee emp) {
        for(int i = 0 ; i < this.SEmployees.size() ; i++){
            if(this.SEmployees.get(i).equal(emp)){
                SEmployees.remove(i);
                break;
            }
        }
    }

    @Override
    public void removeHourlyEmployee(HourlyEmployee emp) {
        for(int i = 0 ; i < this.HEmployees.size() ; i++){
            if(this.HEmployees.get(i).equal(emp)){
                HEmployees.remove(i);
                break;
            }
        }
    }

    @Override
    public int getNumberOfStudents() {
        return Students.size();
    }

    @Override
    public int getNumberOfSalariedEmployees() {
        return SEmployees.size();
    }

    @Override
    public int getNumberOfHourlyEmployees() {
        return HEmployees.size();
    }

    @Override
    public int getNUmberOfEmployees() {
        return SEmployees.size() + HEmployees.size();
    }

    @Override
    public int getNUmberOfPersons() {
        return HEmployees.size() + SEmployees.size() + Students.size();
    }

    @Override
    public Student findStudentById(String ID){
        for(int i = 0 ; i < this.Students.size() ; i++){
            if(this.Students.get(i).getStudentID().equals(ID)){
                return this.Students.get(i);
            }
        }
        return new Student();
    }

    @Override
    public Employee findSalariedEmployeeById(String ID) {
        for(int i = 0 ; i < this.SEmployees.size() ; i++){
            if(Objects.equals(this.SEmployees.get(i).getEmployeeID(), ID)){
                return this.SEmployees.get(i);
            }
        }
        return new Employee();
    }

    @Override
    public Employee findHourlyEmployeeById(String ID){
        for(int i = 0 ; i < this.HEmployees.size() ; i++){
            if(Objects.equals(this.HEmployees.get(i).getEmployeeID(), ID)){
                return this.HEmployees.get(i);
            }
        }
        return new Employee();
    }

}
