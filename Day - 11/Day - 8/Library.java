class Book {
    private static String libraryName = "City Library";
    private final String isbn;
    private String title;
    private String author;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }

    public void displayDetails() {
        if (this instanceof Book) {
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("ISBN: " + isbn);
        }
    }
}

class SpecialBook extends Book {
    public SpecialBook(String title, String author, String isbn) {
        super(title, author, isbn);
    }
}

public class Library {
    public static void main(String[] args) {
        Book b1 = new Book("The Alchemist", "Paulo Coelho", "978-0061122415");
        SpecialBook b2 = new SpecialBook("1984", "George Orwell", "978-0451524935");

        Book.displayLibraryName();

        b1.displayDetails();
        b2.displayDetails();

        System.out.println("b1 is instance of Book: " + (b1 instanceof Book));
        System.out.println("b2 is instance of SpecialBook: " + (b2 instanceof SpecialBook));
    }
}
