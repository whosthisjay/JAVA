package OOP.Interface.Practical2;

public class Circle implements Shape{
    final private float PI=3.14f;
    private double radius;
    Circle(double radius){
        this.radius=radius;
    }
   @Override
    public void getArea(){
       System.out.println("Radius : "+radius);
       System.out.println("Area of a Circle : "+(PI*radius*radius));
    }
}
