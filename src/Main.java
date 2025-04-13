import com.ecommerce.*; 
import com.ecommerce.orders.*;

public class Main {
    public static void main(String[] args) {
        Product p1 = new Product(1, "Electric Blender", 200.00);
        Product p2 = new Product(2, "Microwave", 350.00);

        Customer customer = new Customer(101, "Emmanuella Klutse");
        customer.addToCart(p1);
        customer.addToCart(p2);

        System.out.println("Customer: " + customer.getName() + "\nShopping Cart:");
        for (Product p : customer.getShoppingCart()) {
            System.out.println(p);
        }

        System.out.println("Total: $" + customer.calculateTotal());
        Order order = new Order(1001, customer, customer.getShoppingCart());
        order.displayOrderSummary();
    }
}

