import java.util.Scanner;

public class Item {
    String itemCode = "wb001";
    String itemName = "water bottle";
    int price = 100;
    int quantity;
    public Item(int quantity) {
        this.quantity = quantity;
    }
    public int calculatePriceForQuantity() {
        return quantity * price;
    }
    public void displayItemdetails() {
        System.out.println("Item Name: " + itemName);
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Price: " + price);
        System.out.println("Total Price for Quantity " + quantity + ": " + calculatePriceForQuantity());
    }
}

public class program4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the quantity: ");
        int quantity = scanner.nextInt();
        Item itemObj = new Item(quantity);
        itemObj.displayItemdetails();
    }
}