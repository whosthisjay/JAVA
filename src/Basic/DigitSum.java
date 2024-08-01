package Basic;
import java.util.Scanner;
public class DigitSum {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number : ");
        int number=sc.nextInt();
        System.out.println("The Sum of all Digits of Number ("+number+") : "+sum1(number));

    }
    static int sum(int number){
        //using recursion
    return number==0?0:number%10+sum(number/10);
    }

    static int sum1(int number){
        //using loop
        int sum=0;
        while(number!=0){
            sum+=(number%10);
            number/=10;
        }
        return sum;
    }
}
