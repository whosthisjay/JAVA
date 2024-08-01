package OOP.Encapsulation.Practical2;
//Write a Java program to create a class called Rectangle with private instance variables length and width.
// Provide public getter and setter methods to access and modify these variables.
public class Main {
    public static void main(String[] args) {
        Rectangle rectangle =new Rectangle();
        rectangle.setBreadth(8);
        rectangle.setLength(6);
        int length,breadth;
        length=rectangle.getLength();
        breadth=rectangle.getBreadth();
        System.out.println("Length : "+length+"\nBreadth : "+breadth);
    }
}
class Rectangle{
    private int length;
    private int breadth;
    public int getLength(){
        return length;
    }
    public void setLength(int length){
        this.length=length;
    }
    public int getBreadth(){
        return breadth;
    }
    public void setBreadth(int breadth){
        this.breadth=breadth;
    }
}