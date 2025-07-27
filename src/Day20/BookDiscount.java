package Day20;


public class Book {
    private String title;
    private String author;
    private double price;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }
}

public class BOOKAuthor {
}


public class BookFormatter {
    public String formatTitle(Book book) {
        return "Title: " + book.getTitle().toUpperCase();
    }
}
public class DiscountCalculator {
    public double calculateDiscountedPrice(Book book, double discountPercentage) {
        return book.getPrice() * (1 - discountPercentage);
    }
}
