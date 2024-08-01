package OOP.Abstraction.Practical2;

public abstract class Animal {
    abstract void sound();
}

class Lion extends Animal{
    public void sound(){
        System.out.println("Lion Roars");
    }
}
class Tiger extends Animal{
    public void sound(){
        System.out.println("Tiger Roars");
    }

}