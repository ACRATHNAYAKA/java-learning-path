package oop.onlineShoppingSystem;

public class Main {
    public static void main(String[] args) {


        Electronics electronicsProduct01 = new Electronics("E001", "Electric Cooker", 10000, 10, "Home item", "ABC", 24);
        Electronics electronicsProduct02 = new Electronics("E002", "TV", 100000, 20, "Home item", "ABC");

        Clothing clothingProduct01 = new Clothing("C001", "Jacket", 5000, 5, "Mens", "M", "Soft", 20);

        Customer customer01 = new Customer("CU001", "Kasun", "example@email.com");

        Order order01 = new Order("OR001", customer01, electronicsProduct01, 2);
        Order order02 = new Order("OR002", customer01, clothingProduct01, 3);

        System.out.println("--------Processed Order--------");
        String message01 = order01.processOrder();
        System.out.println("Order "+order01.getOrderID()+" : "+message01);
        System.out.println("Total Bill : "+order01.calculateTotal());
        String message02 = order02.processOrder();
        System.out.println();
        System.out.println("Order "+order02.getOrderID()+" : "+message02);
        System.out.println("Total Bill : "+order02.calculateTotal());
        System.out.println();

        System.out.println("---------Check Stock----------");
        System.out.println(electronicsProduct01.getProductName()+" : "+electronicsProduct01.getStockQuantity());
        System.out.println(clothingProduct01.getProductName()+" : "+clothingProduct01.getStockQuantity());
        System.out.println();

        Electronics electronicsProduct03 = new Electronics("E003", "Radio", 10000, 10, "Home item", "ABC", 24);
        Electronics electronicsProduct04 = new Electronics("E003", "Radio", 10000, 10, "Home item", "ABC", 24);

        System.out.println("Check Product equals() : "+electronicsProduct03.equals(electronicsProduct04));

        Order order03 = new Order("OR003", customer01, electronicsProduct01, 2);
        Order order04 = new Order("OR003", customer01, electronicsProduct01, 2);

        System.out.println("Check Order equals() : "+order03.equals(order04));
        System.out.println();

        System.out.println("-------Hash Code Value Comper------------");
        System.out.println("Hash Code Value Order 03 : "+order03.hashCode());
        System.out.println("Hash Code Value Order 04 : "+order04.hashCode());

    }
}
