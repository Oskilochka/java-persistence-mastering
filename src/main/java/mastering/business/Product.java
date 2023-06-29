package mastering.business;

public class Product {
    private final Book book;
    private Money price;

    Product(Book book, Money price) {
        this.book = book;
        this.price = price;
    }

    public static Product of(Book book, Money price) {
        // some logic
        return new Product(book, price);
    }
}

