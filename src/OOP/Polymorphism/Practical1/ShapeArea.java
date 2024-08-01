//Create a class to print the area of square and rectangle.
//The class has two methods with the same name but different number of parameters.
//The method for printing area of Rectangle has two parameters which are length and breadth respectively
//While the other method for printing area of square has only one parameter which is side of square


package OOP.Polymorphism.Practical1;
public class ShapeArea {
    public void printArea(int side){
        System.out.println("____________________");
        System.out.println("Square ");
        System.out.println("Side: "+side);
        System.out.println("Area of Square : "+side*side);
        System.out.println("____________________");

    }

    //Here concept of method overloading is applied
    public void printArea(int length,int breadth){
        System.out.println("Rectangle ");
        System.out.println("length : "+length);
        System.out.println("Breadth :"+breadth);
        System.out.println("Area of Rectangle : "+length*breadth);
        System.out.println("____________________");
    }

    public static void main(String[] args){
        ShapeArea s=new ShapeArea();
        s.printArea(8);
        s.printArea(8,9);
    }
}
// This code is contributed by Parmar Jay
