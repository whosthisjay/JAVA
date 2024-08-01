package Exception.Practical1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Value 1 : ");
        int value1=sc.nextInt();
        System.out.print("Enter Value 2 : ");
        int value2=sc.nextInt();
        try{
            int div = value1/value2;
            System.out.println("Division of "+value1+"/"+value2+" = " +div);
        }
        catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }

    }
}
