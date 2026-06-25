public class Main {

    public static void main(String[] args) {

        TaskLinkedList projectTasks = new TaskLinkedList();

        projectTasks.addTask(
                new Task(101, "Design Database", "Pending"));

        projectTasks.addTask(
                new Task(102, "Develop API", "In Progress"));

        projectTasks.addTask(
                new Task(103, "Test Application", "Pending"));

        System.out.println("Current Tasks:");
        projectTasks.traverseTasks();

        System.out.println("\nSearching for Task 102:");

        Task foundTask = projectTasks.searchTask(102);

        if (foundTask != null) {
            System.out.println(foundTask);
        } else {
            System.out.println("No matching task found.");
        }

        System.out.println("\nRemoving Task 102...");
        projectTasks.deleteTask(102);

        System.out.println("\nTasks After Deletion:");
        projectTasks.traverseTasks();
    }
}