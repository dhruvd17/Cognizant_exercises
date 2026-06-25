public class Main {

    public static void main(String[] args) {

        Product[] productList = {
                new Product(104, "Keyboard", "Electronics"),
                new Product(101, "Laptop", "Electronics"),
                new Product(105, "Shoes", "Fashion"),
                new Product(103, "Watch", "Accessories"),
                new Product(102, "Phone", "Electronics")
        };

        Product[] orderedProducts = {
                new Product(101, "Laptop", "Electronics"),
                new Product(102, "Phone", "Electronics"),
                new Product(103, "Watch", "Accessories"),
                new Product(104, "Keyboard", "Electronics"),
                new Product(105, "Shoes", "Fashion")
        };

        int searchId = 103;

        Product linearSearchResult =
                SearchOperations.linearSearch(productList, searchId);

        Product binarySearchResult =
                SearchOperations.binarySearch(orderedProducts, searchId);

        System.out.println("Linear Search Output:");
        System.out.println(linearSearchResult);

        System.out.println("Binary Search Output:");
        System.out.println(binarySearchResult);
    }
}