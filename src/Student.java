import java.util.Objects;

public class Student extends Person{
    private int study_level;
    private double GPA;
    private String specialization;
    private String studentID;
    public Student(){
        super();
    }
    Student(String name, String address, String nationality, int age, int study_level, double GPA, String specialization, String studentID){
        super(name, address, nationality, age);
        this.specialization = specialization;
        this.study_level = study_level;
        this.GPA = GPA;
        this.studentID = studentID;
    }

    public double getGPA() {
        return GPA;
    }

    public void setStudy_level(int study_level) {
        this.study_level = study_level;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public int getStudy_level() {
        return study_level;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public boolean equals(Student obj) {
       return Objects.equals(this.studentID, obj.studentID);
    }
}
