package com.ecommerce.orders;
import com.ecommerce.Customer;
import com.ecommerce.Product;
import java.util.List;

public class Order {
    private int orderID;
    private Customer customer;
    private List<Product> products;
    private double total;

    public Order(int orderID, Customer customer, List<Product> products) {
        this.orderID = orderID;
        this.customer = customer;
        this.products = products;
        this.total = products.stream().mapToDouble(Product::getPrice).sum();
    }

    public void displayOrderSummary() {
        System.out.println("Order ID: " + orderID);
        System.out.println("Customer: " + customer.getName());
        System.out.println("Products:");
        for (Product product : products) {
            System.out.println(" - " + product);
        }
        System.out.println("Total: $" + total);
    }
}
