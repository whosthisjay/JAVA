package Basic;
// Java Program to find first and last
// digits of a number
import java.util.Scanner;
//import java.lang.*;

public class FirstAndLastDigitSum {
    // driver function
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter Number : ");
    int number=sc.nextInt();
    System.out.print("Sum of First and Last Digit of Number : "+number);
    int answer= 0;   //Initialising answer

    if(number<10){
         answer=number;
    }
    else{
        answer= sum(number);

    }
    System.out.print(" is "+answer);
    }

    static int sum(int number){
        int a=firstDigit(number);
        int b=lastDigit(number);
        return a+b;
    }

    // Find the first digit
    static int firstDigit(int number){
        // Remove last digit from numbers
        // till only one digit is left
        while(number>=10){
            number/=10;
        }
        //Return first digit
        return number;
    }

    // Find the last digit
    static int lastDigit(int number){
        //return 0 if number is 0
        // return the last digit
        return number==0?0:number%10;
    }
}
// This code is contributed by Parmar Jay
