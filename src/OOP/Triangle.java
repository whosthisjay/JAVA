package OOP;
//Write a program to print the area and perimeter of triangle having sides 3,4,5
//By creating a class named 'Triangle' without any parameters in its constructor.

public class Triangle {
    final int side1;
    final int side2;
    final int side3;

    public Triangle(){
        this.side1=3;
        this.side2=4;
        this.side3=5;
    }
    public void printPerimeter(){
        int perimeter =side1+side2+side3;
        System.out.println("Perimeter of Triangle : "+perimeter);
    }

    public void printArea(){
        float semiPerimeter = (side1+side2+side3)/2;
        double area = Math.sqrt(semiPerimeter*(semiPerimeter-side1)*(semiPerimeter-side2)*(semiPerimeter-side3));
        System.out.println("Area of Tringle : "+area);
    }

}
class Main2{
    public static void main(String[] args){
        Triangle t=new Triangle();
        t.printArea();
        t.printPerimeter();
    }

}

// This code is contributed by Parmar Jay
