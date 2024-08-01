package OOP.Interface.Practical2;

public class Rectangle implements Shape{
    private int length;
    private int breadth;

    Rectangle(int length,int breadth){
        this.length=length;
        this.breadth=breadth;
    }
   @Override
     public void getArea(){
       System.out.println("Length of Rectangle : "+length);
       System.out.println("Breadth of Rectangle : "+breadth);
       System.out.println("Area of Rectangle : "+(length*breadth));
    }

}
