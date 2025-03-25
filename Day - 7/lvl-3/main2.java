class Book {
    public String ISBN = "12345678997";
    private String title = "Atomic Habits";
    protected String author = "Praveen";
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getAuthor() {
        return author;
    }
    public String getTitle() {
        return title;
    }
}
class Ebook extends Book {
    public void getDatas() {
        System.out.println("I am from Ebook SubClass ...");
        System.out.println("ISBN Num: " + ISBN);
        System.out.println("Title: " + getTitle());
    }
}
public class main2 {
    public static void main(String[] args) {
        Book bookObj = new Book();
        System.out.println("This is from actual Book class");
        System.out.println("Author: " + bookObj.getAuthor());
        System.out.println("After Setting Author");
        bookObj.setAuthor("Prakash");
        System.out.println("Author: " + bookObj.getAuthor());
        Ebook ebookObj = new Ebook();
        ebookObj.getDatas();
    }
}
