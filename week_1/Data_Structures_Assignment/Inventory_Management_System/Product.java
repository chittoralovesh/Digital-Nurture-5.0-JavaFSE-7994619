public class Product {

    int productId;
    String productName;
    int quantity;
    double price;

    public Product(int productId, String productName, int quantity, double price) {
        this.productId = productId;
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }

    public void display() {
        System.out.println("    Product Details:");
        System.out.print("  Product ID: " + productId);
        System.out.print("  Product Name: " + productName);
        System.out.print("  Quantity: " + quantity);
        System.out.print("  Price: " + price);
        System.out.println();
    }
}