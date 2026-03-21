package oop.paymentProcessingSystem;

import java.util.Objects;

public class CreditCardPayment implements Payable,Refundable{
    private final String cardNumber;
    private String cardHolderName;
    private double balance;

    public CreditCardPayment(String cardNumber, String cardHolderName, double balance){
        if (balance<0) throw new IllegalArgumentException("Invalid Balance");

        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
        this.balance= balance;
    }
    @Override
    public boolean processPayment(double amount) {
        if (amount<=balance){
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public String getPaymentMethod() {
        return "Credit card";
    }

    @Override
    public double getTransactionFee(double amount) {
        return amount*0.03;
    }

    @Override
    public boolean processRefund(double amount) {
        balance+=amount;
        return true;
    }

    @Override
    public String getRefundPolicy() {
        return "Full refund within 30 days";
    }

    @Override
    public String toString() {
        return super.toString()+"Card Number : "+cardNumber+" Card Holder Name : "+cardHolderName+" Balance : "+balance;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        CreditCardPayment creditCardPayment = (CreditCardPayment) obj;
        return cardNumber == creditCardPayment.cardNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(cardNumber);
    }
}
