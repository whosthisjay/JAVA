//Write a program which will ask the user to enter his/her marks(out of 100).
// Define a method that will display grades according to the marks entered as below :
// 90-100 : A
// 71-90 : B
// 61-70 : C
// 51-60 : D
// 41-50 : DD
// 1-40 : Fail

package Basic;
import java.util.Scanner;
public class Grade {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Marks : ");
        float marks=sc.nextFloat();
       message(marks);
    }
      static void message (float marks){
        if(marks<=100&&marks>90){
            System.out.println("You Got A");
        }else if(marks>=70 && marks<=90){
            System.out.println("You Got B");
        }else if(marks>60 && marks<=70){
            System.out.println("You Got C");
        }else if(marks>50 && marks<=60){
            System.out.println("You Got D");
        }else if(marks>40 && marks<=50){
            System.out.println("You Got DD");
        }else{
            System.out.println("Fail");
        }
    }
}
