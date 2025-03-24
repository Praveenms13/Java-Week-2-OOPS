import java.util.Scanner;

class CartItem {
    String itemName;
    double price;
    int quantity;

    public CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public double getTotalPrice() {
        return price * quantity;
    }
}

class ShoppingCart {
    CartItem item;

    public void addItem(String itemName, double price, int quantity) {
        item = new CartItem(itemName, price, quantity);
        System.out.println("Item added to cart: " + itemName);
    }

    public void removeItem() {
        if (item != null) {
            System.out.println("Item removed from cart: " + item.itemName);
            item = null;
        } else {
            System.out.println("No item in cart to remove.");
        }
    }

    public void displayTotalCost() {
        if (item != null) {
            System.out.println("Total Cost: $" + item.getTotalPrice());
        } else {
            System.out.println("Cart is empty.");
        }
    }
}

public class program5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ShoppingCart cart = new ShoppingCart();

        while (true) {
            System.out.println("\n1. Add Item\n2. Remove Item\n3. View Total Cost\n4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Item Name: ");
                    String itemName = scanner.nextLine();
                    System.out.print("Enter Price: ");
                    double price = scanner.nextDouble();
                    System.out.print("Enter Quantity: ");
                    int quantity = scanner.nextInt();
                    cart.addItem(itemName, price, quantity);
                    break;
                case 2:
                    cart.removeItem();
                    break;
                case 3:
                    cart.displayTotalCost();
                    break;
                case 4:
                    System.out.println("Exiting... Thank you!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
    }
}
