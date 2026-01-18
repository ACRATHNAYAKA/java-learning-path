package oop.libraryMannagementSystem;

public class EBook extends Book{
    private double fileSizeMB;
    private String downloadLink;

    public EBook(String bookID, String title, String author, double price, double fileSize, String downloadLink) {
        super(bookID, title, author, price);
        if (fileSize<=0){
            throw new IllegalArgumentException("File Size Cant be zero or Negative");
        }
        if (downloadLink == null || downloadLink.isBlank()){
            throw new IllegalArgumentException("Download Link Cant be Empty");
        }

        this.fileSizeMB =fileSize;
        this.downloadLink=downloadLink;
    }

    public double getFileSizeMB() {
        return fileSizeMB;
    }

    public String getDownloadLink() {
        return downloadLink;
    }

    @Override
    public String toString(){
        return  super.toString()+" File Size = "+ fileSizeMB +"MB"+" Download Link = "+downloadLink;
    }


}
