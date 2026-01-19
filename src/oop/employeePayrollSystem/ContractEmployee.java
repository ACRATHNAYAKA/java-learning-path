package oop.employeePayrollSystem;

public class ContractEmployee extends Employee {
    private final int hoursWorked;
    private final double hourlyRate;


    public ContractEmployee(String empID, String name, String department, int hoursWorked, double hourlyRate) {
        super(empID, name, 0, department);

        if (hoursWorked<0){
            throw new IllegalArgumentException("hoursWorked cant be Negative");
        }

        if (hourlyRate<=0){
            throw new IllegalArgumentException("HourlyRate cant be Negative or zero");
        }

        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary(){
        return hoursWorked*hourlyRate;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Hours Worked   : "+hoursWorked);
        System.out.println("Hourly Rate    : "+hourlyRate);
    }

    @Override
    public String toString() {
        return super.toString()+" Hours Worked:"+hoursWorked+" Hourly:"+hourlyRate;
    }
}
