//Create a class named 'Shape' with a method to print "This is Shape Class"
//Then create two other classes named 'Rectangle' and 'Circle' inheriting the Shape Class
//Create a subclass "Square" of "Rectangle" having a method to print "Square is Rectangle"
//Now call the method of 'Shape' and 'Rectangle' class by the object of 'Square' class
package OOP.Inheritance.Practical5;

class Shape {
    void messsageShape(){
        System.out.println("This is Shape Class");
    }
}

class Circle extends Shape{
    void messageCircle(){
        System.out.println("This is Circle");
    }
}

class Rectangle extends Shape{
    void messageRectangle(){
        System.out.println("This is Rectangle");
    }
}
class Sqr extends Rectangle{
    void messageSquare(){
        System.out.println("Square is Rectangle");
    }
}

public class Main{
    public static void main(String[] args){
        Sqr s= new Sqr();
        s.messageSquare();
        s.messageRectangle();
        s.messsageShape();

    }
}