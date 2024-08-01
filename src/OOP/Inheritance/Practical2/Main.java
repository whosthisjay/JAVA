package OOP.Inheritance.Practical2;
//Write a Java program to create a class Employee with a method called calculateSalary().
// Create two subclasses Manager and Programmer.
// In each subclass, override the calculateSalary() method to calculate and return the salary based on their specific roles.
public class Main {
    public static void main(String[] args) {
    Employee employee=new Employee();
    Employee programmer = new Programmer();
    Employee manager = new Manager();

    employee.calculateSalary();
    programmer.calculateSalary();
    manager.calculateSalary();
    }
}
class Employee{
    void calculateSalary(){
        System.out.println("Employee Salary");
    }
}
class Manager extends Employee{
    @Override
    void calculateSalary(){
        System.out.println("Employee Salary");
    }
}
class Programmer extends Employee{
    @Override
    void calculateSalary(){
        System.out.println("Programmer Salary");
    }
}