package oop.libraryMannagementSystem;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("B001","Jeewithaya Yali Ladimi","Leokadia Schmidt",900.00);
        System.out.println("-----------------------Book------------------------");
        System.out.println(book.toString());

        EBook eBook = new EBook("B001","Jeewithaya Yali Ladimi","Leokadia Schmidt",900.00,200.00,"www.ebook.com");
        System.out.println(eBook.toString());
    }
}