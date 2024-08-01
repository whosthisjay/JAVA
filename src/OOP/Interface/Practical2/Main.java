package OOP.Interface.Practical2;
//Write a Java program to create an interface Shape with the getArea() method.
//Create three classes Rectangle, Circle, and Triangle that implement the Shape interface. Implement the getArea() method for each of the three classes.
public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(8d);
        Shape rectangle =new Rectangle(7,8);
        circle.getArea();
        rectangle.getArea();
    }
}
