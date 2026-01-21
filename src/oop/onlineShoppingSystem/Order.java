package oop.onlineShoppingSystem;

import java.time.LocalDate;
import java.util.Objects;

public class Order {
    private final String orderID;
    private final Customer customer;
    private final Product orderedProduct;
    private int quantity;
    private final LocalDate orderDate;
    private boolean isDelivered;

    LocalDate date = LocalDate.now();

    public Order(String orderID, Customer customer, Electronics product, int quantity){
        if (orderID == null || orderID.isBlank()){
            throw new IllegalArgumentException("Order ID cant be Null or Blank");
        }

        if (customer == null){
            throw new IllegalArgumentException("Customer object cant be Null");
        }

        if (product == null){
            throw new IllegalArgumentException("Product object cant be Null");
        }

        if (quantity<=0){
            throw new IllegalArgumentException("Quantity Cant be Zero or Negative");
        }

        this.orderID = orderID;
        this.customer = customer;
        this.orderedProduct = product;
        this.quantity = quantity;
        this.orderDate = date;
    }

    public Order(String orderID, Customer customer, Clothing product, int quantity){
        if (orderID == null || orderID.isBlank()){
            throw new IllegalArgumentException("Order ID cant be Null or Blank");
        }

        if (customer == null){
            throw new IllegalArgumentException("Customer object cant be Null");
        }

        if (product == null){
            throw new IllegalArgumentException("Product object cant be Null");
        }

        if (quantity<=0){
            throw new IllegalArgumentException("Quantity Cant be Zero or Negative");
        }

        this.orderID = orderID;
        this.customer = customer;
        this.orderedProduct = product;
        this.quantity = quantity;
        this.orderDate = date;
    }

    public double calculateTotal(){
        return orderedProduct.calculateSellingPrice()*quantity;
    }

    public String processOrder(){
       if (orderedProduct.isInStock() && orderedProduct.reduceStock(quantity)){
           customer.addLoyalPoint((int) calculateTotal() /100);
           return "Order Processed";
       }
       else {
           return "Stock out";
       }
    }

    public void markAsDelivered(){
        this.isDelivered = true;
    }

    @Override
    public String toString() {
        return "Order ID:"+orderID+customer.toString()+" "+orderedProduct.toString()+" Quantity:"+quantity+" Order Date:"+date+" is Delivered"+isDelivered;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj ){
            return true;
        }

        if (obj == null || getClass() != obj.getClass()){
            return false;
        }

        Order order = (Order) obj;
        return Objects.equals(orderID,order.orderID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderID);
    }

    public String getOrderID() {
        return orderID;
    }
}
