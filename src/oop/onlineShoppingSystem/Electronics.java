package oop.onlineShoppingSystem;

public class Electronics extends Product {
    private final String brand;
    private int warrantyMonths;


    public Electronics(String productID, String productName, double basePrice, int stockQuantity, String category, String brand, int warranty) {
        super(productID, productName, basePrice, stockQuantity, category);

        if (brand == null || brand.isBlank()){
            throw new IllegalArgumentException("Brand cant be Null");
        }

        if (warranty<0){
            throw  new IllegalArgumentException("Warranty Cant be negative");
        }

        this.brand = brand;
        this.warrantyMonths = warranty;
    }

    public Electronics(String productID, String productName, double basePrice, int stockQuantity, String category, String brand) {
        super(productID, productName, basePrice, stockQuantity, category);

        if (brand == null || brand.isBlank()){
            throw new IllegalArgumentException("Brand cant be Null");
        }

        if (warrantyMonths <0){
            throw  new IllegalArgumentException("Warranty Cant be negative");
        }

        this.brand = brand;
        this.warrantyMonths = 12;
    }

    @Override
    public double calculateSellingPrice() {
        return basePrice+(warrantyMonths *100);
    }

    public void extendWarranty(int additionalMonths){
        warrantyMonths = warrantyMonths+additionalMonths;
    }

    @Override
    public String toString() {
        return super.toString()+" Warranty:"+warrantyMonths+" Brand:"+brand;
    }
}
