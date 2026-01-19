package oop.employeePayrollSystem;

public class PermanentEmployee extends Employee {
    private final double epfPercentage;
    private final double bonus;

    public PermanentEmployee(String empID, String name, double basicSalary, String department,double epfPercentage, double bonus){
        super(empID, name, basicSalary, department);
        if (epfPercentage<=0 ||epfPercentage>100 ){
            throw new IllegalArgumentException("EPF Percentage between 1 - 100");
        }
        if (bonus<0){
            throw new IllegalArgumentException("Bonus Cant be Negative");
        }

        this.epfPercentage = epfPercentage;
        this.bonus = bonus;
    }
    @Override
    public double calculateSalary(){
        return basicSalary+bonus-(basicSalary*epfPercentage/100);
    }

    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println("EPF Percentage : "+epfPercentage);
        System.out.println("Bonus          : LKR "+bonus);

    }

    @Override
    public String toString(){
       return super.toString()+" EPF Percentage:"+epfPercentage+" Bonus:"+bonus;
    }



}
