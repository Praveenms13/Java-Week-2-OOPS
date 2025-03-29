interface Discountable {
    void applyDiscount(double percentage);

    String getDiscountDetails();
}

abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;

    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public abstract double calculateTotalPrice();

    public void getItemDetails() {
        System.out.println("Item: " + itemName);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price >= 0)
            this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }
}

class VegItem extends FoodItem implements Discountable {
    private double discount = 0;

    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        return (getPrice() * getQuantity()) - discount;
    }

    @Override
    public void applyDiscount(double percentage) {
        discount = (getPrice() * getQuantity()) * percentage / 100;
    }

    @Override
    public String getDiscountDetails() {
        return "Discount applied on Veg Item.";
    }
}

class NonVegItem extends FoodItem implements Discountable {
    private double discount = 0;

    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        double extraCharge = 20;
        return (getPrice() * getQuantity() + extraCharge) - discount;
    }

    @Override
    public void applyDiscount(double percentage) {
        discount = (getPrice() * getQuantity()) * percentage / 100;
    }

    @Override
    public String getDiscountDetails() {
        return "Discount applied on Non-Veg Item.";
    }
}

public class FoodDeliverySystem {
    public static void main(String[] args) {
        FoodItem[] order = {
                new VegItem("Paneer Tikka", 200, 2),
                new NonVegItem("Chicken Biryani", 300, 1)
        };

        for (FoodItem item : order) {
            item.getItemDetails();

            if (item instanceof Discountable) {
                Discountable d = (Discountable) item;
                d.applyDiscount(10);
                System.out.println(d.getDiscountDetails());
            }

            System.out.println("Total Price: " + item.calculateTotalPrice());
            System.out.println("--------------------------");
        }
    }
}
