import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Person Ahmed = new Person("Ahmed", "Cairo", "Egyptian", 43);
        SchoolSystem Hana = new SchoolSystem("Hana", "Egypt",7,Ahmed , 17);
        System.out.println("---------------------- Welcome to our School System ------------------------");
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        while(true){
            while (true) {
                System.out.println("For information press 1");
                System.out.println("For data Update press 2");
                choice = sc.nextInt();
                if (choice != 1 && choice != 2 && choice != 15) {
                    System.out.println("Please enter a valid choice, you should choose between 1 and 2");
                } else {
                    break;
                }
            }
            if(choice == 15)break;
            if (choice == 1) {
                System.out.println("---------------------- Welcome again. here are some options: ---------------------------");

                choice = 0;
                while (true) {
                    System.out.println("Press 1 to know how many students study at our school");
                    System.out.println("Press 2 to know how many employees working at our school");
                    System.out.println("Press 3 to know how many salaried employees at our school");
                    System.out.println("Press 4 to know how many people at our school");
                    choice = sc.nextInt();
                    if (choice != 1 && choice != 2 && choice != 3 && choice != 4) {
                        System.out.println("Please enter a valid choice, you should choose between 1, 2, 3 and 4");
                    } else {
                        break;
                    }
                }
                if (choice == 1) {
                    System.out.println("Students: " + Hana.getNumberOfStudents());
                } else if (choice == 2) {
                    System.out.println("Employees: " + Hana.getNUmberOfEmployees());
                } else if (choice == 3) {
                    System.out.println("Salaried Employees: " + Hana.getNumberOfSalariedEmployees());
                } else {
                    System.out.println("All: " + Hana.getNUmberOfPersons());
                }
            } else {
                System.out.println("---------------------- Welcome to our data update system ------------------------");
                System.out.println("Here is some options: ");
                choice = 0;
                while (true) {
                    System.out.println("Press 1 for data insertion");
                    System.out.println("Press 2 for data deletion");
                    choice = sc.nextInt();
                    if (choice != 1 && choice != 2) {
                        System.out.println("Please enter a valid choice, you should choose between 1 and 2");
                    } else {
                        break;
                    }
                }
                int choice2 = 0;
                System.out.println("Please specify what you are: ");
                while (true) {
                    System.out.println("Press 1 if you are a student ");
                    System.out.println("Press 2 if you are an employee ");
                    choice2 = sc.nextInt();
                    if (choice2 != 1 && choice2 != 2) {
                        System.out.println("Please enter a valid choice, you should choose between 1 and 2");
                    } else {
                        break;
                    }
                }
                if (choice2 == 1) {
                    if (choice == 1) {
                        System.out.println(" --------------------------------- Welcome, Student ------------------------------");
                        System.out.println("please fill the required data");
                        System.out.println("Your name: ");
                        String name;
                        name = sc.next();
                        System.out.println("\n");
                        System.out.print("Your address: ");
                        String address;
                        address = sc.next();
                        System.out.println("\n");
                        System.out.print("Your nationality: ");
                        String nationality;
                        nationality = sc.next();
                        System.out.println("\n");
                        System.out.print("Your age: ");
                        int age;
                        age = sc.nextInt();
                        System.out.println("\n");
                        System.out.print("Your study level: ");
                        int study_level;
                        study_level = sc.nextInt();
                        System.out.println("\n");
                        System.out.print("Your GPA: ");
                        double GPA;
                        GPA = sc.nextDouble();
                        System.out.println("\n");
                        System.out.print("Your specialization: ");
                        String spec;
                        spec = sc.next();
                        System.out.println("\n");
                        System.out.print("Your student ID: ");
                        String studentID;
                        studentID = sc.next();
                        Student newSTD = new Student(name, address, nationality, age, study_level, GPA, spec, studentID);
                        Hana.addStudent(newSTD);
                    } else {
                        String studentID;
                        System.out.print("Your student ID: ");
                        studentID = sc.next();
                        System.out.println("\n");
                        Student newSTD = Hana.findStudentById(studentID);
                        Hana.removeStudent(newSTD);
                    }
                } else {
                    int choice3 = 0;
                    System.out.println("------------------------------ Hello to employee's system -----------------------------------");
                    System.out.println("Please specify yourself: ");
                    while (true) {
                        System.out.println("Press 1 for Salaried employee");
                        System.out.println("Press 2 for Hourly employee");
                        choice3 = sc.nextInt();
                        if (choice3 != 1 && choice3 != 2) {
                            System.out.println("Please enter a valid choice, you should choose between 1 and 2");
                        } else {
                            break;
                        }
                    }
                    if (choice == 1) {
                        System.out.println("please fill the required data");
                        System.out.print("Your name: ");
                        String name;
                        name = sc.next();
                        System.out.println("\n");
                        System.out.print("Your address: ");
                        String address;
                        address = sc.next();
                        System.out.println("\n");
                        System.out.print("Your nationality: ");
                        String nationality;
                        nationality = sc.next();
                        System.out.println("\n");
                        System.out.print("Your age: ");
                        int age;
                        age = sc.nextInt();
                        System.out.println("\n");
                        System.out.print("Your emp ID: ");
                        String empID;
                        empID = sc.next();
                        float salary;
                        System.out.println("Please enter your salary: ");
                        salary = sc.nextFloat();
                        String rank, job;
                        System.out.println("Please enter your rank");
                        rank = sc.next();
                        System.out.println("Please enter your job");
                        job = sc.next();
                        if (choice3 == 1) {
                            float bonus, deduction;
                            System.out.println("Please enter the bonus");
                            bonus = sc.nextFloat();
                            System.out.println("Please enter the deduction");
                            deduction = sc.nextFloat();
                            SalariedEmployee SE = new SalariedEmployee(name, address, nationality, age, salary, rank, job, empID, bonus, deduction);
                            Hana.addSalariedEmployee(SE);
                        } else {
                            int workingHours;
                            float HoursRate;
                            System.out.println("Please Enter working hours");
                            workingHours = sc.nextInt();
                            System.out.println("What is hours rate");
                            HoursRate = sc.nextFloat();
                            HourlyEmployee HE = new HourlyEmployee(name, address, nationality, age, salary, rank, job, empID, workingHours, HoursRate);
                            Hana.addHourlyEmployee(HE);
                        }
                    } else {
                        System.out.print("Your emp ID: ");
                        String empID;
                        empID = sc.next();
                        if (choice3 == 1) {
                            SalariedEmployee SE = (SalariedEmployee) Hana.findSalariedEmployeeById(empID);
                            Hana.removeSalariedEmployee(SE);
                        } else {
                            HourlyEmployee HE = (HourlyEmployee) Hana.findHourlyEmployeeById(empID);
                            Hana.removeHourlyEmployee(HE);
                        }
                    }
                }
            }
        }
    }
}