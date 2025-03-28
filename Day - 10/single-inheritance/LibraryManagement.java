class Book {
    protected String title;
    protected int year;

    public Book(String title, int year) {
        this.title = title;
        this.year = year;
    }
}

class Author extends Book {
    private String name;
    private String bio;

    public Author(String title, int year, String name, String bio) {
        super(title, year); 
        this.name = name;
        this.bio = bio;
    }

    public void displayInfo() {
        System.out.println("----- Displaying Book Info -----");
        System.out.println("Book Title: " + title);
        System.out.println("Book Released Year: " + year);
        System.out.println("Author Name: " + name);
        System.out.println("Author Bio: " + bio);
        System.out.println("----- Ends -----");
    }
}

public class LibraryManagement {
    public static void main(String[] args) {
        Author author = new Author("The Java Handbook", 2023, "John Doe", "Java developer and educator with 10 years of experience.");
        author.displayInfo();
    }
}
