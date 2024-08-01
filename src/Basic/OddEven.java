package Basic;
import java.util.Scanner;
public class OddEven {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number to check if it is even or odd : ");
        int number=sc.nextInt();
        String result=(number%2==0)?"The number is Even " :"The number is Odd.";
        System.out.println(result);

    }
}
