package OOP.Abstraction.Practical3;
//Write a Java program to create an abstract class Shape with abstract methods calculateArea() and calculatePerimeter().
//Create subclasses Circle and Triangle that extend the Shape class and implement the respective methods to calculate the area and perimeter of each shape.
public class Main {
    public static void main(String[] args){
      Shape circle=new Circle(5);
      Shape triangle =new Triangle(6,7);
      circle.calculateArea();
      triangle.calculateArea();
    }
}
