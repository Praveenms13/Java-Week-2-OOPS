import java.util.*;

class Product {
    String name;

    Product(String name) {
        this.name = name;
    }
}

class Customer {
    String name;

    Customer(String name) {
        this.name = name;
    }

    void placeOrder(Order order) {
        System.out.println(name + " placed an order.");
    }
}

class Order {
    Customer customer;
    List<Product> products = new ArrayList<>();

    Order(Customer customer) {
        this.customer = customer;
    }

    void addProduct(Product p) {
        products.add(p);
    }

    void showOrder() {
        System.out.println("Order for: " + customer.name);
        for (Product p : products) System.out.println(p.name);
    }
}
