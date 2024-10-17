public class SalariedEmployee extends  Employee{
    private float bonus;
    private float deduction;
    SalariedEmployee(){
        super();
    }
    SalariedEmployee(String name, String address, String nationality, int age, float salary, String rank, String job, String empId, float bonus, float deduction){
        super(name, address, nationality, age, salary, rank,job, empId);
        this.bonus = bonus;
        this.deduction = deduction;
    }

    public float getDeduction() {
        return deduction;
    }

    public void setDeduction(float deduction) {
        this.deduction = deduction;
    }

    public float getBonus() {
        return bonus;
    }

    public void setBonus(float bonus) {
        this.bonus = bonus;
    }

}
