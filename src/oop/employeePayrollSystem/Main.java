package oop.employeePayrollSystem;

public class Main {
    public static void main(String[] args) {
        PermanentEmployee permanentEmployee01 = new PermanentEmployee("PEMP01","Chamara",1000000.00,"A",20,100000.00);
        PermanentEmployee permanentEmployee02 = new PermanentEmployee("PEMP02","Kamal",100000.00, "A",10,2000.00);

        ContractEmployee contractEmployee01 = new ContractEmployee("CEMP01","Janith","B",6,100);

        System.out.println("----------------Permanent Employee 01--------------");
        System.out.println("Salary        : LKR "+permanentEmployee01.calculateSalary());
        permanentEmployee01.displayDetails();
        System.out.println();

        System.out.println("----------------Permanent Employee 02--------------");
        System.out.println("Salary         : LKR "+permanentEmployee02.calculateSalary());
        permanentEmployee02.displayDetails();
        System.out.println();

        System.out.println("---------------Contract Employee 01----------------");
        System.out.println("Salary         : LKR "+contractEmployee01.calculateSalary());
        contractEmployee01.displayDetails();
        System.out.println();

        System.out.println("---------------Object Compere----------------------");
        System.out.println(permanentEmployee01.equals(permanentEmployee01));
        System.out.println();
        System.out.println("---------------Get Hash Code-----------------------");
        System.out.println(permanentEmployee01.hashCode());


    }

}
