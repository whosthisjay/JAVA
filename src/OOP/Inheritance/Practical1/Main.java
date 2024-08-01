package OOP.Inheritance.Practical1;
//Write a Java program to create a base class Sports with a method called play().
// Create three subclasses: Football, Basketball, and Rugby.
// Override the play() method in each subclass to play a specific statement for each sport.
 class Sports {
    void play(){
        System.out.println("Play the game");
    }
}

class Footbal extends Sports{
  @Override
    void play(){
      System.out.println("Play Football");
    }
}

class Basketball extends Sports{
    @Override
    void play(){
        System.out.println("Play Basketballl");
    }
}

class Rugby extends Sports{
    @Override
    void play(){
        System.out.println("Play Rugby");
    }
}

public class Main{
    public static void main(String[] args) {
        Sports sports=new Sports();
        Sports basketball=new Basketball();
        Sports rugby=new Rugby();
        Sports footbal=new Footbal();
        sports.play();
        footbal.play();
        rugby.play();
        basketball.play();
    }
}