# Ecommerce-Project
# 🛒 Simple E-commerce System

## 📦 Project Overview
This project is a simple **E-commerce System** implemented in **Java** using packages. It allows customers to browse products, add them to a shopping cart, and place orders. It demonstrates basic object-oriented principles and package management in Java.

---

## 🧱 Package Structure

com.ecommerce/ ├── Product.java # Represents a product with ID, name, and price ├── Customer.java # Represents a customer with a shopping cart

com.ecommerce.orders/ └── Order.java # Represents an order with ID, customer info, and products

Main.java # Main program to demonstrate system functionality

yaml
Copy
Edit

---

## 🎯 Features
- Create and view products (e.g., Electric Blender, Microwave)
- Add/remove products from the customer's shopping cart
- Calculate total cost of cart
- Place orders and generate order summaries

---

## 🚀 How to Run the Program

1. **Open the project in VS Code**
2. Ensure your directory structure matches the package names
3. Compile the classes:
   ```bash
   javac com/ecommerce/*.java com/ecommerce/orders/*.java Main.java
Run the main program:

bash
Copy
Edit
java Main
✅ Example Output
yaml
Copy
Edit
Customer: Emmanuella Klutse
Shopping Cart:
ProductID: 1, Name: Electric Blender, Price: $200.0
ProductID: 2, Name: Microwave, Price: $350.0
Total: $550.0

--- Order Summary ---
Order ID: 3001
Customer: Emmanuella Klutse
Products:
  - Electric Blender ($200.0)
  - Microwave ($350.0)
Total Amount: $550.0
Status: Pending
