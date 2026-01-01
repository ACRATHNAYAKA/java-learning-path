package oop.encapsulationAndDataIntegrity.execise01;

import java.util.Scanner;

public class BankAccount {
    private final String accountNumber;
    private final String owerName;
    private  double balance;

    private final Scanner scanner = new Scanner(System.in);

    public double getBalance() {
        return balance;
    }

    public BankAccount(String accountNumber, String owerName){
        this.accountNumber=accountNumber;
        this.owerName =owerName;
    }

    public void deposit(){
        System.out.print("Enter Deposit Amount - ");
        double amount = Double.parseDouble(scanner.nextLine());
        while (amount <= 0 ) {
            System.out.println("Invalid input");
            System.out.print("Enter Deposit Amount - ");
            amount = Double.parseDouble(scanner.nextLine());
        }
        balance+= amount;
        System.out.println("Deposit Successful "+"Money Deposit to "+accountNumber+" Owner Name "+ owerName);
    }

    public void withdraw(){
        if (balance==0){
            System.out.println("Your Balance is "+balance);
        }
        else {
            System.out.print("Enter Withdraw Amount - ");
            double amount = Double.parseDouble(scanner.nextLine());
            while (amount <= 0 || amount > balance) {
                if (amount <= 0) {
                    System.out.println("Invalid input");
                } else {
                    System.out.println("Cant withdraw");
                }
                System.out.print("Enter Withdraw Amount - ");
                amount = Double.parseDouble(scanner.nextLine());
            }
            balance-=amount;
            System.out.println("Withdraw Successful");
        }
    }


}
