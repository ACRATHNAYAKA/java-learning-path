package oop.encapsulationAndDataIntegrity.execise01;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("12345","Jack");
        System.out.println("----Money Deposit-----");
        bankAccount.deposit();
        System.out.println();
        System.out.println("----Money Withdrawal-----");
        bankAccount.withdraw();
        System.out.println();
        System.out.println("----Balance-----");
        System.out.println("Balance : "+bankAccount.getBalance());

    }
}
