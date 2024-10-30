package org.example;

import org.example.dao.StudentDAO;
import org.example.model.Address;
import org.example.model.Student;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentDAO studentDAO = new StudentDAO();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Choose an option:");
            System.out.println("1. Create Student");
            System.out.println("2. Read Student");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. View All Students");
            System.out.println("6. Exit");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    // Create a new Address
                    System.out.print("Enter street: ");
                    String street = scanner.nextLine();
                    System.out.print("Enter city: ");
                    String city = scanner.nextLine();
                    System.out.print("Enter state: ");
                    String state = scanner.nextLine();
                    System.out.print("Enter zip code: ");
                    String zipCode = scanner.nextLine();
                    Address address = new Address(street, city, state, zipCode);

                    // Create a new Student with Address
                    System.out.print("Enter student name: ");
                    String studentName = scanner.nextLine();
                    Student student = new Student(studentName, address);
                    studentDAO.createStudent(student);
                    System.out.println("Student created with ID: " + student.getStudentId());
                    break;

                case 2:
                    // Read
                    System.out.print("Enter student ID to read: ");
                    int studentIdToRead = scanner.nextInt();
                    Student retrievedStudent = studentDAO.readStudent(studentIdToRead);
                    if (retrievedStudent != null) {
                        Address retrievedAddress = retrievedStudent.getAddress(); // Get the Address object
                        System.out.println("Retrieved Student: " + retrievedStudent.getStudentName() +
                                ", Address: " + retrievedAddress.getStreet() +
                                ", City: " + retrievedAddress.getCity() +
                                ", State: " + retrievedAddress.getState() +
                                ", Zip Code: " + retrievedAddress.getZipCode());
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;

                case 3:
                    // Update
                    System.out.print("Enter student ID to update: ");
                    int studentIdToUpdate = scanner.nextInt();
                    Student studentToUpdate = studentDAO.readStudent(studentIdToUpdate);

                    if (studentToUpdate != null) {
                        // Get new values from user input
                        System.out.print("Enter new student name: ");
                        String newName = scanner.next();

                        // Optionally, you can also update address details
                         address = studentToUpdate.getAddress();
                        System.out.print("Enter new street: ");
                        String newStreet = scanner.next();
                        System.out.print("Enter new city: ");
                        String newCity = scanner.next();
                        System.out.print("Enter new state: ");
                        String newState = scanner.next();
                        System.out.print("Enter new zip code: ");
                        String newZipCode = scanner.next();

                        // Update fields
                        studentToUpdate.setStudentName(newName);
                        address.setStreet(newStreet);
                        address.setCity(newCity);
                        address.setState(newState);
                        address.setZipCode(newZipCode);

                        // Call the update method
                        studentDAO.updateStudent(studentToUpdate);

                        System.out.println("Student updated successfully.");
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;


                case 4:
                    // Delete
                    System.out.print("Enter student ID to delete: ");
                    int studentIdToDelete = scanner.nextInt();
                    studentDAO.deleteStudent(studentIdToDelete);
                    System.out.println("Student deleted.");
                    break;

                case 5:
                    // View All Students
                    List<Student> allStudents = studentDAO.getAllStudents();
                    if (allStudents.isEmpty()) {
                        System.out.println("No students found.");
                    } else {
                        System.out.println("List of Students:");
                        for (Student s : allStudents) {
                            Address addr = s.getAddress();  // Get the Address for each Student
                            System.out.println("ID: " + s.getStudentId() +
                                    ", Name: " + s.getStudentName() +
                                    ", Address: " + addr.getStreet() + ", " +
                                    addr.getCity() + ", " +
                                    addr.getState() + ", " +
                                    addr.getZipCode());
                        }
                    }
                    break;

                case 6:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        } while (choice != 6);

        scanner.close();
    }
}
