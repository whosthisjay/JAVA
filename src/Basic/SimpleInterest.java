package Basic;
import java.util.Scanner;
public class SimpleInterest {
    public static  void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter P :");
    float p=sc.nextFloat();
    System.out.print("Enter T :");
    int t= sc.nextInt();
    System.out.print("Eneter R :");
        float r=sc.nextFloat();
        float si=(p*t*r)/100;
        System.out.print("Simple Interst : "+si);
    }
}
