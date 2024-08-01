package OOP.Abstraction.Practical3;

public abstract class Shape {
    public abstract void  calculateArea();
    public abstract void calculatePerimeter();
}
class Circle extends Shape{
    private float radius;
    final float PI=3.14f;
    Circle(float radius){
        this.radius=radius;
    }
   public void calculateArea(){
       System.out.println("Area of Circle : "+PI*radius*radius);
    }
    public void calculatePerimeter(){
        System.out.println("Perimeter of a Circle : ");
    }
}

class Triangle extends Shape{
    private  int area;
    private int base;
    Triangle(int area , int base){
        this.area=area;
        this.base=base;
    }

    public void calculateArea(){
        System.out.println("Area of a Triangle : "+0.5*area*base);
    }
    public void calculatePerimeter(){
        System.out.println("Perimeter of a Triangle : ");
    }
}
