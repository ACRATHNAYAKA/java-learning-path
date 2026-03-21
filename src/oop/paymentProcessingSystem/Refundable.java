package oop.paymentProcessingSystem;

public interface Refundable {
    boolean processRefund(double amount);
    String getRefundPolicy();
}
