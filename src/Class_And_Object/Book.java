package Class_And_Object;

public class Book {
    // Static variable to keep track of the total number of books
    static int totalNoOfBooks;

    // Instance variables for each book
    String author;
    String title;
    String isbn;
    boolean isBorrowed;

    // Static block runs only once when the class is loaded
    static {
        totalNoOfBooks = 0; // Initialize total number of books
    }

    // Instance initialization block runs every time an object is created
    {
        totalNoOfBooks++; // Increment total books count for each new book
    }

    // Constructor with all fields
    Book(String isbn, String title, String author) {
        this.isbn = isbn;         // Set ISBN
        this.title = title;       // Set title
        this.author = author;     // Set author
        this.isBorrowed = false;  // Initialize isBorrowed to false
    }

    // Constructor with only ISBN
    Book(String isbn) {
        this(isbn, "Unknown", "Unknown"); // Default title and author
    }

    // Static method to return the total number of books
    static int getTotalNoOfBooks() {
        return totalNoOfBooks;
    }

    // Method to borrow a book
    void borrowedBook() {
        if (isBorrowed) {
            System.out.println("The book \"" + title + "\" is already borrowed.");
        } else {
            this.isBorrowed = true;
            System.out.println("Enjoy reading \"" + title + "\" by " + author + "!");
        }
    }

    // Method to return a book
    void returnBook() {
        if (isBorrowed) {
            this.isBorrowed = false;
            System.out.println("Hope you enjoyed \"" + title + "\". Please leave a review!");
        } else {
            System.out.println("The book \"" + title + "\" is already in the library.");
        }
    }

    // Main method to test the class
    public static void main(String[] args) {
        Book designOfThings = new Book("1", "Design", "Author"); // Create book with full info
        Book myBook = new Book("2"); // Create book with default title and author

        System.out.println("Total books: " + Book.getTotalNoOfBooks()); // Display total books

        myBook.borrowedBook();       // Try to borrow myBook
        designOfThings.borrowedBook(); // Try to borrow designOfThings

        designOfThings.returnBook();   // Return designOfThings
        designOfThings.returnBook();   // Try to return it again
    }
}
