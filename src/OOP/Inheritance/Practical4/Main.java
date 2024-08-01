package OOP.Inheritance.Practical4;
//Create a class named 'Rectangle' with two data members 'length' and 'breadth'
//And two methods to print area and perimeter of Rectangle respectively
//It's constructor having parameters for length and breadth  is used to initialize the length and breadth of Rectangle
//Let class 'Square' inherit the 'Rectangle' class with its constructor having a parameter for it's side(Suppose s)
//calling the constructor of its parent class as 'super(s,s)'
//Print the area and perimeter of rectangle and square

//Rectangle Class
class Rectangle {
    //Data Members
    protected int length;
    protected int breadth;

    //constructor class to initialize length and breadth
    public Rectangle(int length ,int breadth){
        this.length=length;
        this.breadth=breadth;
    }

    //Method to print Area
    public void printArea(){
        int area=length*breadth;
        System.out.println("Area :"+area);
    }

    //Method to print Perimeter
    public void printPerimeter(){
        int perimeter=2*(length+breadth);
        System.out.println("Perimeter : "+perimeter);
    }
}

//Square class inherits from Rectangle
class Square extends Rectangle{
    //Constructor to initialize the side of the Square
    Square(int side){
        //call the parent class constructor
        //i.e. Rectangle(length,breadth)
        super(side,side);
    }
}

//Main class to test the functionality of Rectangle and Square classes
public class Main{
    public static void main(String[] args){
        //Create a Rectangle object r
        Rectangle r= new Rectangle(7,8);
        System.out.println("For Rectangle : ");
        //Print the area and perimeter of Rectangle
        r.printArea();
        r.printPerimeter();

        //Create a Square object s
        Square s= new Square(5);
        System.out.println("For Square : ");
        //Print the area and perimeter of Square
        s.printArea();
        s.printPerimeter();
    }
}

// This code is contributed by Parmar Jay
