public class Main {

    public static void main(String[] args) {

        Book[] libraryBooks = {
                new Book(103, "Data Structures", "Mark Allen"),
                new Book(101, "Java Programming", "James Gosling"),
                new Book(105, "Operating Systems", "Abraham Silberschatz"),
                new Book(102, "Computer Networks", "Andrew Tanenbaum"),
                new Book(104, "Database Systems", "Henry Korth")
        };

        Book[] orderedBooks = {
                new Book(102, "Computer Networks", "Andrew Tanenbaum"),
                new Book(103, "Data Structures", "Mark Allen"),
                new Book(104, "Database Systems", "Henry Korth"),
                new Book(101, "Java Programming", "James Gosling"),
                new Book(105, "Operating Systems", "Abraham Silberschatz")
        };

        String searchTitle = "Java Programming";

        Book linearSearchResult =
                SearchOperations.linearSearch(
                        libraryBooks,
                        searchTitle
                );

        Book binarySearchResult =
                SearchOperations.binarySearch(
                        orderedBooks,
                        searchTitle
                );

        System.out.println("Result Using Linear Search:");
        System.out.println(linearSearchResult);

        System.out.println("\nResult Using Binary Search:");
        System.out.println(binarySearchResult);
    }
}