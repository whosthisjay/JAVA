package Basic;

import java.util.Scanner;

public class SwapWithoutThirdVariable {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a,b;
        System.out.print("Enter number 1 : ");
        a=sc.nextInt();
        System.out.print("Enter number 2 : ");
        b=sc.nextInt();
        System.out.println("Before Swap : ");
        System.out.println("A : "+a);
        System.out.println("B : "+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After Swap : ");
        System.out.println("A : "+a);
        System.out.println("B : "+b);
    }

}
