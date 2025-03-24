import java.util.Scanner;

public class Book {
    String title = "Atomic Habits";
    String author = "Praveen";
    int price = 5000;
}

public class program3 {
    public static void main(String[] args) {
        Book bookObj = new Book();
        System.out.println("Book Title: " + bookObj.title);
        System.out.println("Book Author: " + bookObj.author);
        System.out.println("Book Price: " + bookObj.price);
    }
}