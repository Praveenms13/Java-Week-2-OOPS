class Product {
    private static double discount = 10.0;
    private final int productID;
    private String productName;
    private double price;
    private int quantity;

    public Product(int productID, String productName, double price, int quantity) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    public static void updateDiscount(double newDiscount) {
        discount = newDiscount;
    }

    public void displayDetails() {
        if (this instanceof Product) {
            System.out.println("Product ID: " + productID);
            System.out.println("Product Name: " + productName);
            System.out.println("Price: $" + price);
            System.out.println("Quantity: " + quantity);
            System.out.println("Discount: " + discount + "%");
        }
    }
}

class Electronics extends Product {
    public Electronics(int productID, String productName, double price, int quantity) {
        super(productID, productName, price, quantity);
    }
}

public class ShoppingCart {
    public static void main(String[] args) {
        Product p1 = new Product(1, "Laptop", 1200.0, 1);
        Electronics p2 = new Electronics(2, "Smartphone", 800.0, 2);

        p1.displayDetails();
        p2.displayDetails();

        Product.updateDiscount(15.0);

        System.out.println("\nAfter updating discount:\n");
        p1.displayDetails();
        p2.displayDetails();

        System.out.println("p1 is instance of Product: " + (p1 instanceof Product));
        System.out.println("p2 is instance of Electronics: " + (p2 instanceof Electronics));
    }
}
