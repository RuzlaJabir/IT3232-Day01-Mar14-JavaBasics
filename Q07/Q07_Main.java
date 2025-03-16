public class Q07_Main {
    public static void main(String[] args) {
        Library library = new Library();

        // Creating different book objects
        PrintedBook printedBook = new PrintedBook("The Great Gatsby", "F. Scott Fitzgerald", 1925, 218);
        AudioBook audioBook = new AudioBook("Atomic Habits", "James Clear", 2018, 5.5, "James Clear");
        EBook eBook = new EBook("Clean Code", "Robert C. Martin", 2008, 1.2, "PDF");

        // Adding books to the library
        library.addBook(printedBook);
        library.addBook(audioBook);
        library.addBook(eBook);

        // Display all books
        System.out.println("Library Books:");
        library.displayAllBooks();

        // Remove a book
        System.out.println("\nRemoving 'Atomic Habits'...");
        library.removeBook("Atomic Habits");

        // Display books after removal
        System.out.println("\nUpdated Library:");
        library.displayAllBooks();
    }
}
