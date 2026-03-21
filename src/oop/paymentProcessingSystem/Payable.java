package oop.paymentProcessingSystem;

public interface Payable {
    boolean processPayment(double amount);
    String getPaymentMethod();
    double getTransactionFee(double amount);

}
