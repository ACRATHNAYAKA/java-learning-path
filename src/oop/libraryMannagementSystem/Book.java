package oop.libraryMannagementSystem;

public class Book {

    private final String bookID;
    private final String title;
    private final String author;
    private  double price;

    public Book(String bookID, String title, String author, double price){
        if (bookID==null || bookID.isBlank()){
            throw new IllegalArgumentException("Book ID Cant be Null");
        }
        if (title==null || title.isBlank()){
            throw new IllegalArgumentException("Title Cant be Null");
        }
        if (author==null || author.isBlank()){
            throw new IllegalArgumentException("Author cant be Null");
        }
        this.bookID = bookID;
        this.title = title;
        this.author = author;
        setPrice(price);
    }
    @Override
    public String toString(){
        return "BookID = "+bookID+", Title = "+title+", Author = "+author+", Price "+price;
    }


    public String getBookID() {
        return bookID;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price<=0){
            throw new IllegalArgumentException("Price Cant be zero or negative");
        }
        this.price = price;
    }


}
