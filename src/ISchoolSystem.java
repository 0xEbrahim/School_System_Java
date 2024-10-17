public interface ISchoolSystem {
    void addStudent(Student std);
    void addSalariedEmployee(SalariedEmployee emp);
    void addHourlyEmployee(HourlyEmployee emp);
    void removeStudent(Student std);
    void removeSalariedEmployee(SalariedEmployee emp);
    void removeHourlyEmployee(HourlyEmployee emp);
    int getNumberOfStudents();
    int getNumberOfSalariedEmployees();
    int getNumberOfHourlyEmployees();
    int getNUmberOfEmployees();
    int getNUmberOfPersons();
    Student findStudentById(String ID);
    Employee findSalariedEmployeeById(String ID);
    Employee findHourlyEmployeeById(String ID);
}
