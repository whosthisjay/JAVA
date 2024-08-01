package Exception.Practical3;
// Custom exception for age not within the valid range
class AgeNotWithinRangeException extends Exception {
    public AgeNotWithinRangeException(String message) {
        super(message);
    }
}
// Custom exception for invalid name
class NameNotValidException extends Exception {
    public NameNotValidException(String message) {
        super(message);
    }
}

// Student class with attributes roll no, name, age, and course
class Student {
    private int rollNo;
    private String name;
    private int age;
    private String course;

    // Parameterized constructor
    public Student(int rollNo, String name, int age, String course) throws AgeNotWithinRangeException, NameNotValidException {
        if (age < 15 || age  > 21) {
            throw new AgeNotWithinRangeException("Age is not within the range of 15 to 21.");
        }
        if (!isValidName(name)) {
            throw new NameNotValidException("Name contains numbers or special symbols.");
        }
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.course = course;
    }

    // Method to check if the name is valid (only contains alphabets)
    private boolean isValidName(String name) {
        boolean matches = name.matches("[a-zA-Z]+");
        return matches;
    }

    // Getters and toString method for displaying student details
    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCourse() {
        return course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", course='" + course + '\'' +
                '}';
    }
}
