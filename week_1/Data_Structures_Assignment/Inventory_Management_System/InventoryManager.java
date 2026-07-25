import java.util.HashMap;

public class InventoryManager {

    HashMap<Integer, Product> inventory = new HashMap<>();

    public void addProduct(Product product) {
        inventory.put(product.productId, product);
        System.out.println("Product Added Successfully");
    }

    public void updateProduct(int id, int quantity, double price) {
        Product product = inventory.get(id);

        if (product != null) {
            product.quantity = quantity;
            product.price = price;
            System.out.println("Product Updated Successfully");
        } else {
            System.out.println("Product Not Found");
        }
    }

    public void deleteProduct(int id) {
        if (inventory.containsKey(id)) {
            inventory.remove(id);
            System.out.println("Product Deleted Successfully");
        } else {
            System.out.println("Product Not Found");
        }
    }

    public void displayInventory() {
        for (Product product : inventory.values()) {
            product.display();
        }
    }
}