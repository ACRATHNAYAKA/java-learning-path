import java.text.NumberFormat;
import java.util.Locale;

public class Book {
    private String title;
    private double price;
    private int pages;

    public void setTitle(String title) {
        if (title != null && !title.isEmpty()){
            this.title = title;
        }
        else{
            System.out.println("Title cant be empty");
        }
    }

    public void setPrice(double price) {
        if (price<0){
            System.out.println("Price cant be Negative");
        }
        else {
            this.price = price;
        }
    }

    public void setPages(int pages) {
        if (pages<=0){
            System.out.println("Pages cant be Zero or Negative");
        }
        else{
            this.pages = pages;
        }

    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public int getPages() {
        return pages;
    }

    public void displayInfo(){
        NumberFormat currency = NumberFormat.getCurrencyInstance(new Locale("en ","lk"));
        String formatPrice = currency.format(price);
        System.out.println("Tile  : "+title);
        System.out.println("Price : "+formatPrice);
        System.out.println("Pages : "+pages);
    }


}
