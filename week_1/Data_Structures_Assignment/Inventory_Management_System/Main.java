public class Main {

    public static void main(String[] args) {

        InventoryManager manager = new InventoryManager();

        Product p1 = new Product(101, "Laptop", 20, 50000);
        Product p2 = new Product(102, "Mouse", 50, 500);
        Product p3 = new Product(103, "Keyboard", 30, 1500);

        manager.addProduct(p1);
        manager.addProduct(p2);
        manager.addProduct(p3);

        System.out.println("\nInventory:");
        manager.displayInventory();

        manager.updateProduct(101, 25, 52000);

        System.out.println("\nAfter Update:");
        manager.displayInventory();

        manager.deleteProduct(102);

        System.out.println("\nAfter Delete:");
        manager.displayInventory();
    }
}