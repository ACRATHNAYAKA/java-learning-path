package oop.onlineShoppingSystem;

import java.util.Objects;

public class Customer {


    private final String customerID;



    private String customerName;
    private String email;
    private int loyalPoint;


    public Customer(String customerID, String customerName, String email, int loyalPoint){
        if (customerID == null || customerID.isBlank()){
            throw new IllegalArgumentException("Customer ID cant be Negative or Blank");
        }

        if (customerName == null || customerName.isBlank()){
            throw new IllegalArgumentException("Customer Name Must Wanted");
        }

        if (email == null || email.isBlank()){
            throw new IllegalArgumentException("E mail must Wanted");
        }

        if (loyalPoint<0){
            throw new IllegalArgumentException("Loyal Point cant be Negative");
        }

        this.customerID =customerID;
        this.customerName =customerName;
        this.email =email;
        this.loyalPoint = loyalPoint;
    }



    public void setCustomerName(String customerName) {

        if (customerName == null || customerName.isBlank()){
            throw new IllegalArgumentException("Customer Name Must Wanted");
        }

        this.customerName = customerName;
    }

    public void setEmail(String email) {
        if (email == null || email.isBlank()){
            throw new IllegalArgumentException("E mail must Wanted");
        }
        this.email = email;
    }

    public void setLoyalPoint(int loyalPoint) {
        if (loyalPoint<0){
            throw new IllegalArgumentException("Loyal Point cant be Negative");
        }
        this.loyalPoint = loyalPoint;
    }

    public void addLoyalPoint(int points){
        loyalPoint+=points;
    }

    @Override
    public String toString() {
        return "Customer ID:"+customerID+" Customer Name:"+customerName+" Email:"+email+" Loyal Points:"+loyalPoint;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }
        if (obj == null || getClass() !=obj.getClass()){
            return false;
        }
        Customer customer = (Customer) obj;
        return Objects.equals(customerID, customer.customerID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customerID);
    }

    public String getCustomerID() {
        return customerID;
    }

    public int getLoyalPoint() {
        return loyalPoint;
    }

    public String getEmail() {
        return email;
    }

    public String getCustomerName() {
        return customerName;
    }




}
