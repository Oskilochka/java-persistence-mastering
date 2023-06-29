package mastering.business;

import java.time.Year;
import java.util.Objects;

public record Book(String isbn, String title, int edition, Year releaseDate) {
    public Book {
        Objects.requireNonNull(isbn, "Isbn is required");
        Objects.requireNonNull(title, "Title is required");
        Objects.requireNonNull(releaseDate, "ReleaseDate is required");

        if (edition < 1) {
            throw new IllegalArgumentException("The edition should not be null");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(isbn, book.isbn);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(isbn);
    }
}
