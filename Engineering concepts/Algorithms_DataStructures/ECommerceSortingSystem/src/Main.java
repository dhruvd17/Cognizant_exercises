public class Main {

    public static void main(String[] args) {

        Order[] bubbleOrders = {
                new Order(101, "Aman", 3500),
                new Order(102, "Neha", 1200),
                new Order(103, "Rohan", 5600),
                new Order(104, "Priya", 2800)
        };

        Order[] quickOrders = {
                new Order(101, "Aman", 3500),
                new Order(102, "Neha", 1200),
                new Order(103, "Rohan", 5600),
                new Order(104, "Priya", 2800)
        };

        System.out.println("Bubble Sort Output:");

        SortOperations.bubbleSort(bubbleOrders);
        SortOperations.displayOrders(bubbleOrders);

        System.out.println("\nQuick Sort Output:");

        SortOperations.quickSort(
                quickOrders,
                0,
                quickOrders.length - 1
        );

        SortOperations.displayOrders(quickOrders);
    }
}