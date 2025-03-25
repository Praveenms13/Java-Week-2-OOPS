class Book {
    static String title;
    private String author;
    private int price;
    Book () {
        this.title = "Atomic Habits";
        this.author = "Author - 1";
        this.price = 1000;
    }
    Book (String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
    public String[] getBookDetails() {
        return new String[] {this.title, this.author, String.valueOf(this.price)};
    }
}

public class BookData {
    public static void main (String args[]){
        Book bookObj = new Book();
        System.out.println("Default Constructor ...");
        System.out.println(bookObj.getBookDetails()[0]);
        System.out.println(bookObj.getBookDetails()[1]);
        System.out.println(bookObj.getBookDetails()[2]);

        Book bookObje = new Book("Happy Life", "Praveen", 300);
        System.out.println();
        System.out.println("Parameterized Constructor ...");
        System.out.println(bookObje.getBookDetails()[0]);
        System.out.println(bookObje.getBookDetails()[1]);
        System.out.println(bookObje.getBookDetails()[2]);
    } 
}