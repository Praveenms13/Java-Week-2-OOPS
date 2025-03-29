import java.util.ArrayList;
import java.util.List;

interface Reservable {
    void reserveItem(String borrower);

    boolean checkAvailability();
}

abstract class LibraryItem {
    private String itemId;
    private String title;
    private String author;
    private boolean isReserved = false;
    private String borrower;

    public LibraryItem(String itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    public abstract int getLoanDuration();

    public void getItemDetails() {
        System.out.println("Item ID: " + itemId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }

    protected void setBorrower(String borrower) {
        this.borrower = borrower;
    }

    protected void setReserved(boolean reserved) {
        this.isReserved = reserved;
    }

    public boolean isReserved() {
        return isReserved;
    }
}

class Book extends LibraryItem implements Reservable {
    public Book(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 14;
    }

    @Override
    public void reserveItem(String borrower) {
        if (!isReserved()) {
            setBorrower(borrower);
            setReserved(true);
        }
    }

    @Override
    public boolean checkAvailability() {
        return !isReserved();
    }
}

class Magazine extends LibraryItem implements Reservable {
    public Magazine(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 7;
    }

    @Override
    public void reserveItem(String borrower) {
        if (!isReserved()) {
            setBorrower(borrower);
            setReserved(true);
        }
    }

    @Override
    public boolean checkAvailability() {
        return !isReserved();
    }
}

class DVD extends LibraryItem implements Reservable {
    public DVD(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 3;
    }

    @Override
    public void reserveItem(String borrower) {
        if (!isReserved()) {
            setBorrower(borrower);
            setReserved(true);
        }
    }

    @Override
    public boolean checkAvailability() {
        return !isReserved();
    }
}

public class LibrarySystem {
    public static void main(String[] args) {
        List<LibraryItem> items = new ArrayList<>();
        items.add(new Book("B001", "Java Fundamentals", "Smith"));
        items.add(new Magazine("M001", "Tech Weekly", "Editor A"));
        items.add(new DVD("D001", "OOP Explained", "Director Z"));

        for (LibraryItem item : items) {
            item.getItemDetails();
            System.out.println("Loan Duration: " + item.getLoanDuration() + " days");

            if (item instanceof Reservable) {
                Reservable reservable = (Reservable) item;
                System.out.println("Available: " + reservable.checkAvailability());
                reservable.reserveItem("John Doe");
                System.out.println("Reserved Now: " + reservable.checkAvailability());
            }

            System.out.println("------------------------");
        }
    }
}
