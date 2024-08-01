package Exception.Practical3;

// Main class to test the Student class
public class Main {
    public static void main(String[] args) {
        try {
            // Valid student
            Student student1 = new Student(1, "Alice", 20, "Computer Science");
            System.out.println(student1);

//            // Invalid age
            Student student2 = new Student(2, "Jay", 19, "Mathematics");
            System.out.println(student2);

            // Invalid name
            Student student3 = new Student(3, "Charlie123", 19, "Physics");
            System.out.println(student3);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}