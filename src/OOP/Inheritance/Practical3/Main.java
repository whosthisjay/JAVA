//Create a class with a method that prints "This is a Parent class".
//And it's subclass with a method that prints "This is Child Class".
//Now create an object for each of the class.
//call 1 -- method of parent class by object of parent class
//call 2 -- method of child class by object of child class
//call 3 -- method of parent class by object of child class

package OOP.Inheritance.Practical3;

class ParentClass {
    public void parentMessage(){
        System.out.println("This is a Parent class");
    }
}
class ChildClass extends ParentClass{
    public void childMessage(){
        System.out.println("This is a Child class");
    }
}

public class Main{
    public static void main(String[] args){
        ParentClass p =new ParentClass();
        p.parentMessage();

        ChildClass c=new ChildClass();
        c.childMessage();
        c.parentMessage();
    }
}
// This code is contributed by Parmar Jay

