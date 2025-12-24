public class Main {
    public static void main(String[] args) {
        Book myBook = new Book();

        System.out.println("-Valid Data-");
        myBook.setTitle("My Book");
        myBook.setPrice(2000);
        myBook.setPages(500);
        myBook.displayInfo();
        System.out.println();

        System.out.println("-Invalid Data-");
        myBook.setTitle("");
        myBook.setPrice(-1000);
        myBook.setPages(0);
        System.out.println();

        System.out.println("-Final Status-");
        myBook.displayInfo();
    }
}
