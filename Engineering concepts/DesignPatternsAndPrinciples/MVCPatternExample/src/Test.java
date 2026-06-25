public class Test {

    public static void main(String[] args) {

        Student learner =
                new Student(101, "Neer Malik", "A");

        StudentView display =
                new StudentView();

        StudentController studentManager =
                new StudentController(
                        learner,
                        display
                );

        System.out.println(
                "Student Details Before Update:"
        );

        studentManager.updateView();

        studentManager.setStudentName(
                "Dhruv Kumar"
        );

        studentManager.setStudentGrade(
                "A+"
        );

        System.out.println(
                "\nStudent Details After Update:"
        );

        studentManager.updateView();
    }
}