package oop.onlineShoppingSystem;

import java.util.Objects;

public class Product {


    private final String productID;
    private final String productName;
    protected double basePrice;
    protected int stockQuantity;
    String category;

    public Product(String productID, String productName, double basePrice, int stockQuantity, String category){
        if (productID == null || productID.isBlank()){
            throw new IllegalArgumentException("ProductID cant be Null");
        }

        if (productName == null || productName.isEmpty()){
            throw new IllegalArgumentException("Product Name Cant be Empty");
        }

        if (basePrice<=0){
            throw new IllegalArgumentException("Base Price Cant be Zero or Negative");
        }

        if (stockQuantity<0){
            throw new IllegalArgumentException("Stock Quantity Cant be Negative");
        }

        if (category == null || category.isBlank()){
            throw new IndexOutOfBoundsException("Category Cant be Null or Empty");
        }

        this.productID = productID;
        this.productName = productName;
        this.basePrice = basePrice;
        this.stockQuantity = stockQuantity;
        this.category = category;
    }


    public void setStockQuantity(int stockQuantity) {
        if (stockQuantity<0){
            throw new IllegalArgumentException("Stock Quantity Cant be Negative");
        }
        this.stockQuantity = stockQuantity;
    }

    public double calculateSellingPrice(){
        return basePrice;
    }

    public boolean isInStock(){
        return stockQuantity >0;
    }

    public boolean reduceStock( int qty){
        return qty<=stockQuantity;
    }

    @Override
    public String toString(){
        return "Product ID:"+productID+" Product Name:"+productName+" Base Price:"+basePrice+" Stock Quantity:"+stockQuantity+"Category:"+category;
    }

    @Override
    public boolean equals(Object obj){
        if (this == obj){
            return true;
        }
        if (obj == null || getClass() != obj.getClass()){
            return false;
        }
        Product product = (Product) obj;
        return Objects.equals(productID,product.productID);
    }

    @Override
    public int hashCode(){
        return Objects.hashCode(productID);
    }


    public String getProductID() {
        return productID;
    }

    public String getProductName() {
        return productName;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    public String getCategory() {
        return category;
    }
}
