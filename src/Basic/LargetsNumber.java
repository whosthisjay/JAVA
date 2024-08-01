package Basic;
import java.util.Scanner;
public class LargetsNumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number 1 : ");
        int a=sc.nextInt();
        System.out.print("Enter number 2 : ");
        int b=sc.nextInt();
        System.out.print("Enter Number 3 : ");
        int c=sc.nextInt();
        int answer=big(a,b,c);
        System.out.print("Largest among three number : ");
        System.out.print(a+" "+b+" "+c);
        System.out.print(" >>>> "+answer);
    }
    static int big(int a,int b,int c){
//       return (a>b)?(a>c?a:c):(b>c?b:c);
        return (a>b)?Math.max(a,c):Math.max(b,c);

    }
}
