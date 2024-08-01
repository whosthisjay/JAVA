package Basic;

import java.util.Scanner;

public class Vowel {
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.print("Enter Alphabet :");
     char ch=sc.next().charAt(0);
     if(ch=='A' || ch=='a' || ch=='E' || ch=='e' || ch=='I' || ch=='i' || ch=='o' || ch=='O' || ch=='u' || ch=='U'){
         System.out.print(ch+ " is Vowel");
     }
     else{
         System.out.print("Not Vowel");
     }
    }
}
