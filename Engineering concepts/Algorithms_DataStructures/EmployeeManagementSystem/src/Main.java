public class Main {

    public static void main(String[] args) {

        Order[] firstSet = {
                new Order(101, "Aman", 3500),
                new Order(102, "Neha", 1200),
                new Order(103, "Rohan", 5600),
                new Order(104, "Priya", 2800)
        };

        Order[] secondSet = {
                new Order(101, "Aman", 3500),
                new Order(102, "Neha", 1200),
                new Order(103, "Rohan", 5600),
                new Order(104, "Priya", 2800)
        };

        System.out.println("Orders Sorted Using Bubble Sort:");

        SortOperations.bubbleSort(firstSet);
        SortOperations.displayOrders(firstSet);

        System.out.println("\nOrders Sorted Using Quick Sort:");

        int startIndex = 0;
        int endIndex = secondSet.length - 1;

        SortOperations.quickSort(
                secondSet,
                startIndex,
                endIndex
        );

        SortOperations.displayOrders(secondSet);
    }
}