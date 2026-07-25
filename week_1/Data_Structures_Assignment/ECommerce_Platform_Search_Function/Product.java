public class Product {

    int productId;
    String productName;
    String category;

    public Product(int productId, String productName, String category) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
    }

    public void display() {
        System.out.println("Product Details:");
        System.out.print("  Product ID: " + productId);
        System.out.print("  Product Name: " + productName);
        System.out.print("  Category: " + category);
        System.out.println();
    }
}