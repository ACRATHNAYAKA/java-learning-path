package oop.employeePayrollSystem;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Objects;

public class Employee {

    private final String name;
    private final String empID;
    protected double basicSalary;
    String department;

    public Employee(String empID, String name, double basicSalary, String department){
        if (empID==null ||empID.isBlank()){
            throw new IllegalArgumentException("Employee ID cant be Null");
        }

        if (name==null || name.isBlank()){
            throw new IllegalArgumentException("Employee Name Cant be Null");
        }

        if (basicSalary<=0){
            throw new IllegalArgumentException("Base Salary Cant be Zero or Negative");
        }

        if (department==null || department.isBlank()){
            throw new IllegalArgumentException("Department must need");
        }

        this.empID = empID;
        this.name = name;
        this.basicSalary = basicSalary;
        this.department = department;
    }

    public String calculateSalary(){
        NumberFormat currency = NumberFormat.getCurrencyInstance(new Locale("Eng","SL"));

        return currency.format(basicSalary);
    }

    public void displayDetails(){
        System.out.println("----------------Employee Details---------------");
        System.out.println("Employee ID    : "+empID);
        System.out.println("Employee Name  : "+name);
        System.out.println("Base Salary    : "+basicSalary);
        System.out.println("Department     : "+department);
    }
    @Override
    public String toString(){
        return "Employee ID:"+empID+" Employee Name:"+name+" Base Salary:"+basicSalary+" Department:"+department;
    }
    @Override
    public boolean equals(Object obj){
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Employee employee = (Employee) obj;
        return empID == employee.empID;
    }
    @Override
    public int hashCode(){
        return Objects.hash(empID);
    }

    public String getName() {
        return name;
    }

    public String getEmpID() {
        return empID;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public String getDepartment() {
        return department;
    }

}
