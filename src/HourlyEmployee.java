public class HourlyEmployee extends Employee{
    private int workingHours;
    private float hour_rate;
    HourlyEmployee(String name, String address, String nationality, int age, float salary, String rank, String job,String empID, int workingHours, float hour_rate){
        super(name, address, nationality, age, salary, rank,job, empID);
        this.workingHours = workingHours;
        this.hour_rate = hour_rate;
    }

    public int getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(int workingHours) {
        this.workingHours = workingHours;
    }

    public float getHour_rate() {
        return hour_rate;
    }

    public void setHour_rate(float hour_rate) {
        this.hour_rate = hour_rate;
    }
}
