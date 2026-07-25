public class Main {

    public static void main(String[] args) {

        Product[] products = {
                new Product(101, "Laptop", "Electronics"),
                new Product(102, "Mouse", "Accessories"),
                new Product(103, "Keyboard", "Accessories"),
                new Product(104, "Phone", "Electronics"),
                new Product(105, "Shoes", "Fashion")
        };

        Product result1 = SearchEngine.linearSearch(products, 103);

        System.out.println("Linear Search Result:");
        if (result1 != null) {
            result1.display();
        } else {
            System.out.println("Product Not Found");
        }

        Product result2 = SearchEngine.binarySearch(products, 104);

        System.out.println("Binary Search Result:");
        if (result2 != null) {
            result2.display();
        } else {
            System.out.println("Product Not Found");
        }
    }
}