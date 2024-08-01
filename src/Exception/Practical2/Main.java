package Exception.Practical2;
import java.util.Scanner;
public class Main {
    public static void validate(int age) throws Exception{
        if(age<18){
            throw new AgeException("You are Minor");
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Age : ");
        int age=sc.nextInt();
        try{
            validate(age);
            System.out.println("You are eligible for Driver's License");
    }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
