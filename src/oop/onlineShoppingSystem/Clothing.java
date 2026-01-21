package oop.onlineShoppingSystem;

public class Clothing extends Product {
    private final String size;
    private final String material;
    private double discountPercentage;


    public Clothing(String productID, String productName, double basePrice, int stockQuantity, String category, String size, String material, double discountPercentage) {
        super(productID, productName, basePrice, stockQuantity, category);

        if (size==null || size.isBlank()){
            throw new IllegalArgumentException("Size Must Wanted");
        }

        if (material==null || material.isBlank()){
            throw new IllegalArgumentException("Material Must Wanted");
        }

        if (discountPercentage<0 || discountPercentage>50){
            throw new IllegalArgumentException("Discount Percentage Cant be Negative");
        }

        this.size = size;
        this.material = material;
        this.discountPercentage = discountPercentage;
    }

    public void setDiscountPercentage(double discountPercentage) {
        if (discountPercentage<0 || discountPercentage>50){
            throw new IllegalArgumentException("Discount Percentage Cant be Negative");
        }
        this.discountPercentage = discountPercentage;
    }

    @Override
    public double calculateSellingPrice() {
        return basePrice-(basePrice*discountPercentage/100);
    }

    @Override
    public String toString() {
        return super.toString()+" Size:"+size+" Material:"+material+" Discount Percentage:"+discountPercentage;
    }
}
