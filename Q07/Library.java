import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books; // Store all types of books

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(String title) {
        books.removeIf(book -> book.getTitle().equalsIgnoreCase(title));
    }

    public void displayAllBooks() {
        for (Book book : books) {
            book.displayDetails(); // Polymorphism 
        }
    }
}
