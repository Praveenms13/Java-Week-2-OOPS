import java.util.Scanner;

class Product {
    private String productName;
    private int productPrice;
    private static int totalProducts = 0;

    Product(String name, int price) {
        this.productName = name;
        this.productPrice = price;
        totalProducts++;
    }

    public void displayProductDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Product Price: " + productPrice);
    }

    public static void displayTotalProducts() {
        System.out.println("Total Products: " + totalProducts);
    }
}

public class main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many products do you want to enter? ");
        int count = scanner.nextInt();
        scanner.nextLine(); 

        Product[] products = new Product[count];

        for (int i = 0; i < count; i++) {
            System.out.println("\nEnter details for product " + (i + 1));
            System.out.print("Product Name: ");
            String name = scanner.nextLine();
            System.out.print("Product Price: ");
            int price = scanner.nextInt();
            scanner.nextLine(); 
            products[i] = new Product(name, price);
        }

        System.out.println("\n--- Product Details ---");
        for (Product p : products) {
            p.displayProductDetails();
        }

        System.out.println("\n--- Total Products ---");
        Product.displayTotalProducts();

        scanner.close();
    }
}
